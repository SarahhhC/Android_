package com.project.sarahhh.datepaln;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;
import android.content.*;

public class MainActivity extends AppCompatActivity {

      @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            ImageButton im = (ImageButton)findViewById(R.id.main);
            ImageButton im2 = (ImageButton)findViewById(R.id.main2);
            ImageButton im3 = (ImageButton)findViewById(R.id.main3);
            ImageButton im4 = (ImageButton)findViewById(R.id.main4);

            im.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, Location.class);
                    startActivity(intent);
                }});

            im2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, Location_t.class);
                    startActivity(intent);
                }});
            im3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, AllMap.class);
                    startActivity(intent);
                }});
            im4.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, Info.class);
                    startActivity(intent);
                }});

        }
    }

