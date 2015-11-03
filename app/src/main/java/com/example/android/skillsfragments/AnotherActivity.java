package com.example.android.skillsfragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Android on 02.11.2015.
 */
public class AnotherActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.another_layout);

        TextView textView = (TextView) findViewById(R.id.txtDescription);
        Intent intent = getIntent();
        int data = intent.getIntExtra("index", 0);
        textView.setText(getResources().getStringArray(R.array.description)[data]);


//        Intent intent =  getIntent();
//        int index  = intent.getIntExtra("index", 0);
//        FragmentDescription description = (FragmentDescription) getFragmentManager().findFragmentById(R.id.fragment2);
//        description.changeText(index);
    }
}
