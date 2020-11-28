package com.example.hcet_attendance;

import android.content.Intent;
import android.os.AsyncTask;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
       new MyThread().start();
    }
    public class MyThread extends Thread{
        public void run(){
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                Toast.makeText(SplashActivity.this, e.toString(), Toast.LENGTH_SHORT).show();
            }
            finally {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }
    }
}
