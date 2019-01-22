package com.example.homeworktracker;

public class Homework {

    private String homeworkName;
    private Course linkedCourse = null;
    private String dueDate;
    private int timeSpent = 0;
    private int percentDone = 0;

    /* Homework class constructor */
    public Homework(String name, String dueDate, Course course) {
        this.homeworkName = name;
        this.dueDate = dueDate;
        this.linkedCourse = course;
    }

    /* Homework class constructor */
    public Homework(String name, String dueDate) {
        this.homeworkName = name;
        this.dueDate = dueDate;
        this.linkedCourse = null;
    }

    /* getter for homework name */
    public String getHomeworkName() {
        return homeworkName;
    }

    /* getter for course linked to homework */
    public Course getLinkedCourse() {
        return linkedCourse;
    }

    /* getter for name of course linked to homework */
    public String getLinkedCourseName() {
        if(linkedCourse == null)
            return null;
        else
            return linkedCourse.getCourseName();
    }

    /* getter for homework due date */
    public String getDueDate() {
        return dueDate;
    }

    /* getter for time spent on homework */
    public int getTimeSpent() {
        return timeSpent;
    }

    /* getter for percentage of homework done */
    public int getPercentDone() {
        return percentDone;
    }

    /* setter for percentage of homework done */
    public boolean setPercentDone(int percentDone) {
        if(percentDone >= 0 && percentDone <= 100) {
            this.percentDone = percentDone;
            return true;
        }
        return false;
    }

    /* setter for homework due date */
    public void setDueDate(String newDueDate) {
        this.dueDate = newDueDate;
    }

    /* setter for time spent on homework */
    public void setTimeSpent(int timeSpent) {
        this.timeSpent = timeSpent;
    }
}
