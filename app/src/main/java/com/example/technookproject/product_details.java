package com.example.technookproject;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class product_details extends AppCompatActivity {

    Button btn;
    TextView tv1;
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        tv1=findViewById(R.id.pr_name);
        image=findViewById(R.id.productimage);
        Intent intent = getIntent();
        String name = intent.getStringExtra("About:");
        tv1.setText(name);
        Bundle bundle=getIntent().getExtras();
        if(bundle != null)
        {
            int resId= bundle.getInt("resId");
            image.setImageResource(resId);
        }
        btn = findViewById(R.id.btn_back);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(product_details.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}