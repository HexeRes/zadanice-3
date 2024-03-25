package com.example.myapplication;

import java.io.Serializable;

public class MyObject implements Serializable {
private String tank;
private int armor;
public MyObject (String tank, int armor) {
    this.tank = tank;
    this.armor = armor;
}
public String getTank(){
    return tank;
}
public  int getArmor(){
    return armor;
}
}
