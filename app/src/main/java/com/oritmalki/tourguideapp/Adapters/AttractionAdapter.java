package com.oritmalki.tourguideapp.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.oritmalki.tourguideapp.Model.Attraction;
import com.oritmalki.tourguideapp.R;

import java.util.List;

public class AttractionAdapter extends Adapter<AttractionAdapter.AttHolder> {

    List<Attraction> attractionList;

    public AttractionAdapter(List<Attraction> attractionList) {
        this.attractionList = attractionList;
    }

    @NonNull
    @Override
    public AttHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_attractions, parent, false);
        return new AttHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AttHolder holder, int position) {
        holder.attImg.setImageResource(attractionList.get(position).getImage());
        holder.attName.setText(attractionList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return attractionList.size();
    }

    public static class AttHolder extends ViewHolder{

        TextView attName;
        ImageView attImg;

        public AttHolder(View itemView) {
            super(itemView);
            attName = itemView.findViewById(R.id.att_name);
            attImg = itemView.findViewById(R.id.att_img);
        }
    }
}
