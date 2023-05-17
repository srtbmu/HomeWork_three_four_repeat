package com.example.testproject_three_three.adapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.testproject_three_three.R;

public class ContactViewHolder extends RecyclerView.ViewHolder {

    TextView TextViewName;
    ImageView IconView;
    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void onBind(String name){
    findView();
        TextViewName.setText(name);
    }

    private void findView(){
        TextViewName = itemView.findViewById(R.id.textViewNames);
        IconView = itemView.findViewById(R.id.imegViewICon);
    }
}
