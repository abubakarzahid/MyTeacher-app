package com.example.abubakarzahid.myteacher_app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Listview extends AppCompatActivity {
    Toolbar tbar;
   ListView list;
    String [] tname = {"Sir Abdul-Wahab","Sir Nouman Saleem","Rao Umer","Sir Asadullah","Sir Rana Sami ","Rana Zeeshan ","Sir Nouman jlr",
    "Mam Irum","Mam Affifa","Mam Sobia Bashir","Mam Sadia","Mam Farah","Mam Nida"};
    String [] trank ={"Assistant Professor","Lecture R","Lecture R","Lecture R","Junior Lecture R","Junior lecture R","junior Lecture R",
    "Junior Lecture R","Lecture R","Assistant Professor","Lecture R","Lecture R","Lecture R"};
    int [] images ={R.drawable.sir_abdulwahab,R.drawable.nouman_saleem,R.drawable.rao_umer,R.drawable.asadullah,R.drawable.ranasami_jlr,R.drawable.ranazeeshan_jlr,
    R.drawable.nouman_jlr,R.drawable.irum,R.drawable.affifa,R.drawable.sobiabashir,R.drawable.sadia,R.drawable.farah,R.drawable.nida};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        list = (ListView)findViewById(R.id.teacherslist);

        MyAdapter myAdapter = new MyAdapter(Listview.this,tname,trank,images);
        list.setAdapter(myAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent mIntent = new Intent(Listview.this,Teacher_Detail.class);
                mIntent.putExtra("TeacherImage",images[i]);
                // i is our postition
                startActivity(mIntent);
            }
        });
    }

}

