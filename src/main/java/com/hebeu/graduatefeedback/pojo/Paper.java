package com.hebeu.graduatefeedback.pojo;

import com.fasterxml.jackson.core.SerializableString;

import java.io.Serializable;
import java.util.Date;

public class Paper  extends MyPage{
    private String id;

    private String title;

    private String content;

    private String remarks;

    private Integer provideNumber;

    private Integer joinNumber;

    private Integer state;

    private Date createDate;

    private Integer active;

//    public Paper(String id,String title,String content,String remarks,Date createDate){
//        this.id=id;
//        this.title=title;
//        this.content=content;
//        this.remarks=remarks;
//        this.createDate=createDate;
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getProvideNumber() {
        return provideNumber;
    }

    public void setProvideNumber(Integer provideNumber) {
        this.provideNumber = provideNumber;
    }

    public Integer getJoinNumber() {
        return joinNumber;
    }

    public void setJoinNumber(Integer joinNumber) {
        this.joinNumber = joinNumber;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }
}