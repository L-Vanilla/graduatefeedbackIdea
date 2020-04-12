/**/
package com.hebeu.graduatefeedback.pojo;

import lombok.Data;

@Data
public class MyPage {
    private Integer pageNo=1;
    private Integer pageSize=10;
    /*
    *   是否需要分页  1 是  0 否
    *
    * */
    private Integer withPage=1;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getWithPage() {
        return withPage;
    }

    public void setWithPage(Integer withPage) {
        this.withPage = withPage;
    }
}
