package com.guazi.amao.autoconfigure;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author fengguangtong@guazi.com
 * @version 1.0
 * @date 2019-09-23 11:04
 */
public class JsonFormatter implements Formatter {
    private final ObjectMapper objectMapper;

    public JsonFormatter() {
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public String format(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (Exception e){
            throw new IllegalArgumentException(e);
        }
    }
}
