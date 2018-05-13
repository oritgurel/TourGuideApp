package com.oritmalki.tourguideapp.Adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.oritmalki.tourguideapp.Model.Resturatnt;
import com.oritmalki.tourguideapp.R;

import java.util.List;

public class RestaurantAdapter extends Adapter<RestaurantAdapter.RestHolder> {

    List<Resturatnt> resturatntList;
    Context context;

    public RestaurantAdapter(List<Resturatnt> restaurantList, Context context) {
        this.resturatntList = restaurantList;
        this.context = context;
    }

    @NonNull
    @Override
    public RestHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_rest, parent, false);
        return new RestHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestHolder holder, int position) {
        holder.restImage.setImageResource(resturatntList.get(position).getImage());
        holder.restName.setText(resturatntList.get(position).getName());
        holder.restType.setText(resturatntList.get(position).getType());
        String website = resturatntList.get(position).getWebsite();
        holder.restWebsite.setText(website);
        holder.restPhone.setText(resturatntList.get(position).getPhone());
        String address = resturatntList.get(position).getAddress();
        final String map = "http://maps.google.co.in/maps?q=" + address;
        holder.restAddress.setText(address);
        holder.restAddress.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(map));
                context.startActivity(mapIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return resturatntList.size();
    }

    public static class RestHolder extends ViewHolder{

        TextView restName;
        ImageView restImage;
        TextView restPhone;
        TextView restWebsite;
        TextView restAddress;
        TextView restType;

        public RestHolder(View itemView) {
            super(itemView);
            restName = itemView.findViewById(R.id.rest_name);
            restImage = itemView.findViewById(R.id.rest_image_item);
            restPhone = itemView.findViewById(R.id.item_phone_number);
            restAddress = itemView.findViewById(R.id.item_address);
            restWebsite = itemView.findViewById(R.id.item_website_url);
            restWebsite.setMovementMethod(LinkMovementMethod.getInstance());
            restType = itemView.findViewById(R.id.rest_type);
        }
    }
}
