package org.techtown.layoutproto;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.ArrayList;

public class AddshopDialogFragment extends DialogFragment implements View.OnClickListener {

    ShoppingFragment shoppingFragment;
    ArrayAdapter<String> adapter1, adapter2;
    Spinner mallSpinner, syncSpinner;
    Button cancleButton, confirmButton;
    public AddshopDialogFragment() {

    }
    public static AddshopDialogFragment getInstance(){
        AddshopDialogFragment fragment = new AddshopDialogFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.shop_add_dialog, container);

        mallSpinner = (Spinner)view.findViewById(R.id.mallSpinner);
        //spinner item 가져오기
        String[] str1 = getResources().getStringArray(R.array.mallList);
        //malllist.xml(item)과 str을 인자로 어댑터 생성
        adapter1 = new ArrayAdapter<String>(getContext(), R.layout.spinner_item, str1);

        adapter1.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        mallSpinner.setAdapter(adapter1);

        mallSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(mallSpinner.getSelectedItemPosition() > 0){
                    Log.v("알림",mallSpinner.getSelectedItem().toString()+ "is selected");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        syncSpinner = (Spinner)view.findViewById(R.id.syncSpinner);
        //spinner item 가져오기
        ArrayList str2 = new ArrayList<String>();
        str2.add("사용");
        str2.add("미사용");
        adapter2 = new ArrayAdapter<String>(getContext(), R.layout.spinner_item, str2);

        adapter2.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        syncSpinner.setAdapter(adapter2);

        syncSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(syncSpinner.getSelectedItemPosition() > 0){
                    Log.v("알림",syncSpinner.getSelectedItem().toString()+ "is selected");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        return view;
    }

    @Override
    public void onClick(View view) {
        dismiss();
    }

    @Override
    public void onResume() {
        int width = getResources().getDimensionPixelSize(R.dimen.shop_dialog_width); // res/value/dimens.xml에 해당값 존재
        int height = getResources().getDimensionPixelSize(R.dimen.shop_dialog_height);
        getDialog().getWindow().setLayout(width, height);
        getDialog().getWindow().setGravity(Gravity.TOP);
        super.onResume();
    }
}
