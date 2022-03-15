package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rcv = (RecyclerView)findViewById(R.id.rclView);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        String arr []= {"JAVA","C","C++",".NET","PHP","JQUERY","JAVASCRIPT","C","C++",".NET",
                         "PHP","JQUERY",
                       "JAVASCRIPT","C","C++",".NET","PHP",
                      "JQUERY","JAVASCRIPT","C","C++",".NET","PHP","JQUERY","JAVASCRIPT"
                      ,"C","C++",".NET","PHP","JQUERY","JAVASCRIPT","C","C++",".NET",
                      "PHP","JQUERY","JAVASCRIPT"};
          rcv.setAdapter(new myAdaptoo(arr));

    }
}