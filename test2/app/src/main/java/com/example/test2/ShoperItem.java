package com.example.test2;

public class ShoperItem {
    String name;
    String situation;
    int resId;

    public ShoperItem(String name, String situation, int resId) {
        this.name = name;
        this.situation = situation;
        this.resId = resId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    @Override
    public String toString() {
        return "ShoperItem{" +
                "name='" + name + '\'' +
                ", situation='" + situation + '\'' +
                '}';
    }
}
