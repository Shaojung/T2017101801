package com.example.teacher.t2017101801;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View v)
    {
        MyHelper helper = new MyHelper(MainActivity.this);
        SQLiteDatabase db = helper.getWritableDatabase();

    }

}
