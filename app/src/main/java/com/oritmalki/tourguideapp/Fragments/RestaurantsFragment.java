package com.oritmalki.tourguideapp.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.oritmalki.tourguideapp.Adapters.RestaurantAdapter;
import com.oritmalki.tourguideapp.Model.DataGen;
import com.oritmalki.tourguideapp.Model.Resturatnt;
import com.oritmalki.tourguideapp.R;

import java.util.List;

public class RestaurantsFragment extends Fragment {

    RecyclerView restRecycler;
    RestaurantAdapter restaurantAdapter;
    List<Resturatnt> restaurantList;

    public RestaurantsFragment() {
        super();
    }

    public RestaurantsFragment getInstance() {
        return new RestaurantsFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        restaurantList = DataGen.initRestaurantListData(restaurantList);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_restaurants, container, false);

        Toolbar toolbar = view.findViewById(R.id.rest_frag_toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        ActionBar actionBar = ((AppCompatActivity)getActivity()).getSupportActionBar();
        actionBar.setTitle(getResources().getString(R.string.restaurants));
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);


        ImageView titleImg = view.findViewById(R.id.att_img);
        titleImg.setImageResource(R.drawable.resturants);

        initRecyclerRestList(view);
        return view;


    }



    public void initRecyclerRestList(View view) {
        restRecycler = view.findViewById(R.id.rest_recycler);
        LinearLayoutManager lm = new LinearLayoutManager(getContext());
        restRecycler.setLayoutManager(lm);
        restaurantAdapter = new RestaurantAdapter(restaurantList, getContext());
        restRecycler.setAdapter(restaurantAdapter);
    }
}
