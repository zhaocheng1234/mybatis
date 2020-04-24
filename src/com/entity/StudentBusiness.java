package com.entity;

/**
 * Created by wei on 2020/4/22.
 */
public class StudentBusiness extends Student {
    private int cardid;
    private String cardinfo;

    public StudentBusiness() {
    }

    public int getCardid() {
        return cardid;
    }

    public String getCardinfo() {
        return cardinfo;
    }

    public void setCardid(int cardid) {
        this.cardid = cardid;
    }

    public void setCardinfo(String cardinfo) {
        this.cardinfo = cardinfo;
    }

    @Override
    public String toString() {
        return "StudentBusiness{" +
                "cardid=" + cardid +
                ", cardinfo='" + cardinfo + '\'' +
                '}';
    }
}
