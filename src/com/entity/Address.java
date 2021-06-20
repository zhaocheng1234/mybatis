package com.entity;

/**
 * Created by wei on 2020/4/19.
 */
public class Address {
    private String homeAddress;
    private String schoolAddress1;
    private String testtoday;
    public Address() {
    }

    public Address(String homeAddress, String schoolAddress1) {
        this.homeAddress = homeAddress;
        this.schoolAddress = schoolAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }
}
