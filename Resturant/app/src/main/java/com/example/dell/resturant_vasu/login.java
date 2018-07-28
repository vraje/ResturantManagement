package com.example.dell.resturant_vasu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {
Button button,btn2;
    EditText et1,et2;
    String username,password,name,email;
    user u;
    TextView tv10;
    dbsignup data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        data=new dbsignup(login.this);
        button=(Button)findViewById(R.id.button);
        tv10=(TextView)findViewById(R.id.tv10);
        btn2=(Button)findViewById(R.id.btn2);
        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                        try
                        {
                        username = et1.getText().toString().trim();
                        password = et2.getText().toString().trim();
                        if (username.length() > 0 && password.length() > 0) {
                            u = data.getUser(name,username,email, password);
                            String username1 = u.getUsername();
                            String password1 = u.getPassword();
                            String name1=u.getName();
                            String email1=u.getEmail();
                            if (data != null) {
                                if (username1.equals(username)) {
                                    if (password1.equals(password)) {

                                        Toast.makeText(login.this, "yes", Toast.LENGTH_SHORT).show();
                                       tv10.setText(name1+" "+username1+" "+email1+" "+password1);
                                        Intent i=new Intent(login.this,menu.class);
                                        i.putExtra("name",name1);
                                        startActivity(i);

                                    } else {
                                        Toast.makeText(login.this, "Password is wrong", Toast.LENGTH_SHORT).show();
                                    }
                                } else {
                                    Toast.makeText(login.this, "No you have to register", Toast.LENGTH_SHORT).show();
                                }
                            }
                            else{
                                Toast.makeText(login.this, "No such record exist", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(login.this, "All Fields are Required", Toast.LENGTH_SHORT).show();
                        }
                    }

                    catch (Exception e)
                    {
                        Toast.makeText(login.this, "No such record exist you have to signup", Toast.LENGTH_SHORT).show();
                    }


            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(login.this,signup.class);
                startActivity(i4);
            }
        });

    }
}
