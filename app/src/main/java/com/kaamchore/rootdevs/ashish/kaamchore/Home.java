package com.kaamchore.rootdevs.ashish.kaamchore;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.app.FragmentManager;

public class Home extends AppCompatActivity {


    Fragment fr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getSupportFragmentManager()
                .beginTransaction().add(R.id.fragment_place,new Itemadder(),"some tag1").commit();



    }

    public void additem(View view){

        getSupportFragmentManager()
                .beginTransaction().add(R.id.fragment_place,new Itemadder(),"some tag1").commit();



    }


}
