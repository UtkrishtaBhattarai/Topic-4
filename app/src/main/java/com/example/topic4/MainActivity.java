package com.example.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    public static final String countries[]=
                    {"Nepal","Kathmandu",
                    "India","New Delhi",
                    "China","Beijing",
                    "UK","London",
                    "US","Washington DC",
                    "Canada","Ottawa"};

    private Map<String,String> dictionary;
    ListView lvcountry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvcountry=findViewById(R.id.lvcountry);

        dictionary =new HashMap<>();
        for (int i=0;i<countries.length;i+=2)
        {
            dictionary.put(countries[i],countries[i+1]);
        }

        ArrayAdapter arrayAdapter=new ArrayAdapter<>(
                this,android.R.layout.simple_list_item_1,new ArrayList<String>(dictionary.keySet())
        );
        lvcountry.setAdapter(arrayAdapter);

        lvcountry.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String country=parent.getItemAtPosition(position).toString();
                String capital=dictionary.get(country);

                Intent intent=new Intent(MainActivity.this,ResultActivity.class);
                intent.putExtra("Capital",capital);
                startActivity(intent);
            }
        });


    }
}
