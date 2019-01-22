package com.example.homeworktracker;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class CourseHolder extends RecyclerView.ViewHolder {
    TextView courseText;
    TextView taHoursText;
    TextView officeHoursText;

    public CourseHolder(@NonNull View itemView) {
        super(itemView);
        // find the views within course cards
        courseText = itemView.findViewById(R.id.courseName);
        taHoursText = itemView.findViewById(R.id.taHours);
        officeHoursText = itemView.findViewById(R.id.officeHours);
    }

    public void bindCourse(Course course) {
        courseText.setText(course.getCourseName());
        // "TA hours: Def 0:00PM - 0:00PM"
        taHoursText.setText( "TA hours: "
                + course.getDayTAHours() + " " +
                course.getBeginningTAHours() + " - " +
                course.getEndTAHours());

        // "Office Hours: Def 0:00AM - 0:00AM"
        officeHoursText.setText( "Office hours: "
                + course.getDayOfficeHours() + " " +
                course.getBeginningOfficeHours() + " - " +
                course.getEndOfficeHours());
    }
}
