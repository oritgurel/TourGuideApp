package com.oritmalki.tourguideapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.oritmalki.tourguideapp.Fragments.AttractionsFragment;
import com.oritmalki.tourguideapp.Fragments.PlacesFragment;
import com.oritmalki.tourguideapp.Model.Attraction;
import com.oritmalki.tourguideapp.Model.DataGen;
import com.oritmalki.tourguideapp.Model.Event;
import com.oritmalki.tourguideapp.Model.Restaurant;
import com.oritmalki.tourguideapp.Model.Site;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AttractionsAdapterCallback {

    DrawerLayout mDrawer;
    android.support.v4.app.FragmentManager fm;

    List<Restaurant> restaurantList;
    List<Site> siteList;
    List<Event> eventList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_drawer_layout);
        fm = getSupportFragmentManager();

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);


        mDrawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        item.setChecked(true);
                        mDrawer.closeDrawers();

                        switch (item.getItemId()) {
                            case R.id.nav_restaurants:
                                PlacesFragment restFragment = PlacesFragment.getInstance(DataGen.initRestaurantListData(restaurantList));
                                fm.beginTransaction().replace(R.id.content_frame, restFragment).addToBackStack(restFragment.getTag()).commit();
                                break;
                            case R.id.nav_sites:
                                PlacesFragment sitesFragment = PlacesFragment.getInstance(DataGen.initSiteListData(siteList));
                                fm.beginTransaction().replace(R.id.content_frame, sitesFragment).addToBackStack(sitesFragment.getTag()).commit();
                                break;
                            case R.id.nav_events:
//                                TODO fill event list with DataGen
                                PlacesFragment eventsFragment = PlacesFragment.getInstance(DataGen.initEventListData(eventList));
                                fm.beginTransaction().replace(R.id.content_frame, eventsFragment).addToBackStack(eventsFragment.getTag()).commit();
                                  break;
                            case R.id.nav_home:
                                AttractionsFragment attractionsFragment = new AttractionsFragment();
                                fm.beginTransaction().replace(R.id.content_frame, attractionsFragment).commit();

                        }

                        return true;
                    }
                });


        AttractionsFragment attractionsFragment = new AttractionsFragment();

        fm.beginTransaction().replace(R.id.content_frame, attractionsFragment).addToBackStack(attractionsFragment.getTag()).commit();

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawer.openDrawer(GravityCompat.START);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onAttractionSelected(Attraction attraction) {
        PlacesFragment placesFragment;

       switch (attraction.getName()) {
           case "Restaurants":
           placesFragment = PlacesFragment.getInstance(DataGen.initRestaurantListData(restaurantList));
               fm.beginTransaction().replace(R.id.content_frame, placesFragment).commit();
               break;

               //TODO other fragments as well (sites, events)
           case "Sites":
               placesFragment = PlacesFragment.getInstance(DataGen.initSiteListData(siteList));
               fm.beginTransaction().replace(R.id.content_frame, placesFragment).commit();
               break;

           case "Events":
               placesFragment = PlacesFragment.getInstance(DataGen.initEventListData(eventList));
               fm.beginTransaction().replace(R.id.content_frame, placesFragment).commit();
               break;

       }
    }
}
