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

import com.oritmalki.tourguideapp.Adapters.AttractionAdapter;
import com.oritmalki.tourguideapp.Model.Attraction;
import com.oritmalki.tourguideapp.Model.DataGen;
import com.oritmalki.tourguideapp.R;

import java.util.List;

public class AttractionsFragment extends Fragment {

    RecyclerView attractionRecycler;
    AttractionAdapter attractionAdapter;
    List<Attraction> attractionList;

    public AttractionsFragment() {
        super();
    }

    public AttractionsFragment getInstance() {
        return new AttractionsFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        attractionList = DataGen.initializeData(attractionList);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_attractions, container, false);
        initRecyclerAttList(view);
        return view;


    }



    public void initRecyclerAttList(View view) {
        attractionRecycler = view.findViewById(R.id.attraction_list);
        LinearLayoutManager lm = new LinearLayoutManager(getContext());
        attractionRecycler.setLayoutManager(lm);
        attractionAdapter = new AttractionAdapter(attractionList);
        attractionRecycler.setAdapter(attractionAdapter);
    }
}
