package com.example.homeworktracker;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements
        HomeFragment.OnFragmentInteractionListener,
        CourseFragment.OnFragmentInteractionListener,
        SettingsFragment.OnFragmentInteractionListener,
        LogoutFragment.OnFragmentInteractionListener,
        AddHomeworkFragment.OnFragmentInteractionListener,
        AddCourseFragment.OnFragmentInteractionListener
{

    private ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = findViewById(R.id.bottomNavigator);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        toolbar = getSupportActionBar();
        toolbar.setTitle("My Home");

        loadFragment(new HomeFragment());
//        toolbar.setTitle("Home>>");
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    toolbar.setTitle("Home");
                    fragment = new HomeFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_courses:
                    toolbar.setTitle("Courses");
                    fragment = new CourseFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_settings:
                    toolbar.setTitle("Settings");
                    fragment = new SettingsFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_logout:
                    toolbar.setTitle("Log Out");
                    fragment = new LogoutFragment();
                    loadFragment(fragment);
                    return true;
            }
            return false;
        }
    };

    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        if(fragment instanceof HomeFragment) {
            HomeFragment homeFragment = (HomeFragment) fragment;
            homeFragment.setOnFragmentInteractionListener(this);
        } else if(fragment instanceof CourseFragment) {
            CourseFragment courseFragment = (CourseFragment) fragment;
            courseFragment.setOnFragmentInteractionListener(this);
        } else if(fragment instanceof SettingsFragment) {
            SettingsFragment settingsFragment = (SettingsFragment) fragment;
            settingsFragment.setOnFragmentInteractionListener(this);
        } else if(fragment instanceof LogoutFragment){
            LogoutFragment logoutFragment = (LogoutFragment) fragment;
            logoutFragment.setOnFragmentInteractionListener(this);
        } else if(fragment instanceof AddHomeworkFragment){
            AddHomeworkFragment addHomeworkFragment = (AddHomeworkFragment) fragment;
            addHomeworkFragment.setOnFragmentInteractionListener(this);
        }  else {
            AddCourseFragment settingsFragment = (AddCourseFragment) fragment;
            settingsFragment.setOnFragmentInteractionListener(this);
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri){
        // do nothing
    }

}