package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ShoperAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.gridView);
        adapter = new ShoperAdapter();
        adapter.additem(new ShoperItem("전체 현황", null, R.drawable.repeatball));
        adapter.additem(new ShoperItem("신규 주문", null, R.drawable.timerball));
        adapter.additem(new ShoperItem("문의", null, R.drawable.safariball));
        adapter.additem(new ShoperItem("취소", null, R.drawable.sportsball));
        adapter.additem(new ShoperItem("교환", null, R.drawable.superball));
        adapter.additem(new ShoperItem("반품", null, R.drawable.monsterball));
        adapter.additem(new ShoperItem("순위", null, R.drawable.premierball));

        gridView.setAdapter(adapter);

    }

    class ShoperAdapter extends BaseAdapter{

        ArrayList<ShoperItem> items = new ArrayList<ShoperItem>();

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        public void additem(ShoperItem item){
            items.add(item);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ShoperItemView view = null;
            if (convertView == null){
                view = new ShoperItemView(getApplicationContext());
            } else {
                view = (ShoperItemView) convertView;
            }

            ShoperItem item = items.get(position);
            view.setName(item.getName());
            view.setSituation_t(item.getSituation());
            view.setImage(item.getResId());


            return view;
        }
    }
}
