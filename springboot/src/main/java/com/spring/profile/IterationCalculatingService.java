package com.spring.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2019-09-18 20:07
 */
@Service
@Profile("Java7")
public class IterationCalculatingService implements CalculatingService {
    @Override
    public Integer sum(Integer... value) {
        int sum = 0;
        for (Integer val : value) {
            sum += val;
        }
        System.out.println("java 7 sum,result" + sum);
        return null;
    }
}
