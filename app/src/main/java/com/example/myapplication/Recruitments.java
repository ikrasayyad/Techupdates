package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Recruitments extends AppCompatActivity {

    ImageView imageView_to_Updates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imageView_to_Updates=findViewById(R.id.navigate);
        imageView_to_Updates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Recruitments.this,Updates.class);
                view.getContext().startActivity(intent);
            }
        });
    }
}