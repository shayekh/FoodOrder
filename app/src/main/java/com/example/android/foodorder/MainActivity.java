package com.example.android.foodorder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView login,homepage,order,payment,menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=(TextView)findViewById(R.id.login);
        homepage=(TextView)findViewById(R.id.homepage);
        order=(TextView)findViewById(R.id.order);
        payment=(TextView)findViewById(R.id.payment);
        menu=(TextView)findViewById(R.id.menu) ;


       login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent intent = new Intent(MainActivity.this, LoginActivity.class);

               // Start the new activity
               startActivity(intent);

           }
       });

        homepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Homepage.class);

                // Start the new activity
                startActivity(intent);

            }
        });

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Order.class);

                // Start the new activity
                startActivity(intent);

            }
        });

        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Payment.class);

                // Start the new activity
                startActivity(intent);

            }
        });


        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Menu.class);

                // Start the new activity
                startActivity(intent);

            }
        });






    }
}
