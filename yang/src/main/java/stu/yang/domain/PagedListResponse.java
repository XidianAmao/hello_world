package stu.yang.domain;

import java.util.List;

public class PagedListResponse<D> extends AbstractBaseResponse {
    private List<D> list;
    private PageInfo pageInfo;

    public PagedListResponse() {
    }

    public List<D> getList() {
        return this.list;
    }

    public void setList(List<D> list) {
        this.list = list;
    }

    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }
}
