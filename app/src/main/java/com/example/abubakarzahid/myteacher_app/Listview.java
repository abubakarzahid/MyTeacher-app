package com.example.abubakarzahid.myteacher_app;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Listview extends AppCompatActivity {
    Listview list;
    String [] tname;
    String [] trank;
    int [] imaags ={R.drawable.sir_abdulwahab,R.drawable.nouman_saleem,R.drawable.rao_umer,R.drawable.asadullah,R.drawable.ranasami_jlr,R.drawable.ranazeeshan_jlr,
    R.drawable.nouman_jlr,R.drawable.irum,R.drawable.affifa,R.drawable.sobiabashir,R.drawable.sadia,R.drawable.farah,R.drawable.nida};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        Resources res = getResources();
        tname = res.getStringArray(R.array.teachernames);
        trank = res.getStringArray(R.array.teacherrank);
        list = (Listview) findViewById(R.id.teacherslist);
    }
}
