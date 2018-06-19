package com.appmakings.james.jobrecord;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;
import org.w3c.dom.Text;

import java.util.ArrayList;




public class Adaptorcard extends RecyclerView.Adapter<Adaptorcard.MyViewHolder> {

    private ArrayList<dataset> dataSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder {


        TextView textViewName;
        TextView textViewDescription;


        public MyViewHolder(View itemView) {
            super(itemView);
            this.textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            this.textViewDescription = (TextView) itemView.findViewById(R.id.textViewDescription);
        }
    }

    public Adaptorcard(ArrayList<dataset> data) {
        this.dataSet = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card, parent, false);

        view.setOnClickListener(JobTrackingActivity.myOnClickListener);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {
        Intent aa = ((MainActivity) context).getIntent();
        String e = aa.getStringExtra("QUOTEDESCRIPTION");
        String a = aa.getStringExtra("NAME");


        TextView textViewName = holder.textViewName;
        TextView textViewDescription = holder.textViewDescription;



        textViewName.setText(dataSet.get(listPosition).getName());
        textViewDescription.setText(dataSet.get(listPosition).getDescription());

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}