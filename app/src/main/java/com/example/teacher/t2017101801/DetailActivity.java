package com.example.teacher.t2017101801;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    Phone p;
    TextView tvId, tvName, tvTel, tvAddr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tvId = (TextView) findViewById(R.id.textView);
        tvName = (TextView) findViewById(R.id.textView2);
        tvTel = (TextView) findViewById(R.id.textView3);
        tvAddr = (TextView) findViewById(R.id.textView4);


        Intent it = getIntent();
        int id = it.getIntExtra("id", 0);
        PhoneDAO dao = new PhoneDAODBImpl(DetailActivity.this);
        p = dao.getOne(id);
        tvId.setText(String.valueOf(p.id));
        tvName.setText(p.name);
        tvTel.setText(p.tel);
        tvAddr.setText(p.addr);

    }
}
