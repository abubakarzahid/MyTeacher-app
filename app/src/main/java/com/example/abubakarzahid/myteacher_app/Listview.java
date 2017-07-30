package com.example.abubakarzahid.myteacher_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Listview extends AppCompatActivity {
    Listview Tlist;
    String [] teachernames;
    String [] teacher_rank;
    int [] imgs = {};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
    }
}
