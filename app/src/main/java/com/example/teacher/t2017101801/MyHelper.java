package com.example.teacher.t2017101801;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by teacher on 2017/10/18.
 */

public class MyHelper extends SQLiteOpenHelper {
    final static String DB_Name = "student.sqlite";
    final static int VERSION = 2;

    public MyHelper(Context context) {
        super(context, DB_Name, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String createSQL = "CREATE TABLE \"phone\" (\"id\" INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL , \"name\" VARCHAR, \"tel\" VARCHAR, \"addr\" VARCHAR, \"email\" VARCHAR)";
        sqLiteDatabase.execSQL(createSQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        if (i == 1 && i1 == 2)
        {
            String upgradeSQL = "ALTER TABLE \"main\".\"phone\" ADD COLUMN \"email\" VARCHAR";
            sqLiteDatabase.execSQL(upgradeSQL);
        }

    }
}
