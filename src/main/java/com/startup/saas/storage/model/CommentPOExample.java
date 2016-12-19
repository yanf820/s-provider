package com.startup.saas.storage.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentPOExample() {
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

        public Criteria andPostIdIsNull() {
            addCriterion("post_id is null");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNotNull() {
            addCriterion("post_id is not null");
            return (Criteria) this;
        }

        public Criteria andPostIdEqualTo(Integer value) {
            addCriterion("post_id =", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotEqualTo(Integer value) {
            addCriterion("post_id <>", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThan(Integer value) {
            addCriterion("post_id >", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_id >=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThan(Integer value) {
            addCriterion("post_id <", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThanOrEqualTo(Integer value) {
            addCriterion("post_id <=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdIn(List<Integer> values) {
            addCriterion("post_id in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotIn(List<Integer> values) {
            addCriterion("post_id not in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdBetween(Integer value1, Integer value2) {
            addCriterion("post_id between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotBetween(Integer value1, Integer value2) {
            addCriterion("post_id not between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorIsNull() {
            addCriterion("comment_author is null");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorIsNotNull() {
            addCriterion("comment_author is not null");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorEqualTo(String value) {
            addCriterion("comment_author =", value, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorNotEqualTo(String value) {
            addCriterion("comment_author <>", value, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorGreaterThan(String value) {
            addCriterion("comment_author >", value, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("comment_author >=", value, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorLessThan(String value) {
            addCriterion("comment_author <", value, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorLessThanOrEqualTo(String value) {
            addCriterion("comment_author <=", value, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorLike(String value) {
            addCriterion("comment_author like", value, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorNotLike(String value) {
            addCriterion("comment_author not like", value, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorIn(List<String> values) {
            addCriterion("comment_author in", values, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorNotIn(List<String> values) {
            addCriterion("comment_author not in", values, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorBetween(String value1, String value2) {
            addCriterion("comment_author between", value1, value2, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentAuthorNotBetween(String value1, String value2) {
            addCriterion("comment_author not between", value1, value2, "commentAuthor");
            return (Criteria) this;
        }

        public Criteria andCommentParentIsNull() {
            addCriterion("comment_parent is null");
            return (Criteria) this;
        }

        public Criteria andCommentParentIsNotNull() {
            addCriterion("comment_parent is not null");
            return (Criteria) this;
        }

        public Criteria andCommentParentEqualTo(Integer value) {
            addCriterion("comment_parent =", value, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentParentNotEqualTo(Integer value) {
            addCriterion("comment_parent <>", value, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentParentGreaterThan(Integer value) {
            addCriterion("comment_parent >", value, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentParentGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_parent >=", value, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentParentLessThan(Integer value) {
            addCriterion("comment_parent <", value, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentParentLessThanOrEqualTo(Integer value) {
            addCriterion("comment_parent <=", value, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentParentIn(List<Integer> values) {
            addCriterion("comment_parent in", values, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentParentNotIn(List<Integer> values) {
            addCriterion("comment_parent not in", values, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentParentBetween(Integer value1, Integer value2) {
            addCriterion("comment_parent between", value1, value2, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentParentNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_parent not between", value1, value2, "commentParent");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIsNull() {
            addCriterion("comment_status is null");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIsNotNull() {
            addCriterion("comment_status is not null");
            return (Criteria) this;
        }

        public Criteria andCommentStatusEqualTo(String value) {
            addCriterion("comment_status =", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotEqualTo(String value) {
            addCriterion("comment_status <>", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusGreaterThan(String value) {
            addCriterion("comment_status >", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("comment_status >=", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLessThan(String value) {
            addCriterion("comment_status <", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLessThanOrEqualTo(String value) {
            addCriterion("comment_status <=", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusLike(String value) {
            addCriterion("comment_status like", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotLike(String value) {
            addCriterion("comment_status not like", value, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusIn(List<String> values) {
            addCriterion("comment_status in", values, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotIn(List<String> values) {
            addCriterion("comment_status not in", values, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusBetween(String value1, String value2) {
            addCriterion("comment_status between", value1, value2, "commentStatus");
            return (Criteria) this;
        }

        public Criteria andCommentStatusNotBetween(String value1, String value2) {
            addCriterion("comment_status not between", value1, value2, "commentStatus");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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