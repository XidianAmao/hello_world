package com.amao.java;

import org.joda.time.DateTime;

/**
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2019-09-17 20:00
 */
public class JodaTimeTest {
    public static void main(String[] args) {
        DateTime now = new DateTime();
        System.out.println(now.getHourOfDay());
    }
}
