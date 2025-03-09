package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Scheduler {
    private List<ScheduleItem> schedule;

    public Scheduler() {
        this.schedule = new ArrayList<>();
    }

    public void addScheduleItem(ScheduleItem item) {
        schedule.add(item);
    }

    public List<ScheduleItem> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<ScheduleItem> schedule) {
        this.schedule = schedule;
    }
}
