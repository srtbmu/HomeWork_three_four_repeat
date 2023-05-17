package com.example.testproject_three_three.ContactAdapterAge;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testproject_three_three.R;

public class ContactViewHolderAge extends RecyclerView.ViewHolder {

    TextView TextViewAge;

    public ContactViewHolderAge(@NonNull View itemView) {
        super(itemView);
    }

    public void onBind(String age){
        findView();
        TextViewAge.setText(age);
    }

    private void findView(){
        TextViewAge = itemView.findViewById(R.id.textViewAge);
    }
}
