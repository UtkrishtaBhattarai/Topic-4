package com.example.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView tvcapital;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvcapital=findViewById(R.id.tvcapital);

        Bundle bundle=getIntent().getExtras();
        if (bundle!=null)
        {
            String result=bundle.getString("Capital");
            tvcapital.setText(result);
        }
    }
}
