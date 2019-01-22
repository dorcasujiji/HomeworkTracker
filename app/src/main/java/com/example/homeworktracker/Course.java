package com.example.homeworktracker;

public class Course {
    private String name;
    private String dayTAHours;
    private String dayOfficeHours;
    private String startTAHours;
    private String endTAHours;
    private String startOfficeHours;
    private String endOfficeHours;

    public Course(String name){
        this.name = name;
        this.dayOfficeHours = "Day";
        this.startOfficeHours = "0:00AM";
        this.endOfficeHours = "0:00AM";
        this.dayTAHours = "Day";
        this.startTAHours = "0:00AM";
        this.endTAHours = "0:00AM";
    }

    public Course(String name, String dayOfficeHours, String startOfficeHours, String endOfficeHours) {
        this.name = name;
        this.dayOfficeHours = dayOfficeHours;
        this.startOfficeHours = startOfficeHours;
        this.endOfficeHours = endOfficeHours;
        this.dayTAHours = "Day";
        this.startTAHours = "0:00AM";
        this.endTAHours = "0:00AM";
    }

    public Course(String name, String dayOfficeHours, String startOfficeHours,
                  String endOfficeHours, String dayTAHours, String startTAHours,
                  String endTAHours)
    {
        this.name = name;
        this.dayOfficeHours = dayOfficeHours;
        this.startOfficeHours = startOfficeHours;
        this.endOfficeHours = endOfficeHours;
        this.dayTAHours = dayTAHours;
        this.startTAHours = startTAHours;
        this.endTAHours = endTAHours;
    }

    public String getCourseName() {
        return name;
    }

    public String getDayTAHours() {
        return dayTAHours;
    }

    public String getBeginningTAHours() {
        return startTAHours;
    }

    public String getEndTAHours() {
        return endTAHours;
    }

    public String getDayOfficeHours() {
        return dayOfficeHours;
    }

    public String getBeginningOfficeHours() {
        return startOfficeHours;
    }

    public String getEndOfficeHours() {
        return endOfficeHours;
    }
}
