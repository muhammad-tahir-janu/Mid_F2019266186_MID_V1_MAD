package com.mad.v1.mid_f2019266186;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AddItemAdapter extends RecyclerView.Adapter<AddItemAdapter.ViewHolder> {

    public interface ItemClicked{
        public void OnClickedItem(int x);
    }
    public  ItemClicked myActivity;

    ArrayList<Model_Item> itemList;
    public AddItemAdapter(Context context, ArrayList<Model_Item> model_items){
        itemList = model_items;
        myActivity = (ItemClicked) context;

    }

   public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvItem;
        ImageView ivCancel;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvItem = itemView.findViewById(R.id.tvItem_Add);
            ivCancel = itemView.findViewById(R.id.ivCancel_Item);
            ivCancel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                     myActivity.OnClickedItem(itemList.indexOf((Model_Item)itemView.getTag()));
                }
            });
        }

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.add_item_view,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       holder.tvItem.setText(itemList.get(position).getItems());
       holder.itemView.setTag(itemList.get(position));
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
