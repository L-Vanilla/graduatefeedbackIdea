package com.hebeu.graduatefeedback.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankSingleChoiceQueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankSingleChoiceQueExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("active is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("active is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Integer value) {
            addCriterion("active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Integer value) {
            addCriterion("active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Integer value) {
            addCriterion("active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Integer value) {
            addCriterion("active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Integer value) {
            addCriterion("active <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Integer> values) {
            addCriterion("active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Integer> values) {
            addCriterion("active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Integer value1, Integer value2) {
            addCriterion("active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Integer value1, Integer value2) {
            addCriterion("active not between", value1, value2, "active");
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