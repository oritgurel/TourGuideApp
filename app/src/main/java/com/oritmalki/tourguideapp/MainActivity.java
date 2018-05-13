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
import com.oritmalki.tourguideapp.Fragments.RestaurantsFragment;
import com.oritmalki.tourguideapp.Model.Attraction;

public class MainActivity extends AppCompatActivity implements AttractionsAdapterCallback {

    DrawerLayout mDrawer;
    android.support.v4.app.FragmentManager fm;

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
                                RestaurantsFragment restFragment = new RestaurantsFragment();
                                fm.beginTransaction().replace(R.id.content_frame, restFragment).commit();
                        }

                        return true;
                    }
                });


        AttractionsFragment attractionsFragment = new AttractionsFragment();

        fm.beginTransaction().replace(R.id.content_frame, attractionsFragment).commit();

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
       switch (attraction.getName()) {
           case "Restaurants":
               RestaurantsFragment restaurantsFragment = new RestaurantsFragment();
               fm.beginTransaction().replace(R.id.content_frame, restaurantsFragment).commit();

               //TODO other fragments as well (sites, events)

       }
    }
}
