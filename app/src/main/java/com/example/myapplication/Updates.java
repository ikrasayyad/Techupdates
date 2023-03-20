package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Updates extends AppCompatActivity {

    ImageView imageView_to_Jobs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updates);

        imageView_to_Jobs=findViewById(R.id.navigate);
        imageView_to_Jobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Updates.this, Jobs.class);
                view.getContext().startActivity(intent);
            }
        });
    }
}