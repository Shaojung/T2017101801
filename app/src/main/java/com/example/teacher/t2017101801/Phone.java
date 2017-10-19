package com.example.teacher.t2017101801;

/**
 * Created by teacher on 2017/10/18.
 */

public class Phone {
    public int id;
    public String name;
    public String tel;
    public String addr;

    public Phone()
    {

    }

    public Phone(String name, String tel, String addr)
    {
        this.name = name;
        this.tel = tel;
        this.addr = addr;
    }
    public Phone(int id, String name, String tel, String addr)
    {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.addr = addr;
    }
}
