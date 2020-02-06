package com.stm;

import com.stm.plan.PlanStateEnum;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineBuilder;

import java.util.EnumSet;

/**
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2019-09-23 21:14
 */
public class StateBuilder {

    public StateMachine<PlanStateEnum, EventEnum> buildMachine() throws Exception {
        StateMachineBuilder.Builder<PlanStateEnum, EventEnum> builder = StateMachineBuilder.builder();

        builder.configureStates()
                .withStates()
                .initial(PlanStateEnum.CREATE)
                .states(EnumSet.allOf(PlanStateEnum.class));

        builder.configureTransitions()
                .withExternal()
                .source(PlanStateEnum.CREATE).target(PlanStateEnum.AWAIT)
                .event(EventEnum.SUBMIT)
                .and()
                .withExternal()
                .source(PlanStateEnum.CREATE).target(PlanStateEnum.END)
                .event(EventEnum.FINISH);

        return builder.build();
    }
}
