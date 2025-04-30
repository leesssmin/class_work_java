package com.Inheritance;

public class Wizard extends Archer {

    public Wizard(String name , int hp){
        super(name, hp);
    }

    public void freezing(){
        System.out.println("얼리기");
    }
}
