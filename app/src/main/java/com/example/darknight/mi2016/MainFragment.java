package com.example.darknight.mi2016;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainFragment extends Fragment {


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getActivity().setTitle("HOME");
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        GridView gridview = (GridView) view.findViewById(R.id.main_menu);
        gridview.setAdapter(new GridAdapter(getContext()));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                switch (position){
//                    case 0:
//                        openEvents();
//                        break;
//                    case 1:
//                        openHospitality();
//                        break;
//                    case 2:
//                        openMap();
//                        break;
//                    case 3:
//                        openGoing();
//                        break;
//                    case 4:
//                        openSchedule();
//                        break;
//                    case 5:
//                        openFaq();
//                        break;
//                    case 6:
//                        openContactUs();
//                        break;

                }
            }
        });
    }

}
