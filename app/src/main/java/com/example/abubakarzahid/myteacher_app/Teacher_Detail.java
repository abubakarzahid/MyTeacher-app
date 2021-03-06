package com.example.abubakarzahid.myteacher_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Teacher_Detail extends AppCompatActivity {
    ImageView dimage;
    TextView text;
    TextView text1;
    TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher__detail);
        dimage = (ImageView)findViewById(R.id.detailimage);
        text = (TextView)findViewById(R.id.textView);
        text1 = (TextView)findViewById(R.id.textView1);
        text2 = (TextView)findViewById(R.id.textView2);


        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null){
            dimage.setImageResource(mBundle.getInt("TeacherImage"));
            String message = mBundle.getString("TeacherRank");
            String message1 = mBundle.getString("TeacherName");
            String message2 = mBundle.getString("Idandmail");
            text.setText(message);
            text1.setText(message1);
            text2.setText(message2);
        }
    }
}
