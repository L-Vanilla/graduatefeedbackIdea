package com.hebeu.graduatefeedback.pojo;

import java.util.Date;

public class BankSingleChoiceQue extends MyPage{
    private String id;

    private String singleContent;

    private String choiceA;

    private String choiceB;

    private String choiceC;

    private String choiceD;

    private String choiceE;

    private String choiceF;

    private String choiceG;

    private String singeType;

    private Date createDate;

    private Integer queType;

    private Integer active;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getSingleContent() {
        return singleContent;
    }

    public void setSingleContent(String singleContent) {
        this.singleContent = singleContent == null ? null : singleContent.trim();
    }

    public String getChoiceA() {
        return choiceA;
    }

    public void setChoiceA(String choiceA) {
        this.choiceA = choiceA == null ? null : choiceA.trim();
    }

    public String getChoiceB() {
        return choiceB;
    }

    public void setChoiceB(String choiceB) {
        this.choiceB = choiceB == null ? null : choiceB.trim();
    }

    public String getChoiceC() {
        return choiceC;
    }

    public void setChoiceC(String choiceC) {
        this.choiceC = choiceC == null ? null : choiceC.trim();
    }

    public String getChoiceD() {
        return choiceD;
    }

    public void setChoiceD(String choiceD) {
        this.choiceD = choiceD == null ? null : choiceD.trim();
    }

    public String getChoiceE() {
        return choiceE;
    }

    public void setChoiceE(String choiceE) {
        this.choiceE = choiceE == null ? null : choiceE.trim();
    }

    public String getChoiceF() {
        return choiceF;
    }

    public void setChoiceF(String choiceF) {
        this.choiceF = choiceF == null ? null : choiceF.trim();
    }

    public String getChoiceG() {
        return choiceG;
    }

    public void setChoiceG(String choiceG) {
        this.choiceG = choiceG == null ? null : choiceG.trim();
    }

    public String getSingeType() {
        return singeType;
    }

    public void setSingeType(String singeType) {
        this.singeType = singeType == null ? null : singeType.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getQueType() {
        return queType;
    }

    public void setQueType(Integer queType) {
        this.queType = queType;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }
}