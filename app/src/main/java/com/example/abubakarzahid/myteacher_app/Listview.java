package com.example.abubakarzahid.myteacher_app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Listview extends AppCompatActivity {
    public static android.widget.ListView list_view;
    String [] tname;
    String [] trank;
    int [] images ={R.drawable.sir_abdulwahab,R.drawable.nouman_saleem,R.drawable.rao_umer,R.drawable.asadullah,R.drawable.ranasami_jlr,R.drawable.ranazeeshan_jlr,
    R.drawable.nouman_jlr,R.drawable.irum,R.drawable.affifa,R.drawable.sobiabashir,R.drawable.sadia,R.drawable.farah,R.drawable.nida};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        Resources res = getResources();
        tname = res.getStringArray(R.array.teachernames);
        trank = res.getStringArray(R.array.teacherrank);
        list_view = (android.widget.ListView)findViewById(R.id.teacherslist);
        TeacherAdapter teacherAdapter = new TeacherAdapter(this,tname,trank,images);
    }
}
class TeacherAdapter extends ArrayAdapter<String>{
    Context context;
    String[] images;
    String [] teacherarray;
    int[] rankarray;
    TeacherAdapter(Context c, String [] teachernames, String[] image, int[] rank){
        super(c,R.layout.activity_listview,R.id.tenames,teachernames);
        this.context=c;
        this.images = image;
        this.teacherarray = teachernames;
        this.rankarray=rank;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.activity_listview,parent,false);
        ImageView imageView = (ImageView)row.findViewById(R.id.teacherimage);
        TextView textname = (TextView)row.findViewById(R.id.tenames);
        TextView textrank = (TextView)row.findViewById(R.id.terank);
        imageView.setImageResource(Integer.parseInt(images[position]));
        textname.setText(teacherarray[position]);
        textrank.setText(rankarray[position]);

        return row;
    }
}
