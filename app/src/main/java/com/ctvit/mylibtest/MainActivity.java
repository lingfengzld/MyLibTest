package com.ctvit.mylibtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.ctvit.mylibrary.Name;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView viewById = findViewById(R.id.tv);
//        viewById.setText("");
        viewById.setText(new Name().getString());
    }
}
