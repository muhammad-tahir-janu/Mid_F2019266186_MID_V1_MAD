package com.mad.v1.mid_f2019266186;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.format.Time;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Date;

public class Add_Item_Detail extends AppCompatActivity implements AddItemAdapter.ItemClicked {
    Button btnAdd,btnCancel,btnSave;
    EditText et_Add_item_From_Dialog,etName;
    EditText timePicker,datePicker;
    ImageView ivCancel,ivAddItem,ivRepeat;
    View mView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__item__detail);
        init();
       ivAddItem.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               final AlertDialog.Builder alert =  new AlertDialog.Builder(Add_Item_Detail.this);
               mView = getLayoutInflater().inflate(R.layout.add_item_dialog_box,null);
               btnAdd = mView.findViewById(R.id.btnAdd);
               btnCancel = mView.findViewById(R.id.btnCancel);
               et_Add_item_From_Dialog = mView.findViewById(R.id.etAdd_Item_into_Dialog);
               alert.setView(mView);

                final AlertDialog alertDialog = alert.create();
                alertDialog.setCanceledOnTouchOutside(false);
                btnAdd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String name = et_Add_item_From_Dialog.getText().toString().trim();
                        if(name.isEmpty()){
                            et_Add_item_From_Dialog.setError("Please Enter Item Name");
                        }else{
                            Toast.makeText(Add_Item_Detail.this, "Item Added", Toast.LENGTH_SHORT).show();
                        }

                    }
                });

                btnCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        alertDialog.dismiss();
                    }
                });
                alertDialog.show();
           }
       });

       btnSave.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
            String name =etName.getText().toString().trim();
            if(name.isEmpty()){
                etName.setError("Please Enter Name");
            }
           }
       });


       ivCancel.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent();
                setResult(RESULT_CANCELED);
                finish();
           }
       });


    }

    private void init() {

        btnSave = findViewById(R.id.btnSave);
        etName = findViewById(R.id.etName);
        timePicker = findViewById(R.id.et_TimePicker);
        datePicker = findViewById(R.id.etDatePicker);
        ivCancel = findViewById(R.id.ivCancel);
        ivAddItem = findViewById(R.id.ivAdd_Item);
        ivRepeat = findViewById(R.id.ivRepeat);
    }
    @Override
    public void OnClickedItem(int x) {

    }
}