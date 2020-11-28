package com.example.hcet_attendance;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TeacherLogin extends AppCompatActivity {
    EditText userId,password;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_login);
        userId=findViewById(R.id.editText);
        password=findViewById(R.id.editText2);
        button=findViewById(R.id.button3);
    }
    public void doOnClick(View view){
        String user=userId.getText().toString().trim();
        String pass=password.getText().toString().trim();
        if(user.equals("abc")&&pass.equals("abc")){
            Intent intent=new Intent(TeacherLogin.this,TeacherActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(TeacherLogin.this, "Wrong Password", Toast.LENGTH_SHORT).show();
        }
    }
}
