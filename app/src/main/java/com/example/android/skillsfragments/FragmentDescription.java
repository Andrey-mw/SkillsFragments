package com.example.android.skillsfragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Android on 02.11.2015.
 */
public class FragmentDescription extends Fragment {

    TextView textDescription;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_description, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textDescription = (TextView) getActivity().findViewById(R.id.txtDescription);

    }

    public void changeText(int index) {
        String[] description = getResources().getStringArray(R.array.description);
        textDescription.setText(description[index]);

    }
}
