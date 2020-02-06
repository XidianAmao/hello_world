package com.spring.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2019-09-18 20:05
 */
@Service
@Profile("Java8")
public class LambdaCalculatingService implements CalculatingService {
    @Override
    public Integer sum(Integer... value) {
        int sum = Stream.of(value).reduce(0, Integer::sum);
        System.out.println("java 8 lambda sum , result:" + sum);
        return sum;
    }
}
