package com.example.dronepet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Haleema on 26/02/2018.
 */

public class VoiceCommandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_fragment);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null){

            VoiceCommandFragment voiceCommandFragment = new VoiceCommandFragment();
            fm.beginTransaction().add(R.id.fragment_container, voiceCommandFragment).commit();
        }
    }
}
