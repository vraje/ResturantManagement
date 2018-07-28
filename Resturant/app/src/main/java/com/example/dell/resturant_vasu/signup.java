package com.example.dell.resturant_vasu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    Button button;
    EditText et3,et4,et5,et6;
    String usern,pass,email,name;
    dbsignup data;
    user u;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        data = new dbsignup(signup.this);
        button=(Button)findViewById(R.id.button);
        et3=(EditText)findViewById(R.id.et3);
        et4=(EditText)findViewById(R.id.et4);
        et5=(EditText)findViewById(R.id.et5);
        et6=(EditText)findViewById(R.id.et6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    try {

                        name = et3.getText().toString();
                        usern = et4.getText().toString();
                        email = et5.getText().toString();
                        pass = et6.getText().toString();
                        if (pass.length() > 0 && usern.length() > 0 && email.length() > 0 && name.length()>0) {
                            u = new user();
                            u.setUsername(usern);
                            u.setPassword(pass);
                            u.setEmail(email);
                            u.setName(name);
                            long l = data.addUser(u);
                            if (l < 0) {
                                Toast.makeText(signup.this, "Unsuccessfull", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(signup.this, "successfull", Toast.LENGTH_SHORT).show();
                                Intent i = new Intent(signup.this, login.class);
                                startActivity(i);
                            }

                        } else {
                            Toast.makeText(signup.this, "Field cant be empty", Toast.LENGTH_SHORT).show();
                        }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

                });
        }
}




