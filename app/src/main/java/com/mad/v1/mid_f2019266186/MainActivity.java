package com.mad.v1.mid_f2019266186;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.getbase.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements ListAdapter.OnItemClicked {

    FloatingActionButton fab;
    final  int ADD_ITEM=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab = findViewById(R.id.fap_AddTask);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Add_Item_Detail.class);
                startActivityForResult(intent,ADD_ITEM);
            }
        });

    }

    @Override
    public void clickedOnItem(int index) {

    }
}