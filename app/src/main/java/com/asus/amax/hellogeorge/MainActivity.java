package com.asus.amax.hellogeorge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button main_btn_relative = (Button) findViewById(R.id.relative_btn);
        main_btn_relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent goOtherActivity = new Intent(v.getContext(), RelativeActivity.class);
//                startActivity(goOtherActivity);
                main_btn_relative.setText("George");
                main_btn_relative.setEnabled(false);
            }
        });

        Button main_btn_frame = (Button) findViewById(R.id.frame_btn);
        main_btn_frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goOtherActivity = new Intent(v.getContext(), FrameActivity.class);
                startActivity(goOtherActivity);
            }
        });
    }
    public void sendMessage(View view) {
        String str = "george";
        //Toast.LENGTH_LONG表示顯示時間較長，Toast.LENGTH_SHORT則表示顯示時間較短
        Toast.makeText(view.getContext(), "這是一個Toast......", Toast.LENGTH_LONG).show();
        Log.d("George", "sendMessage() returned: " + "This is " + str + " log");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, "One");
        menu.add(0, 1, 2, "Two");
        menu.add(0, 2, 1, "Three");
        return super.onCreateOptionsMenu(menu);
    }
}
