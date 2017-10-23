package com.example.teacher.t2017101801;

import java.util.ArrayList;

/**
 * Created by teacher on 2017/10/23.
 */

public class PhoneDAOMemoryImpl implements PhoneDAO {
    ArrayList<Phone> datalist = new ArrayList();
    int id = 1;
    @Override
    public void addOne(Phone p) {
        p.id = this.id;
        this.id++;
        datalist.add(p);
    }

    @Override
    public Phone getOne(int id) {
        return null;
    }

    @Override
    public void clearAll() {
        datalist.clear();
    }

    @Override
    public Phone[] getList() {
        return datalist.toArray(new Phone[datalist.size()]);
    }

    @Override
    public void delete(Phone p) {
        datalist.remove(p);
    }

    @Override
    public void update(Phone p) {

    }
}
