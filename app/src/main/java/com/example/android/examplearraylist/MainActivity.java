package com.example.android.examplearraylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<Number> numbersArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numbersArrayList = new ArrayList<Number>();
        // fetching the lists of names and characters for numbers from the array.xml resource
        List<String> names = Arrays.asList(getResources().getStringArray(R.array.numbers_names));
        List<String> characters = Arrays.asList(getResources().getStringArray(R.array.numbers_characters));
        //creating an arrayList from the two lists fetched, using a for loop that runs on the names list
        for(int i=0; i<names.size(); i++ ){
            numbersArrayList.add(new Number(names.get(i),characters.get(i)));
        }
        // set a new adapter for the list, using the numberAdapter class created
        NumbersAdapter numbersAdapter = new NumbersAdapter(this, numbersArrayList);
        // Find the ListView object in the layout
        ListView numbersListView = findViewById(R.id.list);
        // set the adapter on the listView
        numbersListView.setAdapter(numbersAdapter);
    }
}
