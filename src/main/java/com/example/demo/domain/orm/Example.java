package com.example.demo.domain.orm;

import javax.persistence.*;

@Table
@Entity
public class Example {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String detail;
    private String userSys;
    private String serviceType;
    private String dateOpened;
    private String uniOrg;

    public Example() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getUserSys() {
        return userSys;
    }

    public void setUserSys(String userSys) {
        this.userSys = userSys;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getDateOpened() {
        return dateOpened;
    }

    public void setDateOpened(String dateOpened) {
        this.dateOpened = dateOpened;
    }

    public String getUniOrg() {
        return uniOrg;
    }

    public void setUniOrg(String uniOrg) {
        this.uniOrg = uniOrg;
    }
}
