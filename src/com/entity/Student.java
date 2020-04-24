package com.entity;

/**
 * Created by wei on 2020/4/16.
 */
public class Student {
    private int stuno;
    private String stuname;
    private int stuage;
    private String graname;
    private boolean stusex;
    private Address address;
    private Card card;

    public void setCard(Card card) {
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setStusex(boolean stusex) {
        this.stusex = stusex;
    }

    public boolean isStusex() {
        return stusex;
    }



    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuno=" + stuno +
                ", stuname='" + stuname + '\'' +
                ", stuage=" + stuage +
                ", graname='" + graname + '\'' +
                ", stusex=" + stusex +
                ", address=" + address +
                ", card=" + card.getCardinfo()+", cardid="+card.getCardid() +
                '}';
    }

    public Student(int stuno, String stuname, int stuage, String graname, boolean stusex, Address address) {
        this.stuno = stuno;
        this.stuname = stuname;
        this.stuage = stuage;
        this.graname = graname;
        this.stusex = stusex;
        this.address = address;
    }

    public int getStuno() {
        return stuno;
    }

    public String getStuname() {
        return stuname;
    }

    public int getStuage() {
        return stuage;
    }

    public String getGraname() {
        return graname;
    }

    public void setStuno(int stuno) {
        this.stuno = stuno;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public void setStuage(int stuage) {
        this.stuage = stuage;
    }

    public void setGraname(String graname) {
        this.graname = graname;
    }
}
