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

import com.oritmalki.tourguideapp.Adapters.PlacesAdapter;
import com.oritmalki.tourguideapp.Model.Attraction;
import com.oritmalki.tourguideapp.Model.Event;
import com.oritmalki.tourguideapp.Model.Restaurant;
import com.oritmalki.tourguideapp.Model.Site;
import com.oritmalki.tourguideapp.R;

import java.io.Serializable;
import java.util.List;

public class PlacesFragment extends Fragment {

    RecyclerView restRecycler;
    PlacesAdapter restaurantAdapter;
    public static final String PLACES_LIST_ARGS = "places_list_args";
    List<? extends Attraction> placeList;
    String title;
    int titleImage;

    public PlacesFragment() {
        super();
    }

    public static PlacesFragment getInstance(List<? extends Attraction> placesList) {
        PlacesFragment placesFragment = new PlacesFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(PLACES_LIST_ARGS, (Serializable) placesList);
        placesFragment.setArguments(bundle);
        return placesFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        placeList = (List<? extends Attraction>) getArguments().getSerializable(PLACES_LIST_ARGS);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_places, container, false);

        //get List<> type


        if (placeList.get(0) instanceof Restaurant) {

            //get title for toolbar
            title = getResources().getString(R.string.restaurants);
            //get image for appbar
            titleImage = R.drawable.resturants;
        }
        else if (placeList.get(0) instanceof Site) {
            //get title for toolbar
            title = getResources().getString(R.string.sites);
            //get image for appbar
            titleImage = R.drawable.sites;
        }
        else if (placeList.get(0) instanceof Event) {
            //get title for toolbar
            title = getResources().getString(R.string.events);
            //get image for appbar
            titleImage = R.drawable.events;
        }


        Toolbar toolbar = view.findViewById(R.id.rest_frag_toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        ActionBar actionBar = ((AppCompatActivity)getActivity()).getSupportActionBar();
        actionBar.setTitle(title);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);


        ImageView titleImg = view.findViewById(R.id.att_img);
        titleImg.setImageResource(titleImage);

        initRecyclerRestList(view);
        return view;


    }



    public void initRecyclerRestList(View view) {
        restRecycler = view.findViewById(R.id.rest_recycler);
        LinearLayoutManager lm = new LinearLayoutManager(getContext());
        restRecycler.setLayoutManager(lm);
        restaurantAdapter = new PlacesAdapter(placeList, getContext());
        restRecycler.setAdapter(restaurantAdapter);
    }
}
