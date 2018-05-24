package com.oritmalki.tourguideapp.Adapters;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.github.aakira.expandablelayout.Utils;
import com.oritmalki.tourguideapp.Adapters.PlacesAdapter.PlaceViewHolder;
import com.oritmalki.tourguideapp.Model.Attraction;
import com.oritmalki.tourguideapp.Model.Event;
import com.oritmalki.tourguideapp.Model.Restaurant;
import com.oritmalki.tourguideapp.Model.Site;
import com.oritmalki.tourguideapp.R;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.List;
import java.util.Locale;

public class PlacesAdapter extends Adapter<PlaceViewHolder> {

    List<? extends Attraction> placesList;
    Context context;
    private boolean isExpanded;
//    private SparseBooleanArray expandState = new SparseBooleanArray();

    public PlacesAdapter(List<? extends Attraction> placesList, Context context) {
        this.placesList = placesList;
        this.context = context;
//        for (int i = 0; i < placesList.size(); i++) {
//            expandState.append(i, false);
//        }
    }

    @NonNull
    @Override
    public PlaceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_place, parent, false);
        return new PlaceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final PlaceViewHolder holder, final int position) {

        //bind price and opening hours in expanded
        if (placesList.get(position) instanceof Site) {
            if (placesList.get(position).getPrice() != null)
                holder.price_title.setVisibility(View.VISIBLE);
            holder.price.setVisibility(View.VISIBLE);
            holder.price.setText(placesList.get(position).getPrice());
            if (placesList.get(position).getOpeningHours() != null) {
                holder.opening_title.setVisibility(View.VISIBLE);
                holder.openingHours.setVisibility(View.VISIBLE);
                holder.openingHours.setText((placesList.get(position)).getOpeningHours());
            }
        }
        //make dates item
        if (placesList.get(position) instanceof Event) {
            Event event = (Event) placesList.get(position);
            for (DateTime dateTime : event.getDates()) {
                ViewGroup dateItem = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.dates_item, holder.expandableLayout, false);
                TextView day = dateItem.findViewById(R.id.day);
                day.setText(formatDay(dateTime));
                TextView date = dateItem.findViewById(R.id.date);
                date.setText(formatDate(dateTime));
                TextView venue = dateItem.findViewById(R.id.venue);
                venue.setText(event.getVenue());
                TextView time = dateItem.findViewById(R.id.time);
                time.setText(formatTime(dateTime));
                holder.description.setText(event.getDescription());
//
                holder.expandableLayout.addView(dateItem, 0);
            }
        }
        holder.placeImage.setImageResource(placesList.get(position).getImage());
        holder.placeName.setText(placesList.get(position).getName());
        holder.description.setText(placesList.get(position).getDescription());
        //setting a link with text "visit site"
        makeWebLink(holder.placeWebsite, placesList.get(position).getWebsite(), "Visit Website");

        //holder.placePhone.setText(placesList.get(position).getPhone());
        makePhoneLink(holder.placePhone, placesList.get(position).getPhone(), "Call Venue");

        String address = placesList.get(position).getAddress();
        final String map = "http://maps.google.co.in/maps?q=" + address;
        holder.placeAddress.setText(address);
//        holder.expandableLayout.setLayoutAnimationListener(new AnimationListener() {
//            @Override
//            public void onAnimationStart(Animation animation) {
//                createRotateAnimator(holder.moreInfo, 0f, 180f).start();
//                isExpanded = true;
//            }
//
//            @Override
//            public void onAnimationEnd(Animation animation) {
//                createRotateAnimator(holder.moreInfo, 180f, 0f).start();
//                isExpanded = false;
//
//            }
//
//            @Override
//            public void onAnimationRepeat(Animation animation) {
//
//            }
//        });


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
        holder.moreInfo.setRotation((isExpanded) ? 180f : 0f);
        holder.moreInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//
                if (!isExpanded) {
                    holder.expandableLayout.setVisibility(View.VISIBLE);
                    isExpanded = true;
                } else {
                    holder.expandableLayout.setVisibility(View.GONE);
                    isExpanded = false;

                }
            }
        });
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

    public static class PlaceViewHolder extends RecyclerView.ViewHolder {
        //main holders
        TextView placeName;
        ImageView placeImage;
        TextView placePhone;
        TextView placeWebsite;
        TextView placeAddress;
        TextView restType;
        //expandable layout holders
        LinearLayout expandableLayout;
        TextView openingHours;
        TextView price;
        TextView opening_title;
        TextView price_title;
        TextView moreInfo;
        TextView description;

        public PlaceViewHolder(View itemView) {
            super(itemView);
            placeName = itemView.findViewById(R.id.place_name);
            placeImage = itemView.findViewById(R.id.rest_image_item);
            placePhone = itemView.findViewById(R.id.item_phone_number);
            placeAddress = itemView.findViewById(R.id.item_address);
            placeWebsite = itemView.findViewById(R.id.item_website_url);
            placeWebsite.setMovementMethod(LinkMovementMethod.getInstance());
            restType = itemView.findViewById(R.id.rest_type);

            expandableLayout = itemView.findViewById(R.id.expanded_content);
            openingHours = itemView.findViewById(R.id.opening);
            price = itemView.findViewById(R.id.price);
            opening_title = itemView.findViewById(R.id.open_title);
            price_title = itemView.findViewById(R.id.price_title);
            moreInfo = itemView.findViewById(R.id.more_expand);
            description = itemView.findViewById(R.id.description);

        }

    }

    public ObjectAnimator createRotateAnimator(final View target, final float from, final float to) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(target, "rotation", from, to);
        animator.setDuration(300);
        animator.setInterpolator(Utils.createInterpolator(Utils.LINEAR_INTERPOLATOR));
        return animator;
    }

    public String formatDay(DateTime dateTime) {
        DateTimeFormatter fmt = DateTimeFormat.forPattern("E");
        String day = fmt.withLocale(Locale.ENGLISH).print(dateTime);
        return day;
    }

    public String formatDate(DateTime dateTime) {
        DateTimeFormatter fmtMonth = DateTimeFormat.forPattern("MMM");
        DateTimeFormatter fmtDay = DateTimeFormat.forPattern("d");
        String date = fmtMonth.withLocale(Locale.ENGLISH).print(dateTime) + " " + fmtDay.withLocale(Locale.ENGLISH).print(dateTime);
        return date;
    }

    public String formatTime(DateTime dateTime) {
        DateTimeFormatter fmtHour = DateTimeFormat.forPattern("h:mm");
        DateTimeFormatter fmtHalf = DateTimeFormat.forPattern("a");
        String hour = fmtHour.withLocale(Locale.ENGLISH).print(dateTime) + " " + fmtHalf.withLocale(Locale.ENGLISH).print(dateTime);
        return hour;
    }

}
