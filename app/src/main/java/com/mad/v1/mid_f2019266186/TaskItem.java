package com.mad.v1.mid_f2019266186;

import java.util.ArrayList;

public class TaskItem {
    String itemName;
    String items;
    String priority;

    public TaskItem() {
    }

    public TaskItem(String itemName, String items, String priority) {
        this.itemName = itemName;
        this.items = items;
        this.priority = priority;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "TaskItem{" +
                "itemName='" + itemName + '\'' +
                ", items=" + items +
                ", priority='" + priority + '\'' +
                '}';
    }
}
