package com.sara.helpyou.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.sara.helpyou.ItemClickListener;
import com.sara.helpyou.Model.Data;
import com.sara.helpyou.R;
import com.sara.helpyou.activities.AddJob;
import com.sara.helpyou.activities.Profile;
import com.sara.helpyou.adapter.FixerAdapter;

import java.util.ArrayList;

/**
 * Created by sara on 3/20/2018.
 */

public class HomeUser extends Fragment {

    View view;
    private Spinner city_search;
    private FloatingActionButton add;
    private RecyclerView listData;
    LinearLayoutManager layoutManager;
    private FixerAdapter fixAdapter;
    private ArrayList<Data> users;

    private int[] icons = {R.drawable.home ,
            R.drawable.profile,
            R.drawable.contacts,
            R.drawable.settings};

    private String[] names = {"sara", "Ahmed", "Moustafa", "Enas"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.home_user, container, false);

        initViews();

        return view;
    }

    public void initViews(){
        city_search = view.findViewById(R.id.city_search);
        add = view.findViewById(R.id.fab_add);
        listData = view.findViewById(R.id.user_list);

        layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        listData.setLayoutManager(layoutManager);
        listData.setHasFixedSize(true);

        users = getData();
        fixAdapter = new FixerAdapter(getContext() , users);
        listData.setAdapter(fixAdapter);

        fixAdapter.setItemClickLister(new ItemClickListener() {
            @Override
            public void onClick(View view, int position) {
                Intent intent = new Intent(getContext(), Profile.class);
                startActivity(intent);
            }
        });

        ArrayAdapter<String> city_adapter;
        ArrayList<String> list_city;

        list_city = new ArrayList<String>();
        list_city.add("cairo");
        list_city.add("Alex");
        list_city.add("Sheben");
        list_city.add("Tanta");
        list_city.add("Mansoura");

        city_adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, list_city);
        city_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        city_search.setAdapter(city_adapter);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AddJob.class);
                startActivity(intent);
            }
        });
    }

    private ArrayList<Data> getData(){

        ArrayList<Data> rowItem = new ArrayList<>();
        for (int i = 0 ; i < names.length ; i++){
            Data itemModel = new Data();
            itemModel.setImage(icons[i]);
            itemModel.setName(names[i]);
            rowItem.add(itemModel);
        }
        return rowItem;
    }

}