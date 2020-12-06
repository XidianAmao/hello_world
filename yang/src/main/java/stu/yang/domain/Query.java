package stu.yang.domain;


public class Query {
    private int pageSize;
    private int currentPage;
    private int startIndex;

    public int getStartIndex() {
        if (this.currentPage == 0) {
            this.startIndex = 0;
        } else {
            this.startIndex = (this.currentPage - 1) * this.pageSize;
        }

        return this.startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getCurrentPage() {
        return this.currentPage == 0 ? 1 : this.currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public Query() {
    }

    public Query(int currentPage, int pageSize) {
        this.setCurrentPage(currentPage);
        this.setPageSize(pageSize);
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public Query(int pageSize, int currentPage, int startIndex) {
        this.pageSize = pageSize;
        this.currentPage = currentPage;
        this.startIndex = startIndex;
    }
}

