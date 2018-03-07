package com.example.dronepet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class ControlFragment extends Fragment  implements View.OnClickListener {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_controls, container, false);

        view.findViewById(R.id.forwardBttn).setOnClickListener(this);
        view.findViewById(R.id.backwardsBttn).setOnClickListener(this);
        view.findViewById(R.id.rotateLeftBttn).setOnClickListener(this);
        view.findViewById(R.id.RotateRightBttn).setOnClickListener(this);
        view.findViewById(R.id.upBttn).setOnClickListener(this);
        view.findViewById(R.id.leftBttn).setOnClickListener(this);
        view.findViewById(R.id.rightBttn).setOnClickListener(this);
        view.findViewById(R.id.downBttn).setOnClickListener(this);


        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.main_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Handles menu item actions
        switch (item.getItemId()){

            case R.id.camera_icon:

                break;
        }
        return super.onOptionsItemSelected(item);
    }
    /*
      implements onClick listener for the control buttons
       */
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.forwardBttn:
                //write the code for the forward button
                Toast.makeText(getActivity(),"Forward button is clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.backwardsBttn:
                //write the code for the backward button
                Toast.makeText(getActivity(),"Backward button is clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.rotateLeftBttn:
                //write the code for the rotate left button
                Toast.makeText(getActivity(), "Left Right button is clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.RotateRightBttn:
                //write the code for the rotate left button
                Toast.makeText(getActivity(), "Rotate Right button is clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.upBttn:
                //write the code for the up button
                Toast.makeText(getActivity(), "Up button is clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.downBttn:
                //write the code for the down button
                Toast.makeText(getActivity(), "Down button is clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.leftBttn:
                //write the code for the left button
                Toast.makeText(getActivity(), "Left button is clicked", Toast.LENGTH_LONG).show();
                break;
            case R.id.rightBttn:
                //write the code for the right button
                Toast.makeText(getActivity(), "Right button is clicked", Toast.LENGTH_LONG).show();
                break;

        }
    }
}
