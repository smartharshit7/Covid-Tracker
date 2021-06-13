package com.example.coronatracker;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

import java.util.List;
public class ListViewAdapter extends ArrayAdapter<covid> {

    private List<covid> covidList;

    //the context object
    private Context mCtx;

    //here we are getting the herolist and context
    //so while creating the object of this adapter class we need to give herolist and context
    public ListViewAdapter(List<covid> covidList, Context mCtx) {
        super(mCtx, R.layout.list_item, covidList);
        this.covidList = covidList;
        this.mCtx = mCtx;
}
    @Override
    public View getView(int position, View convertView,ViewGroup parent) {
        //getting the layoutinflater
        LayoutInflater inflater;
        inflater = LayoutInflater.from(mCtx);

        //creating a view with our xml layout
        View listViewItem = inflater.inflate(R.layout.list_item, null, true);

        //getting text views
        TextView tvState = (TextView)listViewItem.findViewById(R.id.tvState);
        TextView tvConfirmed = (TextView)listViewItem.findViewById(R.id.tvConfirmed);
        TextView tvActive = (TextView)listViewItem.findViewById(R.id.tvActive);
        TextView tvRecovered = (TextView)listViewItem.findViewById(R.id.tvRecovered);
        TextView tvDeaths = (TextView)listViewItem.findViewById(R.id.tvDeaths);


        //Getting the hero for the specified position
        covid covid = covidList.get(position);

        //setting hero values to textviews
        tvState.setText(covid.getState());
        tvConfirmed.setText(covid.getConfirmed());
        tvActive.setText(covid.getActive());
        tvRecovered.setText(covid.getRecovered());
        tvDeaths.setText(covid.getDeaths());


        //returning the listitem
        return listViewItem;
    }
}
