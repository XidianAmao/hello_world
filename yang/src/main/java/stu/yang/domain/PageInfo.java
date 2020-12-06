package stu.yang.domain;


import java.io.Serializable;

public class PageInfo implements Serializable {
    private Integer currentPage;
    private Integer pageSize;
    private Integer totalCount;

    public static PageInfo.PageInfoBuilder builder() {
        return new PageInfo.PageInfoBuilder();
    }

    public PageInfo(Integer currentPage, Integer pageSize, Integer totalCount) {
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
    }

    public PageInfo() {
    }

    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof PageInfo)) {
            return false;
        } else {
            PageInfo other = (PageInfo)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label47: {
                    Object this$currentPage = this.getCurrentPage();
                    Object other$currentPage = other.getCurrentPage();
                    if (this$currentPage == null) {
                        if (other$currentPage == null) {
                            break label47;
                        }
                    } else if (this$currentPage.equals(other$currentPage)) {
                        break label47;
                    }

                    return false;
                }

                Object this$pageSize = this.getPageSize();
                Object other$pageSize = other.getPageSize();
                if (this$pageSize == null) {
                    if (other$pageSize != null) {
                        return false;
                    }
                } else if (!this$pageSize.equals(other$pageSize)) {
                    return false;
                }

                Object this$totalCount = this.getTotalCount();
                Object other$totalCount = other.getTotalCount();
                if (this$totalCount == null) {
                    if (other$totalCount != null) {
                        return false;
                    }
                } else if (!this$totalCount.equals(other$totalCount)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof PageInfo;
    }


    @Override
    public String toString() {
        return "PageInfo(currentPage=" + this.getCurrentPage() + ", pageSize=" + this.getPageSize() + ", totalCount=" + this.getTotalCount() + ")";
    }

    public static class PageInfoBuilder {
        private Integer currentPage;
        private Integer pageSize;
        private Integer totalCount;

        PageInfoBuilder() {
        }

        public PageInfo.PageInfoBuilder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        public PageInfo.PageInfoBuilder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public PageInfo.PageInfoBuilder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public PageInfo build() {
            return new PageInfo(this.currentPage, this.pageSize, this.totalCount);
        }

        @Override
        public String toString() {
            return "PageInfo.PageInfoBuilder(currentPage=" + this.currentPage + ", pageSize=" + this.pageSize + ", totalCount=" + this.totalCount + ")";
        }
    }
}

