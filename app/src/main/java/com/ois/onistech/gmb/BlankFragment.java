package com.ois.onistech.gmb;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_blank, container, false);
       // String strtext = getArguments().getString("edttext");
        //Toast.makeText(getContext().getApplicationContext(), ""+strtext, Toast.LENGTH_SHORT).show();
        //  Toast.makeText(getContext().getApplicationContext(), ""+strtext, Toast.LENGTH_SHORT).show();
        return v;
    }

}