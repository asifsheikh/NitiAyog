package com.fantastic4.nitiaayog.nitiayog;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NGODetails extends AppCompatActivity {
    public static final String ARG_NGO_DETAILS = "NGO_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngodetails);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView name = (TextView) findViewById(R.id.NGO_name);
        TextView state = (TextView) findViewById(R.id.state_name);
        TextView sector = (TextView) findViewById(R.id.sector_name);
        TextView chief = (TextView) findViewById(R.id.chief_name);
        TextView contacy = (TextView) findViewById(R.id.contact);
        Button submit = (Button) findViewById(R.id.submit_feedback);


    }

}
