package com.marvin.sysadmin.common;

public abstract class BaseReqParam {

    private Integer currentPage;

    private Integer pageSize;

    public Integer getCurrentPage() {
        return currentPage == null ? 1 : currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize == null ? 10 : pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
