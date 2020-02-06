package com.guazi.amao.autoconfigure;

/**
 * null安全实现
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2019-09-20 15:34
 */
public class DefaultFormatter implements Formatter {
    @Override
    public String format(Object object) {
        return String.valueOf(object);
    }
}
