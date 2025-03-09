package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class ScheduleItem {
    private int ordernum;
    private String recType;
    private int startTime;
    private int endTime;
    private Double[] pointFrom;
    private Double[] pointTo;
    private double cost;
    private List<String> allParams;

    public ScheduleItem(int ordernum, String recType, int startTime, int endTime,
                        Double[] pointFrom, Double[] pointTo, double cost, List<String> allParams) {
        this.ordernum = ordernum;
        this.recType = recType;
        this.startTime = startTime;
        this.endTime = endTime;
        this.pointFrom = pointFrom;
        this.pointTo = pointTo;
        this.cost = cost;
        this.allParams = allParams;
    }

    // Геттеры и сеттеры для всех полей

    public int getOrderNum() {
        return ordernum;
    }

    public void setOrderNum(int order) {
        this.ordernum = ordernum;
    }

    public String getRecType() {
        return recType;
    }

    public void setRecType(String recType) {
        this.recType = recType;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public Double[] getPointFrom() {
        return pointFrom;
    }

    public void setPointFrom(Double[] pointFrom) {
        this.pointFrom = pointFrom;
    }

    public Double[] getPointTo() {
        return pointTo;
    }

    public void setPointTo(Double[] pointTo) {
        this.pointTo = pointTo;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public List<String> getAllParams() {
        return allParams;
    }

    public void setAllParams(List<String> allParams) {
        this.allParams = allParams;
    }
}
