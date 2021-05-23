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

public class ListAdapter  extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    public interface OnItemClicked{
        public void clickedOnItem(int index);
    }
    OnItemClicked myActivity;

    public ArrayList<TaskItem> items;
   public ListAdapter(Context context, ArrayList<TaskItem> list){
       items= list;
       myActivity = (OnItemClicked) context;
   }

   public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvItemName,tvItems;
       ImageView ivPriority;
       public ViewHolder(@NonNull View itemView) {
           super(itemView);
           tvItemName = itemView.findViewById(R.id.tvTitleItem);
           tvItems= itemView.findViewById(R.id.tvItems);
           ivPriority = itemView.findViewById(R.id.ivPriority);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

       }
   }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item,parent,false);

       return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvItemName.setText(items.get(position).itemName);
        holder.tvItems.setText(items.get(position).items);
        if(items.get(position).priority.equals("high")){
            holder.ivPriority.setImageResource(R.drawable.red);
        }

        if(items.get(position).priority.equals("medium")){
            holder.ivPriority.setImageResource(R.drawable.green);
        }

        if(items.get(position).priority.equals("low")){
            holder.ivPriority.setImageResource(R.drawable.yellow);
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
