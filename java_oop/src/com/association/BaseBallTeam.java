package com.association;

public class BaseBallTeam {

    private String name;

    public BaseBallTeam(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void display(){
        System.out.println("팀 이름 :" + name);
    }

}
