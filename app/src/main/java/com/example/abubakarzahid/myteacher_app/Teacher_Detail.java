package com.example.abubakarzahid.myteacher_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Teacher_Detail extends AppCompatActivity {
    ImageView dimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher__detail);
        dimage = (ImageView)findViewById(R.id.detailimage);

        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null){
            dimage.setImageResource(mBundle.getInt("TeacherImage"));
        }
    }
}
