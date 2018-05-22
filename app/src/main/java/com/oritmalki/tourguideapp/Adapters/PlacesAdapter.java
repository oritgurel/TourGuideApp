package com.oritmalki.tourguideapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.oritmalki.tourguideapp.Adapters.PlacesAdapter.PlaceHolder;
import com.oritmalki.tourguideapp.Model.Attraction;
import com.oritmalki.tourguideapp.Model.Restaurant;
import com.oritmalki.tourguideapp.R;

import java.util.List;

public class PlacesAdapter extends Adapter<PlaceHolder> {

    List<? extends Attraction> placesList;
    Context context;

    public PlacesAdapter(List<? extends Attraction> placesList, Context context) {
        this.placesList = placesList;
        this.context = context;
    }

    @NonNull
    @Override
    public PlaceHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_place, parent, false);
        return new PlaceHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceHolder holder, int position) {
        holder.placeImage.setImageResource(placesList.get(position).getImage());
        holder.placeName.setText(placesList.get(position).getName());
        //setting a link with text "visit site"
        makeWebLink(holder.placeWebsite, placesList.get(position).getWebsite(), "Visit Website");

        //holder.placePhone.setText(placesList.get(position).getPhone());
        makePhoneLink(holder.placePhone, placesList.get(position).getPhone(), "Call Venue");

        String address = placesList.get(position).getAddress();
        final String map = "http://maps.google.co.in/maps?q=" + address;
        holder.placeAddress.setText(address);
        holder.placeAddress.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                context.startActivity(mapIntent);
            }
        });

        //this parameter is relevant only to restaurants, so it is cast to Restaurant
        if (placesList.get(position) instanceof Restaurant) {
            holder.restType.setText(((Restaurant) placesList.get(position)).getType());
        }


    }

    @Override
    public int getItemCount() {
        return placesList.size();
    }

    public void makeWebLink(TextView textView, String url, String visibleText) {
        String text = "<a href='" + url + "'> " + visibleText + "</a>";
        textView.setText(Html.fromHtml(text));
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void makePhoneLink(TextView textView, String phoneNum, String visibleText) {
        String text = "<a href='" + "tel://" + phoneNum + "'> " + visibleText + "</a>";
        textView.setText(Html.fromHtml(text));
        textView.setClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static class PlaceHolder extends ViewHolder{

        TextView placeName;
        ImageView placeImage;
        TextView placePhone;
        TextView placeWebsite;
        TextView placeAddress;
        TextView restType;

        public PlaceHolder(View itemView) {
            super(itemView);
            placeName = itemView.findViewById(R.id.rest_name);
            placeImage = itemView.findViewById(R.id.rest_image_item);
            placePhone = itemView.findViewById(R.id.item_phone_number);
            placeAddress = itemView.findViewById(R.id.item_address);
            placeWebsite = itemView.findViewById(R.id.item_website_url);
            placeWebsite.setMovementMethod(LinkMovementMethod.getInstance());
            restType = itemView.findViewById(R.id.rest_type);
        }
    }
}
