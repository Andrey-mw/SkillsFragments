package com.example.android.skillsfragments;

import android.app.Activity;
import android.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends Activity implements FragmentList.Communicator {

    private FragmentManager manager;
    private FragmentList fragmentList;
    private FragmentDescription fragmentDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getFragmentManager();

        fragmentList = (FragmentList) manager.findFragmentById(R.id.fragment);
        fragmentList.setCommunicator(this);

    }

    @Override
    public void respond(int index) {
        fragmentDescription = (FragmentDescription) manager.findFragmentById(R.id.fragment2);
        if (fragmentDescription != null && fragmentDescription.isVisible()) {
            fragmentDescription.changeText(index);
        } else {
            Intent intent = new Intent(this, AnotherActivity.class);
            intent.putExtra("index", index);
            startActivity(intent);

//            FragmentTransaction transaction = manager.beginTransaction();
//            fragmentDescription.changeText(index);
//            transaction.replace(R.id.container,fragmentDescription);
//            transaction.addToBackStack(null);
//            transaction.commit();
        }


    }
}