package com.appmakings.james.jobrecord;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.app.Application;

import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText NAME = (EditText) findViewById(R.id.editText);
        final EditText ADDRESS = (EditText) findViewById(R.id.editText6);
        final EditText EMAIL = (EditText) findViewById(R.id.editText2);
        final EditText PHONE = (EditText) findViewById(R.id.editText4);
        final EditText MOBILE = (EditText) findViewById(R.id.editText5);
        final EditText QDESCRIPTION = (EditText) findViewById(R.id.editText3);
        final EditText JDESCRIPTION = (EditText) findViewById(R.id.editText7);
        final Button Donebutton = (Button) findViewById(R.id.button2);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        Font application = (Font) getApplication();
        application.setTypeface(NAME);
        application.setTypeface(ADDRESS);
        application.setTypeface(EMAIL);
        application.setTypeface(PHONE);
        application.setTypeface(MOBILE);
        application.setTypeface(QDESCRIPTION);
        application.setTypeface(JDESCRIPTION);




        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.type_arrays, android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);



        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this, R.array.Itemsarray, android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(this);


        final Context context = getApplicationContext();


        Donebutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                Intent aa = new Intent(view.getContext(),  Adaptorcard.class, context);
                aa.putExtra("NAME", NAME.getText().toString());
                aa.putExtra("ADDRESS", ADDRESS.getText().toString());
                aa.putExtra("EMAIL", EMAIL.getText().toString());
                aa.putExtra("PHONE", PHONE.getText().toString());
                aa.putExtra("MOBILE", MOBILE.getText().toString());
                aa.putExtra("QUOTEDESCRIPTION", QDESCRIPTION.getText().toString());
                aa.putExtra("JOBDESCRIPTION", JDESCRIPTION.getText().toString());
                startActivity(aa);

                //save the file here insted of this
            }
        });
    }

        @Override
        public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        if (position == 0) {
            EditText editText3 = (EditText) findViewById(R.id.editText3);
            editText3.setVisibility(View.GONE);
            EditText editText7 = (EditText) findViewById(R.id.editText7);
            editText7.setVisibility(View.VISIBLE);
        }

        if (position == 1) {
            EditText editText3 = (EditText) findViewById(R.id.editText3);
            editText3.setVisibility(View.VISIBLE);
            EditText editText7 = (EditText) findViewById(R.id.editText7);
            editText7.setVisibility(View.GONE);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }



}








