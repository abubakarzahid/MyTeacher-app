package com.example.abubakarzahid.myteacher_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    EditText uname;
    EditText upassword;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname = (EditText)findViewById(R.id.edtusername);
        upassword = (EditText)findViewById(R.id.edtpassword);
        login = (Button)findViewById(R.id.btnlogin);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = uname.getText().toString();
                String password = upassword.getText().toString();
                // storing my username and password
                if (name.equals("abubakar") && password.equals("4373337")){
                    Intent intent = new Intent(MainActivity.this,Listview.class);
                    startActivity(intent);
                }
                else if (name.equals("") || password.equals(""))
                {
                    Toast.makeText(getBaseContext(),"Enter username and password",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getBaseContext(),"Wrong username and password",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
