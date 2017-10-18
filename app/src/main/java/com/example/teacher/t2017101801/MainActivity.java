package com.example.teacher.t2017101801;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
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
        ContentValues cv = new ContentValues();
        cv.put("name", "AAA");
        cv.put("tel", "1111");
        cv.put("addr", "aabb123");

        db.insert("phone", null, cv);


        Cursor c = db.query("phone", new String[] {"name"}, null, null, null, null, null);
        c.moveToFirst();
        Log.d("DB", c.getString(0));

        db.close();

    }

}
