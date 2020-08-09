package com.xiaoshu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andStidIsNull() {
            addCriterion("stid is null");
            return (Criteria) this;
        }

        public Criteria andStidIsNotNull() {
            addCriterion("stid is not null");
            return (Criteria) this;
        }

        public Criteria andStidEqualTo(Integer value) {
            addCriterion("stid =", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotEqualTo(Integer value) {
            addCriterion("stid <>", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidGreaterThan(Integer value) {
            addCriterion("stid >", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stid >=", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidLessThan(Integer value) {
            addCriterion("stid <", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidLessThanOrEqualTo(Integer value) {
            addCriterion("stid <=", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidIn(List<Integer> values) {
            addCriterion("stid in", values, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotIn(List<Integer> values) {
            addCriterion("stid not in", values, "stid");
            return (Criteria) this;
        }

        public Criteria andStidBetween(Integer value1, Integer value2) {
            addCriterion("stid between", value1, value2, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotBetween(Integer value1, Integer value2) {
            addCriterion("stid not between", value1, value2, "stid");
            return (Criteria) this;
        }

        public Criteria andStnameIsNull() {
            addCriterion("stname is null");
            return (Criteria) this;
        }

        public Criteria andStnameIsNotNull() {
            addCriterion("stname is not null");
            return (Criteria) this;
        }

        public Criteria andStnameEqualTo(String value) {
            addCriterion("stname =", value, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameNotEqualTo(String value) {
            addCriterion("stname <>", value, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameGreaterThan(String value) {
            addCriterion("stname >", value, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameGreaterThanOrEqualTo(String value) {
            addCriterion("stname >=", value, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameLessThan(String value) {
            addCriterion("stname <", value, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameLessThanOrEqualTo(String value) {
            addCriterion("stname <=", value, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameLike(String value) {
            addCriterion("stname like", value, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameNotLike(String value) {
            addCriterion("stname not like", value, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameIn(List<String> values) {
            addCriterion("stname in", values, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameNotIn(List<String> values) {
            addCriterion("stname not in", values, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameBetween(String value1, String value2) {
            addCriterion("stname between", value1, value2, "stname");
            return (Criteria) this;
        }

        public Criteria andStnameNotBetween(String value1, String value2) {
            addCriterion("stname not between", value1, value2, "stname");
            return (Criteria) this;
        }

        public Criteria andStbirthdayIsNull() {
            addCriterion("stbirthday is null");
            return (Criteria) this;
        }

        public Criteria andStbirthdayIsNotNull() {
            addCriterion("stbirthday is not null");
            return (Criteria) this;
        }

        public Criteria andStbirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("stbirthday =", value, "stbirthday");
            return (Criteria) this;
        }

        public Criteria andStbirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("stbirthday <>", value, "stbirthday");
            return (Criteria) this;
        }

        public Criteria andStbirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("stbirthday >", value, "stbirthday");
            return (Criteria) this;
        }

        public Criteria andStbirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stbirthday >=", value, "stbirthday");
            return (Criteria) this;
        }

        public Criteria andStbirthdayLessThan(Date value) {
            addCriterionForJDBCDate("stbirthday <", value, "stbirthday");
            return (Criteria) this;
        }

        public Criteria andStbirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stbirthday <=", value, "stbirthday");
            return (Criteria) this;
        }

        public Criteria andStbirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("stbirthday in", values, "stbirthday");
            return (Criteria) this;
        }

        public Criteria andStbirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("stbirthday not in", values, "stbirthday");
            return (Criteria) this;
        }

        public Criteria andStbirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stbirthday between", value1, value2, "stbirthday");
            return (Criteria) this;
        }

        public Criteria andStbirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stbirthday not between", value1, value2, "stbirthday");
            return (Criteria) this;
        }

        public Criteria andStageIsNull() {
            addCriterion("stage is null");
            return (Criteria) this;
        }

        public Criteria andStageIsNotNull() {
            addCriterion("stage is not null");
            return (Criteria) this;
        }

        public Criteria andStageEqualTo(String value) {
            addCriterion("stage =", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotEqualTo(String value) {
            addCriterion("stage <>", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThan(String value) {
            addCriterion("stage >", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageGreaterThanOrEqualTo(String value) {
            addCriterion("stage >=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThan(String value) {
            addCriterion("stage <", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLessThanOrEqualTo(String value) {
            addCriterion("stage <=", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageLike(String value) {
            addCriterion("stage like", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotLike(String value) {
            addCriterion("stage not like", value, "stage");
            return (Criteria) this;
        }

        public Criteria andStageIn(List<String> values) {
            addCriterion("stage in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotIn(List<String> values) {
            addCriterion("stage not in", values, "stage");
            return (Criteria) this;
        }

        public Criteria andStageBetween(String value1, String value2) {
            addCriterion("stage between", value1, value2, "stage");
            return (Criteria) this;
        }

        public Criteria andStageNotBetween(String value1, String value2) {
            addCriterion("stage not between", value1, value2, "stage");
            return (Criteria) this;
        }

        public Criteria andStsexIsNull() {
            addCriterion("stsex is null");
            return (Criteria) this;
        }

        public Criteria andStsexIsNotNull() {
            addCriterion("stsex is not null");
            return (Criteria) this;
        }

        public Criteria andStsexEqualTo(String value) {
            addCriterion("stsex =", value, "stsex");
            return (Criteria) this;
        }

        public Criteria andStsexNotEqualTo(String value) {
            addCriterion("stsex <>", value, "stsex");
            return (Criteria) this;
        }

        public Criteria andStsexGreaterThan(String value) {
            addCriterion("stsex >", value, "stsex");
            return (Criteria) this;
        }

        public Criteria andStsexGreaterThanOrEqualTo(String value) {
            addCriterion("stsex >=", value, "stsex");
            return (Criteria) this;
        }

        public Criteria andStsexLessThan(String value) {
            addCriterion("stsex <", value, "stsex");
            return (Criteria) this;
        }

        public Criteria andStsexLessThanOrEqualTo(String value) {
            addCriterion("stsex <=", value, "stsex");
            return (Criteria) this;
        }

        public Criteria andStsexLike(String value) {
            addCriterion("stsex like", value, "stsex");
            return (Criteria) this;
        }

        public Criteria andStsexNotLike(String value) {
            addCriterion("stsex not like", value, "stsex");
            return (Criteria) this;
        }

        public Criteria andStsexIn(List<String> values) {
            addCriterion("stsex in", values, "stsex");
            return (Criteria) this;
        }

        public Criteria andStsexNotIn(List<String> values) {
            addCriterion("stsex not in", values, "stsex");
            return (Criteria) this;
        }

        public Criteria andStsexBetween(String value1, String value2) {
            addCriterion("stsex between", value1, value2, "stsex");
            return (Criteria) this;
        }

        public Criteria andStsexNotBetween(String value1, String value2) {
            addCriterion("stsex not between", value1, value2, "stsex");
            return (Criteria) this;
        }

        public Criteria andScidIsNull() {
            addCriterion("scid is null");
            return (Criteria) this;
        }

        public Criteria andScidIsNotNull() {
            addCriterion("scid is not null");
            return (Criteria) this;
        }

        public Criteria andScidEqualTo(Integer value) {
            addCriterion("scid =", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidNotEqualTo(Integer value) {
            addCriterion("scid <>", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidGreaterThan(Integer value) {
            addCriterion("scid >", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidGreaterThanOrEqualTo(Integer value) {
            addCriterion("scid >=", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidLessThan(Integer value) {
            addCriterion("scid <", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidLessThanOrEqualTo(Integer value) {
            addCriterion("scid <=", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidIn(List<Integer> values) {
            addCriterion("scid in", values, "scid");
            return (Criteria) this;
        }

        public Criteria andScidNotIn(List<Integer> values) {
            addCriterion("scid not in", values, "scid");
            return (Criteria) this;
        }

        public Criteria andScidBetween(Integer value1, Integer value2) {
            addCriterion("scid between", value1, value2, "scid");
            return (Criteria) this;
        }

        public Criteria andScidNotBetween(Integer value1, Integer value2) {
            addCriterion("scid not between", value1, value2, "scid");
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