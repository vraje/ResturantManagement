package com.example.dell.resturant_vasu;

/**
 * Created by dell on 8/5/2017.
 */

public class user {
    int id;
    String username,password,name,email;
    public user()
    {
    }
    public user(int newid, String newusername, String newpassword)
    {
        this.id=newid;
        this.username=newusername;
        this.password=newpassword;
    }
    public user(String newname,String newusername, String newemail,String newpassword)
    {

        this.username=newusername;
        this.password=newpassword;
        this.name=newname;
        this.email=newemail;
    }
    public user(String newusername,String newpassword)
    {
        this.username=newusername;
        this.password=newpassword;
    }
    public int getId()
    {
        return id;
    }
    public String getUsername()
    {
        return username;
    }
    public String getPassword()
    {
        return password;
    }
    public String getEmail() {
        return email;
    }
    public String getName() {
        return name;
    }

    public void setId(int id)

    {
        this.id=id;
    }
    public void setUsername(String username)
    {
        this.username=username;
    }
    public void setPassword(String  password)

    {
        this.password=password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setName(String name) {
        this.name = name;
    }
}