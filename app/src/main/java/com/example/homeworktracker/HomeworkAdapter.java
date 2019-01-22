package com.example.homeworktracker;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class HomeworkAdapter extends RecyclerView.Adapter<HomeworkHolder>{
    private ArrayList<Homework> homeworks = new ArrayList<>();

    public HomeworkAdapter(ArrayList<Homework> homeworks) {
        this.homeworks = homeworks;
    }

    @NonNull
    @Override
    public HomeworkHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.homework, viewGroup, false);
        return new HomeworkHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeworkHolder homeworkHolder, int i) {
        // bind to homework at position i
        homeworkHolder.bindHomework(homeworks.get(i));
    }

    @Override
    public int getItemCount() {
        return homeworks.size();
    }
}
