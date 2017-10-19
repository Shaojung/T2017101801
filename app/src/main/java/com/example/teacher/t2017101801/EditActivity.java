package com.example.teacher.t2017101801;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
    }
    public void clickBack(View v)
    {
        finish();
    }
}
