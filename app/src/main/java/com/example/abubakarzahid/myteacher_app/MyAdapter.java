package com.example.abubakarzahid.myteacher_app;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by abubakar zahid on 8/1/2017.
 */

public class MyAdapter extends ArrayAdapter<String> {
    String [] names;
    String [] rank;
    int [] image;
    Context mcontext;
    public MyAdapter(@NonNull Context context, String [] name,String [] ranks,int [] tecaheriamages) {
        super(context, R.layout.teacher_list);
        this.names=name;
        this.rank=ranks;
        this.image=tecaheriamages;
        this.mcontext=context;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder mviewholder = new ViewHolder();

        // if my existing view is reused then inflate it.....
        if (convertView == null) {
            LayoutInflater minflator = (LayoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = minflator.inflate(R.layout.teacher_list, parent, false);

            // populating my data
            mviewholder. mimage = (ImageView) convertView.findViewById(R.id.teacherimage);
            mviewholder. textname = (TextView) convertView.findViewById(R.id.tenames);
            mviewholder. textrank = (TextView) convertView.findViewById(R.id.terank);
            convertView.setTag(mviewholder);
        }
        else {
            mviewholder = (ViewHolder)convertView.getTag();
        }
        // populating my data from data objects through viewholder object
            mviewholder.mimage.setImageResource(image[position]);
            mviewholder.textname.setText(names[position]);
            mviewholder.textrank.setText(rank[position]);
        // returning my view to show on screen

        return convertView;
    }
    static class ViewHolder{
        ImageView mimage;
        TextView textname;
        TextView textrank;
    }
}
