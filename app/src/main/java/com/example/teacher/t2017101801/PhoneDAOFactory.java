package com.example.teacher.t2017101801;

import android.app.Activity;
import android.content.Context;

/**
 * Created by teacher on 2017/10/23.
 */

public class PhoneDAOFactory {
    public static PhoneDAO getDAO(Context context, DAOType dt)
    {
        Activity act = (Activity) context;
        DAOApplication app = (DAOApplication) act.getApplication();
        PhoneDAO dao = null;
        switch(dt)
        {
            case Memory:
                dao = app.dao;
                break;
            case DB:
                dao = new PhoneDAODBImpl(context);
                break;
            case File:
                dao = new PhoneDAOFileImpl(context);
                break;
        }
        return dao;
    }
}
