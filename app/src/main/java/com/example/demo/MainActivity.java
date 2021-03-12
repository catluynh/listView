package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvShort;
    CustomShortAdapter adt;
    ArrayList<Short> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvShort=findViewById(R.id.lvShort);

        arrayList=new ArrayList<>();
        arrayList.add(new Short("Google", "80$",R.drawable.google));
        arrayList.add(new Short("Google", "80$",R.drawable.google));
        arrayList.add(new Short("Google", "80$",R.drawable.google));

        adt=new CustomShortAdapter(this, R.layout.item_listview, arrayList);
        lvShort.setAdapter(adt);
    }


}