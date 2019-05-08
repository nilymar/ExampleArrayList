package com.example.android.examplearraylist;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.ArrayList;

public class NumbersAdapter extends ArrayAdapter<Number> {
    TextView numberName; // the textView where the name of the number will be places
    TextView numberCharacter; //the textView where the character of the number will be placed

    // this is the constructor for the NumbersAdapter object
    public NumbersAdapter(Activity context, ArrayList<Number> numbers) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter the adapter is not going to use this second argument,
        // so it can be any value. Here, we used 0.
        super(context, 0, numbers);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false); // uses the list_item.xml layout file
        }
        numberName = convertView.findViewById(R.id.number_name);
        numberCharacter = convertView.findViewById(R.id.number_character);
        // get the Number object in the current position in the array
        final Number currentNumber = getItem(position); //get the current item - i.e. the one in the index position
        // the name of the number is set in it's location in list_item layout, using the getter method for it
        numberName.setText(currentNumber.getsNumberName());
        // the character of the number is set in it's location in list_item layout, using the getter method for it
        numberCharacter.setText(currentNumber.getNumberCharacter());
        // to put the item in the list on screen
        return convertView;
    }
}
