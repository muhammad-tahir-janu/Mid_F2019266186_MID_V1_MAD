package com.mad.v1.mid_f2019266186;

import android.app.Application;

import java.util.ArrayList;

public class ItemInformation extends Application {
    public static ArrayList<TaskItem> itemArrayList;
    public static ArrayList<Model_Item> model_items;

    @Override
    public void onCreate() {
        super.onCreate();
        itemArrayList = new ArrayList<>();
        model_items = new ArrayList<>();
        model_items.add(new Model_Item("Laptop"));
        itemArrayList.add(new TaskItem("Shopping","Laptop","high"));
        itemArrayList.add(new TaskItem("Shopping","Laptop","low"));
        itemArrayList.add(new TaskItem("Shopping","Laptop","medium"));
    }
}
