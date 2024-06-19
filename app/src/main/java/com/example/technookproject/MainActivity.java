package com.example.technookproject;;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;
    ImageView iv1;
    ImageView iv2;
    ImageView iv3;
    ImageView iv4;
    ImageView iv5;
    ImageView iv6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);
        tv5=findViewById(R.id.tv5);
        tv6=findViewById(R.id.tv6);
        iv1=findViewById(R.id.iv1);
        iv2=findViewById(R.id.iv2);
        iv3=findViewById(R.id.iv3);
        iv4=findViewById(R.id.iv4);
        iv5=findViewById(R.id.iv5);
        iv6=findViewById(R.id.iv6);
        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, product_details.class);
                intent.putExtra("resId",R.drawable.instagram);
                intent.putExtra("About:","\n - Photo-sharing social networking platform.\n" +
                        "   - Users can upload photos and videos, apply filters, and share them publicly or with followers.\n" +
                        "   - Features include Stories, direct messaging, and IGTV for longer videos");
                startActivity(intent);
            }
        });
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, product_details.class);
                intent.putExtra("resId",R.drawable.whatsapp);
                intent.putExtra("About:","\n- Instant messaging app for text, voice, and video communication.\n" +
                        "   - Supports individual and group chats, voice calls, and video calls.\n" +
                        "   - End-to-end encryption ensures privacy and security.\n");
                startActivity(intent);
            }
        });
        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, product_details.class);
                intent.putExtra("resId",R.drawable.youtube);
                intent.putExtra("About:","\n- Video-sharing platform for user-generated and professional content.\n" +
                        "   - Offers a wide range of videos including music, tutorials, vlogs, and more.\n" +
                        "   - Users can subscribe to channels, like, comment, and share videos.\n");
                startActivity(intent);
            }
        });
        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, product_details.class);
                intent.putExtra("resId",R.drawable.facebook);
                intent.putExtra("About:"," \n- Social networking platform connecting people worldwide.\n" +
                        "   - Users can create profiles, post updates, share photos and videos, and interact with friends.\n" +
                        "   - Features include groups, events, marketplace, and news feed.\n");
                startActivity(intent);
            }
        });
        iv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, product_details.class);
                intent.putExtra("resId",R.drawable.googlemaps);
                intent.putExtra("About:","\n- Mapping and navigation app providing directions, traffic updates, and location services.\n" +
                        "   - Offers satellite imagery, street view, and real-time location sharing.\n" +
                        "   - Features local business information, reviews, and ratings.\n");
                startActivity(intent);
            }
        });
        iv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, product_details.class);
                intent.putExtra("resId",R.drawable.netflix);
                intent.putExtra("About:","\n - Streaming service offering a wide variety of TV shows, movies, documentaries, and more.\n" +
                        "   - Users can watch content on-demand on multiple devices.\n" +
                        "   - Personalized recommendations based on viewing history and preferences.");
                startActivity(intent);
            }
        });

    }
}