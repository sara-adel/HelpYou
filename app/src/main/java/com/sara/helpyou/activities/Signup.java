package com.sara.helpyou.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import java.util.ArrayList;

import com.sara.helpyou.R;


public class Signup extends AppCompatActivity {

    private Spinner city, jobTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        initViews();
    }

    public void initViews(){

        city = findViewById(R.id.signup_city);
        jobTitle = findViewById(R.id.signup_job);

        dataOfSpinner();
    }

    private void dataOfSpinner(){

        ArrayAdapter<String> city_adapter;
        ArrayList<String> list_city;

        ArrayAdapter<String> job_adapter;
        ArrayList<String> list_job;

        list_city = new ArrayList<String>();
        list_city.add("cairo");
        list_city.add("Alex");
        list_city.add("Sheben");
        list_city.add("Tanta");
        list_city.add("Mansoura");

        city_adapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_spinner_item, list_city);
        city_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        city.setAdapter(city_adapter);

        list_job = new ArrayList<>();
        list_job.add("Food");
        list_job.add("Clothes");
        list_job.add("Bags");
        list_job.add("Book Stores");
        list_job.add("Super Market");

        job_adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_spinner_item, list_job);
        job_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        jobTitle.setAdapter(job_adapter);
    }
}
