package com.example.teacher.t2017101801;

import android.app.Application;

/**
 * Created by teacher on 2017/10/23.
 */

public class DAOApplication extends Application {
    public PhoneDAO dao = new PhoneDAOMemoryImpl();
}
