package com.example.teacher.t2017101801;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Created by teacher on 2017/10/18.
 */
@RunWith(AndroidJUnit4.class)
public class MyDAOTest1 {

    @Test
    public void clearAndAddOneDataAndGetTest()
    {
        Context appContext = InstrumentationRegistry.getTargetContext();
        PhoneDAODBImpl dao = new PhoneDAODBImpl(appContext);
        Phone p = new Phone();
        p.name = "BBB";
        p.tel = "123";
        p.addr = "aabb";
        dao.clearAll();
        dao.addOne(p);

        Phone pArray[] = dao.getList();
        assertEquals("BBB", pArray[0].name);

    }

    @Test
    public void testDelete()
    {
        Context appContext = InstrumentationRegistry.getTargetContext();
        PhoneDAODBImpl dao = new PhoneDAODBImpl(appContext);
        Phone p1 = new Phone("CCC", "333", "CC33");
        Phone p2 = new Phone("DDD", "444", "DD44");

        dao.clearAll();
        dao.addOne(p1);
        dao.addOne(p2);
        Phone pArray[] = dao.getList();
        p1.id = pArray[0].id;
        dao.delete(p1);
        Phone pArray2[] = dao.getList();
        assertEquals("DDD", pArray2[0].name);
    }
    @Test
    public void testUpdate()
    {
        Context appContext = InstrumentationRegistry.getTargetContext();
        PhoneDAODBImpl dao = new PhoneDAODBImpl(appContext);
        Phone p1 = new Phone("CCC", "333", "CC33");

        dao.clearAll();
        dao.addOne(p1);
        Phone pArray[] = dao.getList();
        p1.id = pArray[0].id;
        p1.name = "CDE";
        dao.update(p1);
        Phone pArray2[] = dao.getList();
        assertEquals("CDE", pArray2[0].name);
    }
}
