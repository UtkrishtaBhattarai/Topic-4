package com.example.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static String countries[]={"Nepal","India","China","UK","US","Canada"};
    ListView lvcountry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvcountry=findViewById(R.id.lvcountry);

        ArrayAdapter arrayAdapter=new ArrayAdapter<>(
                this,android.R.layout.simple_list_item_1,countries
        );
        lvcountry.setAdapter(arrayAdapter);
    }
}
