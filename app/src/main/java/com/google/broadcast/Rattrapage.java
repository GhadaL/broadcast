package com.google.broadcast;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Rattrapage extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    ArrayList<HashMap<String,String>> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rattrapage);
        //ActionBar bar = getActionBar();
      //  bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#80cbc4")));
        Intent intent=getIntent();
        String message=intent.getExtras().getString("message");
        recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerAdapter=new RecyclerAdapter(list);
        recyclerView.setAdapter(recyclerAdapter);
        for(int i=0;i<5;i++){
            HashMap<String,String> map=new HashMap<>();
            map.put("prof","Rattrapage :");
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm");

            map.put("date",String.valueOf(dateFormat.format(new Date())));
            map.put("cont",message);
            list.add(map);
        }
        recyclerAdapter.notifyDataSetChanged();



    }
}
