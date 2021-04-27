package com.example.guesthouse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class learnmore extends AppCompatActivity implements View.OnClickListener {

    Button btHome, btRoom, btNearme;

    home fHome;
    room fRoom;
    nearme fNearme;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learnmore);

        btHome = findViewById(R.id.btn_home);
        btRoom = findViewById(R.id.btn_room);
        btNearme = findViewById(R.id.btn_nearme);
        btHome.setOnClickListener(this);
        btRoom.setOnClickListener(this);
        btNearme.setOnClickListener(this);
    }

    void fragmentHome(){
        fHome = new home();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fHome);
        ft.commit();
    }

    void fragmentRoom(){
        fRoom = new room();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fRoom);
        ft.commit();
    }

    void fragmentNearme(){
        fNearme = new nearme();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fNearme);
        ft.commit();
    }

    @Override
    public void onClick(View v) {

        if (v == btHome) {
            fragmentHome();
        }
        if (v == btRoom) {
            fragmentRoom();
        }
        if (v == btNearme) {
            fragmentNearme();
        }

    }


}