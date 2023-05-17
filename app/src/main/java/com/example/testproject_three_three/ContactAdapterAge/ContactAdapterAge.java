package com.example.testproject_three_three.ContactAdapterAge;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testproject_three_three.R;

import java.util.ArrayList;

public class ContactAdapterAge extends RecyclerView.Adapter<ContactViewHolderAge> {

    ArrayList<String> arrayListAge;

    public ContactAdapterAge(ArrayList<String> AgearrayList){
        arrayListAge = AgearrayList;
    }

    @NonNull
    @Override
    public ContactViewHolderAge onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactViewHolderAge(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact_age,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolderAge holder, int position) {
        holder.onBind(arrayListAge.get(position));
    }

    @Override
    public int getItemCount() {
     return arrayListAge.size();
    }
}
