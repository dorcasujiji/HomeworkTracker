package com.example.homeworktracker;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class HomeworkHolder extends RecyclerView.ViewHolder{
    TextView homeworkName;
    TextView homeworkDueDate;
    TextView percentage;
    TextView linkedCourse;
    ProgressBar progressBar;

    public HomeworkHolder(View view) {
        super(view);
        homeworkName = view.findViewById(R.id.homeworkName);
        homeworkDueDate = view.findViewById(R.id.homeworkDueDate);
        percentage = view.findViewById(R.id.percentage);
        linkedCourse = view.findViewById(R.id.linkedCourse);
        progressBar = view.findViewById(R.id.progressBar);
    }

    public void bindHomework(Homework homework) {
        homeworkName.setText(homework.getHomeworkName());
        homeworkDueDate.setText(homework.getDueDate());

        int percent = homework.getPercentDone();
        percentage.setText(Integer.toString(percent) + "% Done");
        progressBar.setProgress(percent);

        String courseName = homework.getLinkedCourseName();
        if(courseName != null) {
            linkedCourse.setText(courseName);
        }
    }
}
