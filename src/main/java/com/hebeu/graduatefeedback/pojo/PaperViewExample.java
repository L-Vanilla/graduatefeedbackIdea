package com.hebeu.graduatefeedback.pojo;

import java.util.ArrayList;
import java.util.List;

public class PaperViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaperViewExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPaperIdIsNull() {
            addCriterion("paper_id is null");
            return (Criteria) this;
        }

        public Criteria andPaperIdIsNotNull() {
            addCriterion("paper_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaperIdEqualTo(String value) {
            addCriterion("paper_id =", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotEqualTo(String value) {
            addCriterion("paper_id <>", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThan(String value) {
            addCriterion("paper_id >", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThanOrEqualTo(String value) {
            addCriterion("paper_id >=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThan(String value) {
            addCriterion("paper_id <", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThanOrEqualTo(String value) {
            addCriterion("paper_id <=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLike(String value) {
            addCriterion("paper_id like", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotLike(String value) {
            addCriterion("paper_id not like", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdIn(List<String> values) {
            addCriterion("paper_id in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotIn(List<String> values) {
            addCriterion("paper_id not in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdBetween(String value1, String value2) {
            addCriterion("paper_id between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotBetween(String value1, String value2) {
            addCriterion("paper_id not between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andProvideNumberIsNull() {
            addCriterion("provide_number is null");
            return (Criteria) this;
        }

        public Criteria andProvideNumberIsNotNull() {
            addCriterion("provide_number is not null");
            return (Criteria) this;
        }

        public Criteria andProvideNumberEqualTo(Integer value) {
            addCriterion("provide_number =", value, "provideNumber");
            return (Criteria) this;
        }

        public Criteria andProvideNumberNotEqualTo(Integer value) {
            addCriterion("provide_number <>", value, "provideNumber");
            return (Criteria) this;
        }

        public Criteria andProvideNumberGreaterThan(Integer value) {
            addCriterion("provide_number >", value, "provideNumber");
            return (Criteria) this;
        }

        public Criteria andProvideNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("provide_number >=", value, "provideNumber");
            return (Criteria) this;
        }

        public Criteria andProvideNumberLessThan(Integer value) {
            addCriterion("provide_number <", value, "provideNumber");
            return (Criteria) this;
        }

        public Criteria andProvideNumberLessThanOrEqualTo(Integer value) {
            addCriterion("provide_number <=", value, "provideNumber");
            return (Criteria) this;
        }

        public Criteria andProvideNumberIn(List<Integer> values) {
            addCriterion("provide_number in", values, "provideNumber");
            return (Criteria) this;
        }

        public Criteria andProvideNumberNotIn(List<Integer> values) {
            addCriterion("provide_number not in", values, "provideNumber");
            return (Criteria) this;
        }

        public Criteria andProvideNumberBetween(Integer value1, Integer value2) {
            addCriterion("provide_number between", value1, value2, "provideNumber");
            return (Criteria) this;
        }

        public Criteria andProvideNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("provide_number not between", value1, value2, "provideNumber");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andQueIdIsNull() {
            addCriterion("que_id is null");
            return (Criteria) this;
        }

        public Criteria andQueIdIsNotNull() {
            addCriterion("que_id is not null");
            return (Criteria) this;
        }

        public Criteria andQueIdEqualTo(String value) {
            addCriterion("que_id =", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdNotEqualTo(String value) {
            addCriterion("que_id <>", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdGreaterThan(String value) {
            addCriterion("que_id >", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdGreaterThanOrEqualTo(String value) {
            addCriterion("que_id >=", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdLessThan(String value) {
            addCriterion("que_id <", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdLessThanOrEqualTo(String value) {
            addCriterion("que_id <=", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdLike(String value) {
            addCriterion("que_id like", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdNotLike(String value) {
            addCriterion("que_id not like", value, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdIn(List<String> values) {
            addCriterion("que_id in", values, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdNotIn(List<String> values) {
            addCriterion("que_id not in", values, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdBetween(String value1, String value2) {
            addCriterion("que_id between", value1, value2, "queId");
            return (Criteria) this;
        }

        public Criteria andQueIdNotBetween(String value1, String value2) {
            addCriterion("que_id not between", value1, value2, "queId");
            return (Criteria) this;
        }

        public Criteria andSingleContentIsNull() {
            addCriterion("single_content is null");
            return (Criteria) this;
        }

        public Criteria andSingleContentIsNotNull() {
            addCriterion("single_content is not null");
            return (Criteria) this;
        }

        public Criteria andSingleContentEqualTo(String value) {
            addCriterion("single_content =", value, "singleContent");
            return (Criteria) this;
        }

        public Criteria andSingleContentNotEqualTo(String value) {
            addCriterion("single_content <>", value, "singleContent");
            return (Criteria) this;
        }

        public Criteria andSingleContentGreaterThan(String value) {
            addCriterion("single_content >", value, "singleContent");
            return (Criteria) this;
        }

        public Criteria andSingleContentGreaterThanOrEqualTo(String value) {
            addCriterion("single_content >=", value, "singleContent");
            return (Criteria) this;
        }

        public Criteria andSingleContentLessThan(String value) {
            addCriterion("single_content <", value, "singleContent");
            return (Criteria) this;
        }

        public Criteria andSingleContentLessThanOrEqualTo(String value) {
            addCriterion("single_content <=", value, "singleContent");
            return (Criteria) this;
        }

        public Criteria andSingleContentLike(String value) {
            addCriterion("single_content like", value, "singleContent");
            return (Criteria) this;
        }

        public Criteria andSingleContentNotLike(String value) {
            addCriterion("single_content not like", value, "singleContent");
            return (Criteria) this;
        }

        public Criteria andSingleContentIn(List<String> values) {
            addCriterion("single_content in", values, "singleContent");
            return (Criteria) this;
        }

        public Criteria andSingleContentNotIn(List<String> values) {
            addCriterion("single_content not in", values, "singleContent");
            return (Criteria) this;
        }

        public Criteria andSingleContentBetween(String value1, String value2) {
            addCriterion("single_content between", value1, value2, "singleContent");
            return (Criteria) this;
        }

        public Criteria andSingleContentNotBetween(String value1, String value2) {
            addCriterion("single_content not between", value1, value2, "singleContent");
            return (Criteria) this;
        }

        public Criteria andChoiceAIsNull() {
            addCriterion("choice_A is null");
            return (Criteria) this;
        }

        public Criteria andChoiceAIsNotNull() {
            addCriterion("choice_A is not null");
            return (Criteria) this;
        }

        public Criteria andChoiceAEqualTo(String value) {
            addCriterion("choice_A =", value, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceANotEqualTo(String value) {
            addCriterion("choice_A <>", value, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceAGreaterThan(String value) {
            addCriterion("choice_A >", value, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceAGreaterThanOrEqualTo(String value) {
            addCriterion("choice_A >=", value, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceALessThan(String value) {
            addCriterion("choice_A <", value, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceALessThanOrEqualTo(String value) {
            addCriterion("choice_A <=", value, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceALike(String value) {
            addCriterion("choice_A like", value, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceANotLike(String value) {
            addCriterion("choice_A not like", value, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceAIn(List<String> values) {
            addCriterion("choice_A in", values, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceANotIn(List<String> values) {
            addCriterion("choice_A not in", values, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceABetween(String value1, String value2) {
            addCriterion("choice_A between", value1, value2, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceANotBetween(String value1, String value2) {
            addCriterion("choice_A not between", value1, value2, "choiceA");
            return (Criteria) this;
        }

        public Criteria andChoiceBIsNull() {
            addCriterion("choice_B is null");
            return (Criteria) this;
        }

        public Criteria andChoiceBIsNotNull() {
            addCriterion("choice_B is not null");
            return (Criteria) this;
        }

        public Criteria andChoiceBEqualTo(String value) {
            addCriterion("choice_B =", value, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBNotEqualTo(String value) {
            addCriterion("choice_B <>", value, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBGreaterThan(String value) {
            addCriterion("choice_B >", value, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBGreaterThanOrEqualTo(String value) {
            addCriterion("choice_B >=", value, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBLessThan(String value) {
            addCriterion("choice_B <", value, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBLessThanOrEqualTo(String value) {
            addCriterion("choice_B <=", value, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBLike(String value) {
            addCriterion("choice_B like", value, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBNotLike(String value) {
            addCriterion("choice_B not like", value, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBIn(List<String> values) {
            addCriterion("choice_B in", values, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBNotIn(List<String> values) {
            addCriterion("choice_B not in", values, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBBetween(String value1, String value2) {
            addCriterion("choice_B between", value1, value2, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceBNotBetween(String value1, String value2) {
            addCriterion("choice_B not between", value1, value2, "choiceB");
            return (Criteria) this;
        }

        public Criteria andChoiceCIsNull() {
            addCriterion("choice_C is null");
            return (Criteria) this;
        }

        public Criteria andChoiceCIsNotNull() {
            addCriterion("choice_C is not null");
            return (Criteria) this;
        }

        public Criteria andChoiceCEqualTo(String value) {
            addCriterion("choice_C =", value, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCNotEqualTo(String value) {
            addCriterion("choice_C <>", value, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCGreaterThan(String value) {
            addCriterion("choice_C >", value, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCGreaterThanOrEqualTo(String value) {
            addCriterion("choice_C >=", value, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCLessThan(String value) {
            addCriterion("choice_C <", value, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCLessThanOrEqualTo(String value) {
            addCriterion("choice_C <=", value, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCLike(String value) {
            addCriterion("choice_C like", value, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCNotLike(String value) {
            addCriterion("choice_C not like", value, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCIn(List<String> values) {
            addCriterion("choice_C in", values, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCNotIn(List<String> values) {
            addCriterion("choice_C not in", values, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCBetween(String value1, String value2) {
            addCriterion("choice_C between", value1, value2, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceCNotBetween(String value1, String value2) {
            addCriterion("choice_C not between", value1, value2, "choiceC");
            return (Criteria) this;
        }

        public Criteria andChoiceDIsNull() {
            addCriterion("choice_D is null");
            return (Criteria) this;
        }

        public Criteria andChoiceDIsNotNull() {
            addCriterion("choice_D is not null");
            return (Criteria) this;
        }

        public Criteria andChoiceDEqualTo(String value) {
            addCriterion("choice_D =", value, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDNotEqualTo(String value) {
            addCriterion("choice_D <>", value, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDGreaterThan(String value) {
            addCriterion("choice_D >", value, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDGreaterThanOrEqualTo(String value) {
            addCriterion("choice_D >=", value, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDLessThan(String value) {
            addCriterion("choice_D <", value, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDLessThanOrEqualTo(String value) {
            addCriterion("choice_D <=", value, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDLike(String value) {
            addCriterion("choice_D like", value, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDNotLike(String value) {
            addCriterion("choice_D not like", value, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDIn(List<String> values) {
            addCriterion("choice_D in", values, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDNotIn(List<String> values) {
            addCriterion("choice_D not in", values, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDBetween(String value1, String value2) {
            addCriterion("choice_D between", value1, value2, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceDNotBetween(String value1, String value2) {
            addCriterion("choice_D not between", value1, value2, "choiceD");
            return (Criteria) this;
        }

        public Criteria andChoiceEIsNull() {
            addCriterion("choice_E is null");
            return (Criteria) this;
        }

        public Criteria andChoiceEIsNotNull() {
            addCriterion("choice_E is not null");
            return (Criteria) this;
        }

        public Criteria andChoiceEEqualTo(String value) {
            addCriterion("choice_E =", value, "choiceE");
            return (Criteria) this;
        }

        public Criteria andChoiceENotEqualTo(String value) {
            addCriterion("choice_E <>", value, "choiceE");
            return (Criteria) this;
        }

        public Criteria andChoiceEGreaterThan(String value) {
            addCriterion("choice_E >", value, "choiceE");
            return (Criteria) this;
        }

        public Criteria andChoiceEGreaterThanOrEqualTo(String value) {
            addCriterion("choice_E >=", value, "choiceE");
            return (Criteria) this;
        }

        public Criteria andChoiceELessThan(String value) {
            addCriterion("choice_E <", value, "choiceE");
            return (Criteria) this;
        }

        public Criteria andChoiceELessThanOrEqualTo(String value) {
            addCriterion("choice_E <=", value, "choiceE");
            return (Criteria) this;
        }

        public Criteria andChoiceELike(String value) {
            addCriterion("choice_E like", value, "choiceE");
            return (Criteria) this;
        }

        public Criteria andChoiceENotLike(String value) {
            addCriterion("choice_E not like", value, "choiceE");
            return (Criteria) this;
        }

        public Criteria andChoiceEIn(List<String> values) {
            addCriterion("choice_E in", values, "choiceE");
            return (Criteria) this;
        }

        public Criteria andChoiceENotIn(List<String> values) {
            addCriterion("choice_E not in", values, "choiceE");
            return (Criteria) this;
        }

        public Criteria andChoiceEBetween(String value1, String value2) {
            addCriterion("choice_E between", value1, value2, "choiceE");
            return (Criteria) this;
        }

        public Criteria andChoiceENotBetween(String value1, String value2) {
            addCriterion("choice_E not between", value1, value2, "choiceE");
            return (Criteria) this;
        }

        public Criteria andChoiceFIsNull() {
            addCriterion("choice_F is null");
            return (Criteria) this;
        }

        public Criteria andChoiceFIsNotNull() {
            addCriterion("choice_F is not null");
            return (Criteria) this;
        }

        public Criteria andChoiceFEqualTo(String value) {
            addCriterion("choice_F =", value, "choiceF");
            return (Criteria) this;
        }

        public Criteria andChoiceFNotEqualTo(String value) {
            addCriterion("choice_F <>", value, "choiceF");
            return (Criteria) this;
        }

        public Criteria andChoiceFGreaterThan(String value) {
            addCriterion("choice_F >", value, "choiceF");
            return (Criteria) this;
        }

        public Criteria andChoiceFGreaterThanOrEqualTo(String value) {
            addCriterion("choice_F >=", value, "choiceF");
            return (Criteria) this;
        }

        public Criteria andChoiceFLessThan(String value) {
            addCriterion("choice_F <", value, "choiceF");
            return (Criteria) this;
        }

        public Criteria andChoiceFLessThanOrEqualTo(String value) {
            addCriterion("choice_F <=", value, "choiceF");
            return (Criteria) this;
        }

        public Criteria andChoiceFLike(String value) {
            addCriterion("choice_F like", value, "choiceF");
            return (Criteria) this;
        }

        public Criteria andChoiceFNotLike(String value) {
            addCriterion("choice_F not like", value, "choiceF");
            return (Criteria) this;
        }

        public Criteria andChoiceFIn(List<String> values) {
            addCriterion("choice_F in", values, "choiceF");
            return (Criteria) this;
        }

        public Criteria andChoiceFNotIn(List<String> values) {
            addCriterion("choice_F not in", values, "choiceF");
            return (Criteria) this;
        }

        public Criteria andChoiceFBetween(String value1, String value2) {
            addCriterion("choice_F between", value1, value2, "choiceF");
            return (Criteria) this;
        }

        public Criteria andChoiceFNotBetween(String value1, String value2) {
            addCriterion("choice_F not between", value1, value2, "choiceF");
            return (Criteria) this;
        }

        public Criteria andChoiceGIsNull() {
            addCriterion("choice_G is null");
            return (Criteria) this;
        }

        public Criteria andChoiceGIsNotNull() {
            addCriterion("choice_G is not null");
            return (Criteria) this;
        }

        public Criteria andChoiceGEqualTo(String value) {
            addCriterion("choice_G =", value, "choiceG");
            return (Criteria) this;
        }

        public Criteria andChoiceGNotEqualTo(String value) {
            addCriterion("choice_G <>", value, "choiceG");
            return (Criteria) this;
        }

        public Criteria andChoiceGGreaterThan(String value) {
            addCriterion("choice_G >", value, "choiceG");
            return (Criteria) this;
        }

        public Criteria andChoiceGGreaterThanOrEqualTo(String value) {
            addCriterion("choice_G >=", value, "choiceG");
            return (Criteria) this;
        }

        public Criteria andChoiceGLessThan(String value) {
            addCriterion("choice_G <", value, "choiceG");
            return (Criteria) this;
        }

        public Criteria andChoiceGLessThanOrEqualTo(String value) {
            addCriterion("choice_G <=", value, "choiceG");
            return (Criteria) this;
        }

        public Criteria andChoiceGLike(String value) {
            addCriterion("choice_G like", value, "choiceG");
            return (Criteria) this;
        }

        public Criteria andChoiceGNotLike(String value) {
            addCriterion("choice_G not like", value, "choiceG");
            return (Criteria) this;
        }

        public Criteria andChoiceGIn(List<String> values) {
            addCriterion("choice_G in", values, "choiceG");
            return (Criteria) this;
        }

        public Criteria andChoiceGNotIn(List<String> values) {
            addCriterion("choice_G not in", values, "choiceG");
            return (Criteria) this;
        }

        public Criteria andChoiceGBetween(String value1, String value2) {
            addCriterion("choice_G between", value1, value2, "choiceG");
            return (Criteria) this;
        }

        public Criteria andChoiceGNotBetween(String value1, String value2) {
            addCriterion("choice_G not between", value1, value2, "choiceG");
            return (Criteria) this;
        }

        public Criteria andSingeTypeIsNull() {
            addCriterion("singe_type is null");
            return (Criteria) this;
        }

        public Criteria andSingeTypeIsNotNull() {
            addCriterion("singe_type is not null");
            return (Criteria) this;
        }

        public Criteria andSingeTypeEqualTo(String value) {
            addCriterion("singe_type =", value, "singeType");
            return (Criteria) this;
        }

        public Criteria andSingeTypeNotEqualTo(String value) {
            addCriterion("singe_type <>", value, "singeType");
            return (Criteria) this;
        }

        public Criteria andSingeTypeGreaterThan(String value) {
            addCriterion("singe_type >", value, "singeType");
            return (Criteria) this;
        }

        public Criteria andSingeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("singe_type >=", value, "singeType");
            return (Criteria) this;
        }

        public Criteria andSingeTypeLessThan(String value) {
            addCriterion("singe_type <", value, "singeType");
            return (Criteria) this;
        }

        public Criteria andSingeTypeLessThanOrEqualTo(String value) {
            addCriterion("singe_type <=", value, "singeType");
            return (Criteria) this;
        }

        public Criteria andSingeTypeLike(String value) {
            addCriterion("singe_type like", value, "singeType");
            return (Criteria) this;
        }

        public Criteria andSingeTypeNotLike(String value) {
            addCriterion("singe_type not like", value, "singeType");
            return (Criteria) this;
        }

        public Criteria andSingeTypeIn(List<String> values) {
            addCriterion("singe_type in", values, "singeType");
            return (Criteria) this;
        }

        public Criteria andSingeTypeNotIn(List<String> values) {
            addCriterion("singe_type not in", values, "singeType");
            return (Criteria) this;
        }

        public Criteria andSingeTypeBetween(String value1, String value2) {
            addCriterion("singe_type between", value1, value2, "singeType");
            return (Criteria) this;
        }

        public Criteria andSingeTypeNotBetween(String value1, String value2) {
            addCriterion("singe_type not between", value1, value2, "singeType");
            return (Criteria) this;
        }

        public Criteria andQueTypeIsNull() {
            addCriterion("que_type is null");
            return (Criteria) this;
        }

        public Criteria andQueTypeIsNotNull() {
            addCriterion("que_type is not null");
            return (Criteria) this;
        }

        public Criteria andQueTypeEqualTo(Integer value) {
            addCriterion("que_type =", value, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeNotEqualTo(Integer value) {
            addCriterion("que_type <>", value, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeGreaterThan(Integer value) {
            addCriterion("que_type >", value, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("que_type >=", value, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeLessThan(Integer value) {
            addCriterion("que_type <", value, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeLessThanOrEqualTo(Integer value) {
            addCriterion("que_type <=", value, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeIn(List<Integer> values) {
            addCriterion("que_type in", values, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeNotIn(List<Integer> values) {
            addCriterion("que_type not in", values, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeBetween(Integer value1, Integer value2) {
            addCriterion("que_type between", value1, value2, "queType");
            return (Criteria) this;
        }

        public Criteria andQueTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("que_type not between", value1, value2, "queType");
            return (Criteria) this;
        }

        public Criteria andQueNumIsNull() {
            addCriterion("que_num is null");
            return (Criteria) this;
        }

        public Criteria andQueNumIsNotNull() {
            addCriterion("que_num is not null");
            return (Criteria) this;
        }

        public Criteria andQueNumEqualTo(Integer value) {
            addCriterion("que_num =", value, "queNum");
            return (Criteria) this;
        }

        public Criteria andQueNumNotEqualTo(Integer value) {
            addCriterion("que_num <>", value, "queNum");
            return (Criteria) this;
        }

        public Criteria andQueNumGreaterThan(Integer value) {
            addCriterion("que_num >", value, "queNum");
            return (Criteria) this;
        }

        public Criteria andQueNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("que_num >=", value, "queNum");
            return (Criteria) this;
        }

        public Criteria andQueNumLessThan(Integer value) {
            addCriterion("que_num <", value, "queNum");
            return (Criteria) this;
        }

        public Criteria andQueNumLessThanOrEqualTo(Integer value) {
            addCriterion("que_num <=", value, "queNum");
            return (Criteria) this;
        }

        public Criteria andQueNumIn(List<Integer> values) {
            addCriterion("que_num in", values, "queNum");
            return (Criteria) this;
        }

        public Criteria andQueNumNotIn(List<Integer> values) {
            addCriterion("que_num not in", values, "queNum");
            return (Criteria) this;
        }

        public Criteria andQueNumBetween(Integer value1, Integer value2) {
            addCriterion("que_num between", value1, value2, "queNum");
            return (Criteria) this;
        }

        public Criteria andQueNumNotBetween(Integer value1, Integer value2) {
            addCriterion("que_num not between", value1, value2, "queNum");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}