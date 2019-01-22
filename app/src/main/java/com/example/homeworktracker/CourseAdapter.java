package com.example.homeworktracker;

import android.support.v7.widget.RecyclerView;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CourseAdapter extends RecyclerView.Adapter<CourseHolder> {
    private ArrayList<Course> courses;

    public CourseAdapter(ArrayList<Course> courses) {
        this.courses = courses;
    }

    @NonNull
    @Override
    public CourseHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // inflate the view
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.course, viewGroup, false);
        // create a view holder
        return new CourseHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseHolder courseHolder, int i) {
        // bind view holder to item at position i
        courseHolder.bindCourse(courses.get(i));
    }

    @Override
    public int getItemCount() {
        return courses.size();
    }
}
