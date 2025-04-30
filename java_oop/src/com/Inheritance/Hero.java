package com.Inheritance;

public class Hero {
    String name;
    int hp;

    // 생성자 (매개변수1 , 매개변수2)
    public Hero(String name, int hp){
        this.name = name;
        this.hp = hp;

    }

    //메서드
    public void attack(){
        System.out.println("기본 공격합니다.");
    }



}
