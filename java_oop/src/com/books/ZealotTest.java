package com.books;

import com.starcraft._v01.Zealot;

public class ZealotTest {

    public static void main(String[] args) {

        Zealot[] zealots = new Zealot[5];

        // 반복문 사용하지 말고 질럿 3마리 0,1 ,3
        zealots[0] = new Zealot("질럿0");
        zealots[1] = new Zealot("질럿1");
        zealots[3] = new Zealot("질럿3");

        //0번째 인겟스에 주소값을 넣어둔 질럿을 기능 showInfo() 호출 하시오
        //zealots[0] - z1.showInfo();
        zealots[0].showInfo();

        //반복문을 황용해서 배열안에 있는 질럿들에 showInfo()를 호출
        for(int i =0; i < zealots.length; i++){
            // 방어적 코드
            if (zealots[i] != null){
                System.out.println(zealots[i].getName());
            }
        }

    } //end of main



}
