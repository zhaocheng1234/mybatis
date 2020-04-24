package com.entity;

import java.util.List;

/**
 * Created by wei on 2020/4/21.
 */
public class Grade {
    List<Integer> stuNos;

    public Grade(List<Integer> stuNos) {
        this.stuNos = stuNos;
    }

    public Grade() {
    }

    public List<Integer> getStuNos() {
        return stuNos;
    }

    public void setStuNos(List<Integer> stuNos) {
        this.stuNos = stuNos;
    }
}
