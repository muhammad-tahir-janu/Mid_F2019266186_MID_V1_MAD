package com.mad.v1.mid_f2019266186;

import java.util.ArrayList;

public class Model_Item {
    String items;

    public Model_Item() {
    }

    public Model_Item(String items) {
        this.items = items;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Model_Item{" +
                "items='" + items + '\'' +
                '}';
    }
}
