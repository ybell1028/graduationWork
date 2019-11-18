package org.techtown.layoutproto;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link item_status.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link item_status#newInstance} factory method to
 * create an instance of this fragment.
 */
public class item_status extends Fragment {
    Button button_n;

    public item_status() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static item_status newInstance() {
        item_status fragment = new item_status();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_item_status, container, false);

        button_n = (Button)view.findViewById(R.id.naver_b);

        button_n.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout, market_item.newInstance()).commitAllowingStateLoss();
            }
        });

        return view;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
