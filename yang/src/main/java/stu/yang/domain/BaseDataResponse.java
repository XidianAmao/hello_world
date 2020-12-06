package stu.yang.domain;


public class BaseDataResponse<D> extends AbstractBaseResponse {
    private D data;

    public BaseDataResponse() {
    }

    public D getData() {
        return this.data;
    }

    public void setData(D data) {
        this.data = data;
    }
}
