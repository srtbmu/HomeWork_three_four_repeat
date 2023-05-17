package com.example.testproject_three_three;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.testproject_three_three.ContactAdapterAge.ContactAdapterAge;
import com.example.testproject_three_three.adapter.ContactAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> arrayListNames = new ArrayList<>();
    ArrayList<String> arrayListAge = new ArrayList<>();
    ContactAdapter adapter;
    ContactAdapterAge adapterAge;
    RecyclerView recyclerView,recyclerViewAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NamesArrayList();
        AgeArrayList();
    }

    private void NamesArrayList() {
        arrayListNames.add("Bekaka, Bekzadovva, 01");
        arrayListNames.add("Katyak, Qestyanova, 99");
        arrayListNames.add("Uuzune, UzUuzunvih, 33");
        arrayListNames.add("Bembbe, Beeeemavih, 08");
        arrayListNames.add("KtoTot, Ktotovihra, 02");
        arrayListNames.add("Myrzab, Katyanovih, 99");
        arrayListNames.add("Umurza, Bekzatosmo, 11");
        arrayListNames.add("Lalala, lalalalala, 20");
        arrayListNames.add("ralatr, ltlalaltra, 22");
        arrayListNames.add("hahaha, hahahahaha, 10");
        setAdapter();
    }

    private void AgeArrayList(){
        arrayListAge.add("Bekaka, Bekzadovva, 01");
        arrayListAge.add("Bekaka, Bekzadovva, 01");
        arrayListAge.add("Bekaka, Bekzadovva, 01");
        arrayListAge.add("Bekaka, Bekzadovva, 01");
        arrayListAge.add("Bekaka, Bekzadovva, 01");
        arrayListAge.add("Bekaka, Bekzadovva, 01");
        arrayListAge.add("Bekaka, Bekzadovva, 01");
        arrayListAge.add("Bekaka, Bekzadovva, 01");
        arrayListAge.add("Bekaka, Bekzadovva, 01");
        arrayListAge.add("Bekaka, Bekzadovva, 01");
        setAdapterAge();
    }

    private void setAdapter() {
        adapter = new ContactAdapter(arrayListNames);
        findView();
        recyclerView.setAdapter(adapter);
    }

    private void setAdapterAge(){
        adapterAge = new ContactAdapterAge(arrayListAge);
        findView();
        recyclerViewAge.setAdapter(adapterAge);
    }

    private void findView() {
        recyclerView = findViewById(R.id.RecyclerViewNames);
        recyclerViewAge = findViewById(R.id.RecyclerViewAge);
    }
}