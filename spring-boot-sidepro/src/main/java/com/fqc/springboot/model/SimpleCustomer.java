package com.fqc.springboot.model;

/**
 * Created by fqc on 2016/7/11.
 */
public class SimpleCustomer {
    private String id;
    private String name;

    public SimpleCustomer() {
    }

    public SimpleCustomer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
