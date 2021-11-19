package com.example.myapplication_19_11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication_19_11.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    public static final String user = "admin";
    public static final String pass = "123";
/*    private ActivityMainBinding bind;*/
    private ActivityMainBinding bind;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_main);*/
        bind = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());


        bind.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login = bind.editTextTextPersonName.getText().toString();
                String password = bind.editTextTextPersonName2.getText().toString();
                if(login.equals(user) && password.equals(pass)){
                    bind.textView3.setText(R.string.yes2);
                }
                else{
                    bind.textView3.setText(R.string.no2);
                    bind.editTextTextPersonName.setText("");
                    bind.editTextTextPersonName2.setText("");
                }

            }
        });
    }

}