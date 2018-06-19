package com.appmakings.james.jobrecord;

import android.content.Intent;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;




public class JobTrackingActivity extends AppCompatActivity {

    private static RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView recyclerView;
    private static ArrayList<dataset> data;
    static View.OnClickListener myOnClickListener;
    private static ArrayList<Integer> removedItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_tracking);



        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        data = new ArrayList<dataset>();
        for (int i = 0; i < MyData.nameArray.length; i++) {
            data.add(new dataset(
                    MyData.nameArray[i],
                    MyData.descriptionArray[i],
                    MyData.id_[i]
            ));
        }

        removedItems = new ArrayList<Integer>();

        adapter = new Adaptorcard(data);
        recyclerView.setAdapter(adapter);
    }


        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            getMenuInflater().inflate(R.menu.create, menu);
            return true;

        }

        @Override
        public boolean onOptionsItemSelected (MenuItem action_settings){
            //handle presses on the action bar items
            switch (action_settings.getItemId()) {
                case R.id.action_newjob:
                    startActivity(new Intent(this, MainActivity.class));
                    return true;
            }
            return super.onOptionsItemSelected(action_settings);

        }


    }






