package stu.yang.domain;


import java.util.List;

public class ListDataResponse<D> extends AbstractBaseResponse {
    private List<D> list;

    public ListDataResponse() {
    }

    public List<D> getList() {
        return this.list;
    }

    public void setList(List<D> list) {
        this.list = list;
    }
}