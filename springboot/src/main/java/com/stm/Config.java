package com.stm;

import com.stm.plan.PlanStateEnum;
import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.config.EnableStateMachine;
import org.springframework.statemachine.config.EnumStateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;

import java.util.EnumSet;

/**
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2019-09-23 21:42
 */
@Configuration
@EnableStateMachine
public class Config extends EnumStateMachineConfigurerAdapter<PlanStateEnum, EventEnum> {

    @Override
    public void configure(StateMachineStateConfigurer<PlanStateEnum, EventEnum> states)
            throws Exception {
        states
                .withStates()
                .initial(PlanStateEnum.CREATE)
                .states(EnumSet.allOf(PlanStateEnum.class));
    }

    @Override
    public void configure(StateMachineTransitionConfigurer<PlanStateEnum, EventEnum> transitions)
            throws Exception {
        transitions
                .withExternal()
                .source(PlanStateEnum.CREATE).target(PlanStateEnum.AWAIT)
                .event(EventEnum.SUBMIT)
                .and()
                .withExternal()
                .source(PlanStateEnum.CREATE).target(PlanStateEnum.END)
                .event(EventEnum.FINISH);
    }
}