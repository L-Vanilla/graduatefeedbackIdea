package com.hebeu.graduatefeedback.pojo;

public class PaperView  extends MyPage{
    private String paperId;

    private String title;

    private String content;

    private String remarks;

    private Integer provideNumber;

    private Integer state;

    private String queId;

    private String singleContent;

    private String choiceA;

    private String choiceB;

    private String choiceC;

    private String choiceD;

    private String choiceE;

    private String choiceF;

    private String choiceG;

    private String singeType;

    private Integer queType;

    private Integer queNum;

    public String getPaperId() {
        return paperId;
    }

    public void setPaperId(String paperId) {
        this.paperId = paperId == null ? null : paperId.trim();
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getQueId() {
        return queId;
    }

    public void setQueId(String queId) {
        this.queId = queId == null ? null : queId.trim();
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

    public Integer getQueType() {
        return queType;
    }

    public void setQueType(Integer queType) {
        this.queType = queType;
    }

    public Integer getQueNum() {
        return queNum;
    }

    public void setQueNum(Integer queNum) {
        this.queNum = queNum;
    }
}