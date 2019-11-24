package org.techtown.layoutproto;

public class ShopItem{

    int resId;
    String shopName;
    String shopId;
    Boolean shopSync;

    public ShopItem(int resId, String shopName, String shopId, Boolean shopSync) {
        this.resId = resId;
        this.shopName = shopName;
        this.shopId = shopId;
        this.shopSync = shopSync;
    }

    public int getResId() {
        return resId;
    }

    public String getShopName() {
        return shopName;
    }

    public String getShopId() {
        return shopId;
    }

    public Boolean getShopSync() {
        return shopSync;
    }

    @Override
    public String toString() {
        return "ShopItem{" +
                "resId=" + resId +
                ", shopName='" + shopName + '\'' +
                ", shopId='" + shopId + '\'' +
                ", shopSync=" + shopSync +
                '}';
    }
}
