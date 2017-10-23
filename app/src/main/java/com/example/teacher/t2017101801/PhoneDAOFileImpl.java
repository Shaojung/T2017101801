package com.example.teacher.t2017101801;

import android.app.Activity;
import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by teacher on 2017/10/23.
 */

public class PhoneDAOFileImpl implements PhoneDAO {
    ArrayList<Phone> datalist = new ArrayList();
    String File_Name = null;
    public PhoneDAOFileImpl(Context context)
    {
        Activity act = (Activity) context;
        File_Name = act.getFilesDir().getAbsolutePath() + File.separator + "mydata.json";
        FileReader fr = null;
        try {
            File f = new File(File_Name);
            if (f.exists())
            {
                fr = new FileReader(File_Name);
                BufferedReader br = new BufferedReader(fr);
                String str = br.readLine();
                Gson gson = new Gson();
                datalist = gson.fromJson(str, new TypeToken<ArrayList<Phone>>(){}.getType());
                br.close();
                fr.close();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveFile()
    {
        Gson gson = new Gson();
        String str = gson.toJson(datalist);
        FileWriter fw = null;
        try {
            fw = new FileWriter(File_Name);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(str);
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void addOne(Phone p) {
        datalist.add(p);
        saveFile();
    }

    @Override
    public Phone getOne(int id) {
        return null;
    }

    @Override
    public void clearAll() {

    }

    @Override
    public Phone[] getList() {
        return datalist.toArray(new Phone[datalist.size()]);
    }

    @Override
    public void delete(Phone p) {

    }

    @Override
    public void update(Phone p) {

    }
}
