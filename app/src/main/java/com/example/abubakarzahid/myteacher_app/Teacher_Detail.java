package com.example.abubakarzahid.myteacher_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Teacher_Detail extends AppCompatActivity {
    ImageView dimage;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher__detail);
        dimage = (ImageView)findViewById(R.id.detailimage);
        text = (TextView)findViewById(R.id.textView);


        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null){
            dimage.setImageResource(mBundle.getInt("TeacherImage"));
            String message = mBundle.getString("TeacherRank");
            text.setText(message);
        }
    }
}
