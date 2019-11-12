package org.techtown.layoutproto;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Menu1Fragment extends Fragment {

    Button shoppingButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //oncreate는 생명주기

        View view =  inflater.inflate(R.layout.fragment_menu1, container, false);
        //해당 클래스에 들어오면 보여줄 xml을 지정(R.layout.fragment_menu1)

        shoppingButton = (Button)view.findViewById(R.id.shoppingButton);

        shoppingButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame_layout, ShoppingFragment.newInstance()).commitAllowingStateLoss();
            }
        });

        return view;
    }
}
