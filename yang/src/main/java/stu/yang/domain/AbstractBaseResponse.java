package stu.yang.domain;

import java.io.Serializable;

public class AbstractBaseResponse implements Serializable {
    private int code;
    private String message = "success";

    public AbstractBaseResponse() {
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}