package com.startup.saas.storage.query;

import java.util.HashMap;
import java.util.Map;

import static com.startup.saas.storage.query.Criteria.and;
import static com.startup.saas.storage.query.Criteria.eq;

/**
 * Created by Administrator on 2016/12/14.
 */
public class Query<T> {

    private static Map<String,Object> conditions = new HashMap<String, Object>();
    private Criteria criteria;
    private boolean not_set = true;
    private int start;
    private int len;
    private Sort sort;


    Query(){}

    public static Query newQuery(){
        return new Query();
    }

    public static Query query(Criteria criteria){
        Query query = newQuery();
        query.criteria = criteria;
        query.not_set = false;
        return query;
    }

    public Query limit(int start,int len){
        this.start = start;
        this.len = len;
        return this;
    }

    public Query order(Sort sort){
        this.sort = sort;
        return this;
    }


    public static Map<String, Object> getConditions() {
        return conditions;
    }

    public static void setConditions(Map<String, Object> conditions) {
        Query.conditions = conditions;
    }

    public Criteria getCriteria() {
        return criteria;
    }

    public void setCriteria(Criteria criteria) {
        this.criteria = criteria;
    }

    public boolean isNot_set() {
        return not_set;
    }

    public void setNot_set(boolean not_set) {
        this.not_set = not_set;
    }

    public int getStart() {
        return start;
    }

    public int getLen() {
        return len;
    }

    public Sort getSort() {
        return sort;
    }

    public static void main(String args[]){
        Query.query(and(eq("id","123")));
    }





}
