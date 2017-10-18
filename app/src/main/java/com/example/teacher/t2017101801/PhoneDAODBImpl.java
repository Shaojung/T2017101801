package com.example.teacher.t2017101801;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by teacher on 2017/10/18.
 */

public class PhoneDAODBImpl implements PhoneDAO {
    SQLiteDatabase db;

    public PhoneDAODBImpl(Context context)
    {
        MyHelper helper = new MyHelper(context);
        db = helper.getWritableDatabase();
    }

    @Override
    public void addOne(Phone p) {

    }

    @Override
    public Phone getOne(int id) {
        return null;
    }
}
