package com.oritmalki.tourguideapp.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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
        ImageView titleImg = view.findViewById(R.id.att_img);
        titleImg.setImageResource(R.drawable.resturants);
        TextView titleText = view.findViewById(R.id.att_name);
        titleText.setText(R.string.restaurants);
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
