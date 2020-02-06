package com.stm;

import com.stm.plan.PlanStateEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.statemachine.StateMachine;

/**
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2019-09-23 21:46
 */
public class MyApp {
    @Autowired
    StateMachine<PlanStateEnum, EventEnum> stateMachine;

    void doSignals() {
        stateMachine.start();
        stateMachine.sendEvent(EventEnum.SUBMIT);
        stateMachine.sendEvent(EventEnum.FINISH);
    }
}
