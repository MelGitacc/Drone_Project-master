package com.example.dronepet;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null){

            MainFragment mainFragment = new MainFragment();
            fm.beginTransaction().add(R.id.fragment_container, mainFragment).commit();
        }

        FloatingActionButton followMe = (FloatingActionButton) findViewById(R.id.FloatingBttnFollowMe);
        followMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "follow me is selected", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, FollowMeActivity.class);
                startActivity(intent);
            }
        });

        FloatingActionButton takeOffLand = (FloatingActionButton) findViewById(R.id.FloatingBttnTakeOff);
        takeOffLand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "take off is selected", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, ControlActivity.class);
                startActivity(intent);
            }
        });

        FloatingActionButton mic = (FloatingActionButton) findViewById(R.id.FloatingBttnMic);
        mic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Mic is selected", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, VoiceCommandActivity.class);
                startActivity(intent);
            }
        });
    }
}
