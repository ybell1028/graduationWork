package org.techtown.layoutproto;

import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class ShoppingFragment extends Fragment implements View.OnClickListener{

    Button addButton;

    public ShoppingFragment() {
        // Required empty public constructor
    }


    public static ShoppingFragment newInstance() {
        ShoppingFragment fragment = new ShoppingFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_shopping, container, false);

        addButton = view.findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddshopDialogFragment dialog = new AddshopDialogFragment();
                dialog.show(getActivity().getSupportFragmentManager(), "tag");
            }
        });

        return view;
    }

    @Override
    public void onClick(View view) {

    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    public class ShopAdapter extends BaseAdapter{

        ArrayList<ShopItem> items = new ArrayList<ShopItem>();

        public void addItem(ShopItem item){
            items.add(item);
        }

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ShopItemView siv = null;
            if(convertView == null){
                siv = new ShopItemView(getContext());
            }
            else{
                siv = (ShopItemView)convertView;
            }
            ShopItem item = items.get(position);
            siv.setShopIcon(item.getResId());
            siv.setShopName(item.getShopName());
            siv.setShopId(item.getShopId());
            siv.setShopSync(item.getShopSync());

            return siv;
        }
    }
}
