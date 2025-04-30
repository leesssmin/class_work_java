package com.composition;

public class Room {

    String type;


    public Room(String type){
        this.type = type;
    }

    void describe(){
        System.out.println(type + "타입의 방 입니다.");
    }


}
