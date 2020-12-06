package stu.yang.domain;


public enum ResponseCodeEnum {
    ResponseCodeEnum_Success(0, "success"),
    ResponseCodeEnum_Fail(1, "fail"),
    EXCEL_VALIDATE_FAIL(2, "EXCEl校验失败"),
    BUSINESS_VALIDATE_FAIL(3, "业务校验失败"),
    ResponseCodeEnum_NOTLogin(50003, "当前用户没有登录"),
    ResponseCodeEnum_NOPermission(50004, "没有权限访问"),
    RESPONSECODEENUM_CODEALREADYEXEC(4, "该单号已存在");

    private int code;
    private String message;

    private ResponseCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
