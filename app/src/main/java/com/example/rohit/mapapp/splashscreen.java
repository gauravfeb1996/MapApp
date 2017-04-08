package com.example.rohit.mapapp;

import android.content.Intent;
import android.os.Handler;
import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        getSupportActionBar().hide();
      Thread thread=new Thread(){
       @Override
          public void run()
       {
           try {
               sleep(3000);
               Intent intent=new Intent(getApplicationContext(),MapsActivity.class);
               startActivity(intent);
               finish();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }

       }
      };
   thread.start();
    }
}
