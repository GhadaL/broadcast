package com.google.broadcast;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Declaration extends AppCompatActivity implements View.OnClickListener {
Button broadcastbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_declaration);
     //   broadcastbtn=(Button)findViewById(R.id.);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
  //      ActionBar bar = getActionBar();
//        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#64b5f6")));
        String title = getIntent().getStringExtra("title");

        String message = getIntent().getStringExtra("message");

        if (title != null) {
            if (title.equals("Ratrapage")) {
                Intent intent = new Intent(this, Rattrapage.class);
                intent.putExtra("message", message);
                startActivity(intent);
            }
            else if(title.equals("Event")){
                Intent intent = new Intent(this, Event.class);
                intent.putExtra("message", message);
                startActivity(intent);

            }
        }
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.declaration).setVisibility(View.VISIBLE);
            }
        });
    }

    @Override
    public void onClick(View v) {


    }
}
