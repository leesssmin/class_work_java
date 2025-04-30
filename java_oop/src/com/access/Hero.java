package com.access;

public class Hero {
    private String name;
    private int hp;
    private int power;
    private double defense;
    private boolean isDie;

    // getter 5개
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    public double getDefense() {
        return defense;
    }

    public boolean isDie(){
        return isDie;
    }
    //setter 5개
    public void setName(String n){
        name = n;
    }

    public void setHp(int a){
        hp = a;
    }

    public void  setPower(int b){
        power = b;
    }
    public void setDefense(double a){
        defense = a;
    }
    public  void isDie(boolean a){
        isDie = a;
    }
}
