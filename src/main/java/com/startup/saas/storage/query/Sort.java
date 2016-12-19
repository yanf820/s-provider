package com.startup.saas.storage.query;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/19.
 */
public class Sort {

    private List<Sort.Order> orders;
    private static Describe DEFAULT_DESCRIBE = Describe.ASC;

    Sort(List<Sort.Order> orders){
        this.orders = orders;
    }

    Sort(){}

    public Sort sort1(String... properties){
        return sort(DEFAULT_DESCRIBE,properties);
    }

    public void addOrder(Order order){
        this.orders.add(order);
    }

    public Sort sort1(Sort.Describe desc,String ... properties){
        if(properties.length == 0){
            throw new IllegalArgumentException("参数不能为空");
        }
        List<Sort.Order> orders = new ArrayList<>();
        for(String property : properties){
            Order order = new Order(property,desc);
            addOrder(order);
        }
        return this;
    }

    public static Sort sort(Sort.Describe desc,String... properties){
        return new Sort().sort1(desc,properties);
    }

    public static Sort sort(String... properties){
        return new Sort().sort1(properties);
    }


     class Order{
        private String property;
        private Describe describe;

        Order(String property,Describe desc){
            this.property = property;
            this.describe = desc;
        }

         public String getProperty() {
             return property;
         }

         public Describe getDescribe() {
             return describe;
         }
     }


    enum Describe{
        ASC,
        DESC
    }

}
