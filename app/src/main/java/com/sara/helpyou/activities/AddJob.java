package com.sara.helpyou.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import java.util.ArrayList;

import com.sara.helpyou.R;

public class AddJob extends AppCompatActivity {

    private Spinner city_search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_job);

        initViews();
    }

    public void initViews(){
        city_search = findViewById(R.id.addJob_city);

       dataOfSpinner();
    }

    public void dataOfSpinner(){
        ArrayAdapter<String> city;
        ArrayList<String> list_city_search;

        list_city_search = new ArrayList<String>();
        list_city_search.add("cairo");
        list_city_search.add("Alex");
        list_city_search.add("Sheben");
        list_city_search.add("Tanta");
        list_city_search.add("Mansoura");

        city = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_spinner_item, list_city_search);
        city.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        city_search.setAdapter(city);

    }
}