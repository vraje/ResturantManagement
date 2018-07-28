package com.example.dell.resturant_vasu;

/**
 * Created by dell on 8/5/2017.
 */

public class usercart {
    String item,fname;
    public  usercart()
    {

    }
    public usercart(String newname,String newitem)
    {
        this.fname=newname;
        this.item=newitem;
    }

    public String getFname() {
        return fname;
    }

    public String getItem() {
        return item;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
