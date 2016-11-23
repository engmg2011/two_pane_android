package com.example.koki.twofragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailsFragment extends Fragment {
    TextView tvDetails;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i("MGENG","Details Fragment");
        View detailsFragment = inflater.inflate(R.layout.fragment_details , container,false);
        tvDetails = (TextView) detailsFragment.findViewById(R.id.tvDetails);
        Bundle sentBundle = getArguments();
        String name = sentBundle.getString("name");
        tvDetails.setText("Hi "+ name);
        return detailsFragment;
    }

}
