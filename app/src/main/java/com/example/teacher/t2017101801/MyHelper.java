package com.example.teacher.t2017101801;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by teacher on 2017/10/18.
 */

public class MyHelper extends SQLiteOpenHelper {
    final static String DB_Name = "student.sqlite";
    final static int VERSION = 1;

    public MyHelper(Context context) {
        super(context, DB_Name, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
