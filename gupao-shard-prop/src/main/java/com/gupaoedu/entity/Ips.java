package com.gupaoedu.entity;

import java.io.Serializable;

/**
 * ips表
 * 2020-11-11
 * */
public class Ips implements Serializable {
    private String flowTime;
    private Integer value;

    public String getFlowTime() {
        return flowTime;
    }

    public void setFlowTime(String flowTime) {
        this.flowTime = flowTime;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Ips{" +
                "flowTime='" + flowTime + '\'' +
                ", value=" + value +
                '}';
    }
}