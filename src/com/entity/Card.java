package com.entity;

/**
 * Created by wei on 2020/4/22.
 */
public class Card {
    private int cardid;
    private String cardinfo;

    public Card(int cardid, String cardinfo) {
        this.cardid = cardid;
        this.cardinfo = cardinfo;
    }

    public Card() {
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
}
