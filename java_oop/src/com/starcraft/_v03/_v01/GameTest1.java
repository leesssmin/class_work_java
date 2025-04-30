package com.starcraft._v03._v01;

public class GameTest1 {

    public static void main(String[] args) {
        // 실행의 흐름을 스스로 만들어 보자
        Unit unit1 = new Zealot("zealot1");
        Unit unit2 = new Zergling("zergling1");
        Unit unit3 = new Marine("marine1");
        unit1.showInfo();
        System.out.println("------------");
        unit2.showInfo();
        System.out.println("-------------");
        unit3.showInfo();
        System.out.println("--------------");

        // 마린의 칭호 입력
        String resulttitle = ((Marine) unit3).title;
        System.out.println("칭호: " + resulttitle);

        // 배열, 객체 , for
        Unit[] units = new Unit[4];
        units[0] = new Unit();
        units[1] = new Zealot("zealot1");
        units[2] = new Zergling("zergling1");
        units[3] = new Marine("marine1");

        for(int i = 0; i<units.length; i++){
            units[i].attack(units[3]);
        }

    }// end of main
}
