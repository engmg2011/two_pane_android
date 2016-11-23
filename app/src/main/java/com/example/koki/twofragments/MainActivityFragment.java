package com.example.koki.twofragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    ListView lvNames ;
    ArrayList<String> mNamesList ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View myFragment = inflater.inflate(R.layout.fragment_main, container, false);
        mNamesList = new ArrayList<String>();
        lvNames = (ListView) myFragment.findViewById(R.id.lvNames);
        fillNamesList();
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,mNamesList);

        lvNames.setAdapter(myAdapter);

        lvNames.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String name = mNamesList.get(position);
                Log.i("MGENG"," position = "+position+" name ="+name);
                Intent i = new Intent(getActivity(),DetailsActivity.class);
                i.putExtra("name",name);
                Log.i("MGENG","intent loaded " );
                startActivity(i);
                Log.i("MGENG"," Activity Started" );
            }
        });

        return myFragment;
    }

    private void fillNamesList(){
        mNamesList.add("Mohamed");
        mNamesList.add("Ahmed");
        mNamesList.add("Ali");
        mNamesList.add("Ebrahim");
        mNamesList.add("Wa2el");
        mNamesList.add("Nody");
    }
}
