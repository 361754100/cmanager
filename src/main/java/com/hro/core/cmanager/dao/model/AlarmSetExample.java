package com.hro.core.cmanager.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlarmSetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlarmSetExample() {
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

        public Criteria andDevidIsNull() {
            addCriterion("DEVID is null");
            return (Criteria) this;
        }

        public Criteria andDevidIsNotNull() {
            addCriterion("DEVID is not null");
            return (Criteria) this;
        }

        public Criteria andDevidEqualTo(String value) {
            addCriterion("DEVID =", value, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidNotEqualTo(String value) {
            addCriterion("DEVID <>", value, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidGreaterThan(String value) {
            addCriterion("DEVID >", value, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidGreaterThanOrEqualTo(String value) {
            addCriterion("DEVID >=", value, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidLessThan(String value) {
            addCriterion("DEVID <", value, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidLessThanOrEqualTo(String value) {
            addCriterion("DEVID <=", value, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidLike(String value) {
            addCriterion("DEVID like", value, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidNotLike(String value) {
            addCriterion("DEVID not like", value, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidIn(List<String> values) {
            addCriterion("DEVID in", values, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidNotIn(List<String> values) {
            addCriterion("DEVID not in", values, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidBetween(String value1, String value2) {
            addCriterion("DEVID between", value1, value2, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidNotBetween(String value1, String value2) {
            addCriterion("DEVID not between", value1, value2, "devid");
            return (Criteria) this;
        }

        public Criteria andAlarmRadiusIsNull() {
            addCriterion("ALARM_RADIUS is null");
            return (Criteria) this;
        }

        public Criteria andAlarmRadiusIsNotNull() {
            addCriterion("ALARM_RADIUS is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmRadiusEqualTo(Double value) {
            addCriterion("ALARM_RADIUS =", value, "alarmRadius");
            return (Criteria) this;
        }

        public Criteria andAlarmRadiusNotEqualTo(Double value) {
            addCriterion("ALARM_RADIUS <>", value, "alarmRadius");
            return (Criteria) this;
        }

        public Criteria andAlarmRadiusGreaterThan(Double value) {
            addCriterion("ALARM_RADIUS >", value, "alarmRadius");
            return (Criteria) this;
        }

        public Criteria andAlarmRadiusGreaterThanOrEqualTo(Double value) {
            addCriterion("ALARM_RADIUS >=", value, "alarmRadius");
            return (Criteria) this;
        }

        public Criteria andAlarmRadiusLessThan(Double value) {
            addCriterion("ALARM_RADIUS <", value, "alarmRadius");
            return (Criteria) this;
        }

        public Criteria andAlarmRadiusLessThanOrEqualTo(Double value) {
            addCriterion("ALARM_RADIUS <=", value, "alarmRadius");
            return (Criteria) this;
        }

        public Criteria andAlarmRadiusIn(List<Double> values) {
            addCriterion("ALARM_RADIUS in", values, "alarmRadius");
            return (Criteria) this;
        }

        public Criteria andAlarmRadiusNotIn(List<Double> values) {
            addCriterion("ALARM_RADIUS not in", values, "alarmRadius");
            return (Criteria) this;
        }

        public Criteria andAlarmRadiusBetween(Double value1, Double value2) {
            addCriterion("ALARM_RADIUS between", value1, value2, "alarmRadius");
            return (Criteria) this;
        }

        public Criteria andAlarmRadiusNotBetween(Double value1, Double value2) {
            addCriterion("ALARM_RADIUS not between", value1, value2, "alarmRadius");
            return (Criteria) this;
        }

        public Criteria andOperateIsNull() {
            addCriterion("OPERATE is null");
            return (Criteria) this;
        }

        public Criteria andOperateIsNotNull() {
            addCriterion("OPERATE is not null");
            return (Criteria) this;
        }

        public Criteria andOperateEqualTo(Integer value) {
            addCriterion("OPERATE =", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateNotEqualTo(Integer value) {
            addCriterion("OPERATE <>", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateGreaterThan(Integer value) {
            addCriterion("OPERATE >", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateGreaterThanOrEqualTo(Integer value) {
            addCriterion("OPERATE >=", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateLessThan(Integer value) {
            addCriterion("OPERATE <", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateLessThanOrEqualTo(Integer value) {
            addCriterion("OPERATE <=", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateIn(List<Integer> values) {
            addCriterion("OPERATE in", values, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateNotIn(List<Integer> values) {
            addCriterion("OPERATE not in", values, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateBetween(Integer value1, Integer value2) {
            addCriterion("OPERATE between", value1, value2, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateNotBetween(Integer value1, Integer value2) {
            addCriterion("OPERATE not between", value1, value2, "operate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("OPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("OPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("OPERATOR =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("OPERATOR <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("OPERATOR >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("OPERATOR <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("OPERATOR like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("OPERATOR not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("OPERATOR in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("OPERATOR not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("OPERATOR between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("OPERATOR not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andDevidLikeInsensitive(String value) {
            addCriterion("upper(DEVID) like", value.toUpperCase(), "devid");
            return (Criteria) this;
        }

        public Criteria andOperatorLikeInsensitive(String value) {
            addCriterion("upper(OPERATOR) like", value.toUpperCase(), "operator");
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