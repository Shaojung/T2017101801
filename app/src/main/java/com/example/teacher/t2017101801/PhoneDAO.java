package com.example.teacher.t2017101801;

/**
 * Created by teacher on 2017/10/18.
 */

public interface PhoneDAO {
    public void addOne(Phone p);
    public Phone getOne(int id);
    public void clearAll();
    public Phone[] getList();
}
