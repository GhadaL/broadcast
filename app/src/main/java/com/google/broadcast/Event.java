
package com.google.broadcast;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Event extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
       // ActionBar bar = getActionBar();
        //bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#80cbc4")));
        Intent intent=getIntent();
        String message=intent.getExtras().getString("message");
        TextView titleText=(TextView)findViewById(R.id.textView);
        TextView text=(TextView)findViewById(R.id.textView2);
        titleText.setText("Events");
        text.setText(message);

    }
}
