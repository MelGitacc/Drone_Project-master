package com.example.dronepet;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;



public class ControlActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        //calling the define buttons method
      //  defineButtons();

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null){

            ControlFragment controlFragment = new ControlFragment();
            fm.beginTransaction().add(R.id.fragment_container, controlFragment).commit();
        }



        FloatingActionButton followMe = (FloatingActionButton) findViewById(R.id.FloatingBttnFollowMe);
        followMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "follow me is selected", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(ControlActivity.this, FollowMeActivity.class);
                startActivity(intent);
            }
        });

        //this button will enable drone to land (this needs coding)
        FloatingActionButton takeOffLand = (FloatingActionButton) findViewById(R.id.FloatingBttnTakeOff);

        FloatingActionButton mic = (FloatingActionButton) findViewById(R.id.FloatingBttnMic);
        mic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Mic is selected", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(ControlActivity.this, VoiceCommandActivity.class);
                startActivity(intent);
            }
        });
    }
    //defining buttons
  /*  private void defineButtons() {
        findViewById(R.id.forwardBttn).setOnClickListener(buttonOnClickListener);
    }
    //handling multiple buttons using onClick
    private View.OnClickListener buttonOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()){


                case R.id.forwardBttn:
                    Toast.makeText(getApplicationContext(), "forward is selected", Toast.LENGTH_LONG).show();
                    break;
                case R.id.backwardsBttn:
                    Toast.makeText(getApplicationContext(), "backward is selected", Toast.LENGTH_LONG).show();

                    break;
                case R.id.rotateLeftBttn:
                    Toast.makeText(getApplicationContext(), "rotate left is selected", Toast.LENGTH_LONG).show();
                    break;
                case R.id.RotateRightBttn:
                    Toast.makeText(getApplicationContext(), "rotate right is selected", Toast.LENGTH_LONG).show();
                    break;
                case R.id.upBttn:
                    Toast.makeText(getApplicationContext(), "up is selected", Toast.LENGTH_LONG).show();

                    break;
                case R.id.downBttn:
                    Toast.makeText(getApplicationContext(), "down is selected", Toast.LENGTH_LONG).show();

                    break;
                case R.id.leftBttn:
                    Toast.makeText(getApplicationContext(), "left is selected", Toast.LENGTH_LONG).show();

                    break;
                case R.id.rightBttn:
                    Toast.makeText(getApplicationContext(), "right is selected", Toast.LENGTH_LONG).show();

                    break;
            }
        }
    };*/
}
