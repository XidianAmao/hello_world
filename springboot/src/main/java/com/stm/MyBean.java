package com.stm;

import org.springframework.statemachine.annotation.OnTransition;
import org.springframework.statemachine.annotation.WithStateMachine;

/**
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2019-09-23 21:45
 */
@WithStateMachine
public class MyBean {
    @OnTransition(target = "STATE1")
    void toState1() {
    }

    @OnTransition(target = "STATE2")
    void toState2() {
    }
}
