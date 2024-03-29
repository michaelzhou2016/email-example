package ai.guiji.email.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BillingMailConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillingMailConfigExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andMailTypeIsNull() {
            addCriterion("mail_type is null");
            return (Criteria) this;
        }

        public Criteria andMailTypeIsNotNull() {
            addCriterion("mail_type is not null");
            return (Criteria) this;
        }

        public Criteria andMailTypeEqualTo(Integer value) {
            addCriterion("mail_type =", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeNotEqualTo(Integer value) {
            addCriterion("mail_type <>", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeGreaterThan(Integer value) {
            addCriterion("mail_type >", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("mail_type >=", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeLessThan(Integer value) {
            addCriterion("mail_type <", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeLessThanOrEqualTo(Integer value) {
            addCriterion("mail_type <=", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeIn(List<Integer> values) {
            addCriterion("mail_type in", values, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeNotIn(List<Integer> values) {
            addCriterion("mail_type not in", values, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeBetween(Integer value1, Integer value2) {
            addCriterion("mail_type between", value1, value2, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("mail_type not between", value1, value2, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailSubjectIsNull() {
            addCriterion("mail_subject is null");
            return (Criteria) this;
        }

        public Criteria andMailSubjectIsNotNull() {
            addCriterion("mail_subject is not null");
            return (Criteria) this;
        }

        public Criteria andMailSubjectEqualTo(String value) {
            addCriterion("mail_subject =", value, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectNotEqualTo(String value) {
            addCriterion("mail_subject <>", value, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectGreaterThan(String value) {
            addCriterion("mail_subject >", value, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("mail_subject >=", value, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectLessThan(String value) {
            addCriterion("mail_subject <", value, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectLessThanOrEqualTo(String value) {
            addCriterion("mail_subject <=", value, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectLike(String value) {
            addCriterion("mail_subject like", value, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectNotLike(String value) {
            addCriterion("mail_subject not like", value, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectIn(List<String> values) {
            addCriterion("mail_subject in", values, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectNotIn(List<String> values) {
            addCriterion("mail_subject not in", values, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectBetween(String value1, String value2) {
            addCriterion("mail_subject between", value1, value2, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailSubjectNotBetween(String value1, String value2) {
            addCriterion("mail_subject not between", value1, value2, "mailSubject");
            return (Criteria) this;
        }

        public Criteria andMailReceiversIsNull() {
            addCriterion("mail_receivers is null");
            return (Criteria) this;
        }

        public Criteria andMailReceiversIsNotNull() {
            addCriterion("mail_receivers is not null");
            return (Criteria) this;
        }

        public Criteria andMailReceiversEqualTo(String value) {
            addCriterion("mail_receivers =", value, "mailReceivers");
            return (Criteria) this;
        }

        public Criteria andMailReceiversNotEqualTo(String value) {
            addCriterion("mail_receivers <>", value, "mailReceivers");
            return (Criteria) this;
        }

        public Criteria andMailReceiversGreaterThan(String value) {
            addCriterion("mail_receivers >", value, "mailReceivers");
            return (Criteria) this;
        }

        public Criteria andMailReceiversGreaterThanOrEqualTo(String value) {
            addCriterion("mail_receivers >=", value, "mailReceivers");
            return (Criteria) this;
        }

        public Criteria andMailReceiversLessThan(String value) {
            addCriterion("mail_receivers <", value, "mailReceivers");
            return (Criteria) this;
        }

        public Criteria andMailReceiversLessThanOrEqualTo(String value) {
            addCriterion("mail_receivers <=", value, "mailReceivers");
            return (Criteria) this;
        }

        public Criteria andMailReceiversLike(String value) {
            addCriterion("mail_receivers like", value, "mailReceivers");
            return (Criteria) this;
        }

        public Criteria andMailReceiversNotLike(String value) {
            addCriterion("mail_receivers not like", value, "mailReceivers");
            return (Criteria) this;
        }

        public Criteria andMailReceiversIn(List<String> values) {
            addCriterion("mail_receivers in", values, "mailReceivers");
            return (Criteria) this;
        }

        public Criteria andMailReceiversNotIn(List<String> values) {
            addCriterion("mail_receivers not in", values, "mailReceivers");
            return (Criteria) this;
        }

        public Criteria andMailReceiversBetween(String value1, String value2) {
            addCriterion("mail_receivers between", value1, value2, "mailReceivers");
            return (Criteria) this;
        }

        public Criteria andMailReceiversNotBetween(String value1, String value2) {
            addCriterion("mail_receivers not between", value1, value2, "mailReceivers");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(Integer value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(Integer value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(Integer value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(Integer value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(Integer value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<Integer> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<Integer> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(Integer value1, Integer value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(Integer value1, Integer value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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