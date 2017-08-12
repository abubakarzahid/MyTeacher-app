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

   ListView list;
    String [] tname = {"Sir Abdul-Wahab","Sir Nadeem","Sir Sarmad Ali","Sir Arshad","Sir Salman","Sir Khurram bajwa","Sir Yasir Mahmood","Sir Adnan","Sir Abid Bashir","Sir Atif Chatha","Sir Hammad","Sir Khurram Shahzad","Sir Ibrar","Sir Shahid Yousaf","Sir Nouman Saleem","Rao Umer","Sir Asadullah","Sir Rana Sami ","Sir Rana Zeeshan ","Sir Nouman jlr",
    "Mam Irum","Mam Affifa","Mam Sobia Bashir","Mam Sadia","Mam Farah"};
    String [] trank ={"Assistant Professor","HOD","Assistant Professor","Assistant Professor","Assistant Professor","Assistant Professor","Assistant Professor","Assistant Professor","Assistant Professor","Assistant Professor","Assistant Professor","Assistant Professor","Assistant Professor","Assistant professor","Lecture R","Lecture R","Lecture R","Lecture R","Junior Lecture R","Junior lecture R","junior Lecture R",
    "Junior Lecture R","Lecture R","Assistant Professor","Lecture R","Lecture R","Lecture R"};
    String [] tteaches = {"[{\n" +
            "  \"id\": 1,\n" +
            "  \"email\": \"abdulwahab@uol.edu.pk\"\n" +
            "}]","[{\n" +
            "  \"id\": 2,\n" +
            "  \"email\": \"nadeem.uol.edu.pk\"\n" +
            "}]","[{\n" +
            "  \"id\": 3,\n" +
            "  \"email\": \"sarmadali.uo.edu.pk\"\n" +
            "}]","[{\n" +
            "  \"id\": 4,\n" +
            "  \"email\": \"khurrambajwa.uol.edu.pk\"\n" +
            "}]","[{\n" +
            "  \"id\": 5,\n" +
            "  \"email\": \"yasir.uol.edu.pk\"\n" +
            "}]","[{\n" +
            "  \"id\": 6,\n" +
            "  \"email\": \"adnan.uol.edu.pk\"\n" +
            "}]","[{\n" +
            "  \"id\": 7,\n" +
            "  \"email\": \"abidbashir.uol.edu.pk\"\n" +
            "}]","[{\n" +
            "  \"id\": 8,\n" +
            "  \"email\": \"atifchatta.uo.edu.pk\"\n" +
            "}]","[{\n" +
            "  \"id\": 9,\n" +
            "  \"email\": \"hammad.uol.edu.pk\"\n" +
            "}]","[{\n" +
            "  \"id\": 10,\n" +
            "  \"email\": \"khurramshahzad.uol.edu.pk\"\n" +
            "}]","[{\n" +
            "  \"id\": 11,\n" +
            "  \"email\": \"ibrar.uol.edu.pk\"\n" +
            "}]","[{\n" +
            "  \"id\": 12,\n" +
            "  \"email\": \"shahidyousaf.uo.edu.pk\"\n" +
            "}]","[{\n" +
            "  \"id\": 13,\n" +
            "  \"email\": \"nouamnsaleem.gov\"\n" +
            "}]","[{\n" +
            "  \"id\": 14,\n" +
            "  \"email\": \"raoumer.gov\"\n" +
            "}]","[{\n" +
            "  \"id\": 15,\n" +
            "  \"email\": \"asadullah.gov\"\n" +
            "}]","[{\n" +
            "  \"id\": 16,\n" +
            "  \"email\": \"ranasami.gov\"\n" +
            "}]","[{\n" +
            "  \"id\": 17,\n" +
            "  \"email\": \"ranazeeshan.gov\"\n" +
            "}]","[{\n" +
            "  \"id\": 18,\n" +
            "  \"email\": \"nouman.gov\"\n" +
            "}]","[{\n" +
            "  \"id\": 19,\n" +
            "  \"email\": \"irum.gov\"\n" +
            "}]","[{\n" +
            "  \"id\": 20,\n" +
            "  \"email\": \"affifa.gov\"\n" +
            "}]","[{\n" +
            "  \"id\": 21,\n" +
            "  \"email\": \"sobia.gov\"\n" +
            "}]","[{\n" +
            "  \"id\": 22,\n" +
            "  \"email\": \"sadia.gov\"\n" +
            "}]","[{\n" +
            "  \"id\": 23,\n" +
            "  \"email\": \"farah.gov\"\n" +
            "}]","[{\n" +
            "  \"id\": 24,\n" +
            "  \"email\": \"borrey0@hhs.gov\"\n" +
            "}]","[{\n" +
            "  \"id\": 25,\n" +
            "  \"email\": \"borrey0@hhs.gov\"\n" +
            "}]"};
    int [] images ={R.drawable.sir_abdulwahab,R.drawable.nadeem,R.drawable.sarmad,R.drawable.teacher,R.drawable.salman,R.drawable.bajwa,R.drawable.yasir,R.drawable.adnan,R.drawable.abidbashir,R.drawable.atif,R.drawable.hammad,R.drawable.khurramshahzad,R.drawable.ibrar,R.drawable.shahidyousaf,R.drawable.nouman_saleem,R.drawable.rao_umer,R.drawable.asadullah,R.drawable.ranasami_jlr,R.drawable.ranazeeshan_jlr,
    R.drawable.nouman_jlr,R.drawable.irum,R.drawable.affifa,R.drawable.sobiabashir,R.drawable.sadia,R.drawable.farah};


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
                mIntent.putExtra("TeacherRank",trank[i]);
                mIntent.putExtra("TeacherName",tname[i]);
                mIntent.putExtra("Idandmail",tteaches[i]);
                // i is our postition
                startActivity(mIntent);
            }
        });
    }

}

