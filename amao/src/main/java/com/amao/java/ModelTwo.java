package com.amao.java;

/**
 * hessian序列化问题
 * 子类的同名元素会在序列化和反序列化之后被父类覆盖
 * https://blog.51cto.com/tianya23/582256
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2019-09-19 14:35
 */
public class ModelTwo extends ModelOne {
    private String name;
}
