package org.techtown.layoutproto;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ShopItemView extends LinearLayout {

    ImageView shopIcon;
    TextView shopName, shopId, shopSync;

    public ShopItemView(Context context) { //생성자 1
        super(context);

        init(context);
    }

    public ShopItemView(Context context, @Nullable AttributeSet attrs) { //생성자 2, 애트리뷰트세트 attr 추가
        super(context, attrs);
        init(context);
    }

    private void init(Context context){  // 만든 xml 레이아웃 파일(singer_item.xml)을 인플레이션해서 붙혀주는 역할
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // 단말이 시작됐을 때 단말에서 기본적으로 실행시켜 놓는 서비스 = 시스템 서비스

        inflater.inflate(R.layout.shop_item, this, true);

        shopIcon = (ImageView)findViewById(R.id.shopIcon);
        shopName = (TextView)findViewById(R.id.shopName);
        shopId = (TextView)findViewById(R.id.shopId);
        shopSync = (TextView)findViewById(R.id.shopSync);
    }

    public void setShopIcon(int resId) {
        shopIcon.setImageResource(resId);
    }

    public void setShopName(String name) {
       shopName.setText(name);
    }

    public void setShopId(String id) {
        shopId.setText(id);
    }

    public void setShopSync(boolean sync) {
        if(sync)
            shopSync.setText("사용");
        else
            shopSync.setText("미사용");
    }

}
