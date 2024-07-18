package com.zero.page;

import java.io.Serializable;

public class CommonPageData implements Serializable {

    private static final long serialVersionUID = -3816145899417021410L;

    private int pageSize;

    private int currentPage;


    public CommonPageData() {
        this.currentPage = 1;
        this.pageSize = 10;
    }

    public CommonPageData(int pageSize, int currentPage) {
        if (currentPage < 1 || pageSize < 1) {
            throw new IllegalArgumentException("currentPage and pageSize > 0.");
        }

        this.pageSize = pageSize;
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
