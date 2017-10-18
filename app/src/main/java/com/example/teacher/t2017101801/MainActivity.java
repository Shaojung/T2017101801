package com.example.teacher.t2017101801;

import android.content.ContentValues;
import android.database.Cursor;
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
        Phone p = new Phone();
        p.name = "BBB";
        p.tel = "123";
        p.addr = "aabb";
        add(p);

        Phone p1 = getOne(1);


    }

    public void add(Phone p)
    {
        MyHelper helper = new MyHelper(MainActivity.this);
        SQLiteDatabase db = helper.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("name", p.name);
        cv.put("tel", p.tel);
        cv.put("addr", p.addr);

        db.insert("phone", null, cv);
        db.close();
    }

    public Phone getOne(int id)
    {
        Phone p = new Phone();
        MyHelper helper = new MyHelper(MainActivity.this);
        SQLiteDatabase db = helper.getWritableDatabase();
        Cursor c = db.query("phone", new String[] {"id","name","tel","addr"}, "id=?", new String[] {String.valueOf(id)}, null, null, null);
        c.moveToFirst();
        p.id = c.getInt(0);
        p.name = c.getString(1);
        p.tel = c.getString(2);
        p.addr = c.getString(3);
        db.close();
        return p;
    }

}
