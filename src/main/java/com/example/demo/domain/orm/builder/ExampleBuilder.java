package com.example.demo.domain.orm.builder;

import com.example.demo.domain.orm.Example;

public final class ExampleBuilder {
    private Integer id;
    private String detail;
    private String userSys;
    private String serviceType;
    private String dateOpened;
    private String uniOrg;

    private ExampleBuilder() {
    }

    public static ExampleBuilder builder() {
        return new ExampleBuilder();
    }

    public ExampleBuilder id(Integer id) {
        this.id = id;
        return this;
    }

    public ExampleBuilder detail(String detail) {
        this.detail = detail;
        return this;
    }

    public ExampleBuilder userSys(String userSys) {
        this.userSys = userSys;
        return this;
    }

    public ExampleBuilder serviceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }

    public ExampleBuilder dateOpened(String dateOpened) {
        this.dateOpened = dateOpened;
        return this;
    }

    public ExampleBuilder uniOrg(String uniOrg) {
        this.uniOrg = uniOrg;
        return this;
    }

    public Example build() {
        Example example = new Example();
        example.setId(id);
        example.setDetail(detail);
        example.setUserSys(userSys);
        example.setServiceType(serviceType);
        example.setDateOpened(dateOpened);
        example.setUniOrg(uniOrg);
        return example;
    }
}
