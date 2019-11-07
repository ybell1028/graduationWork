package org.techtown.layoutproto;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link shoppingFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link shoppingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class shoppingFragment extends Fragment {

    public shoppingFragment() {
        // Required empty public constructor
    }


    public static shoppingFragment newInstance() {
        shoppingFragment fragment = new shoppingFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_shopping, container, false);
        return view;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
