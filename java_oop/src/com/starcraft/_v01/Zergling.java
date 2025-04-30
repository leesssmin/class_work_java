package com.starcraft._v01;

public class Zergling {

    public String name;
    public int power;
    public int hp;

    // 생성자
    public Zergling(String name) {
        this.name = name;
        this.power = 3;
        this.hp = 50;
    }

    // read only --> getter
    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    //setter 는 안만들 예정

    //저글링이 질럿을 공격하다.
    public void attackZealot(Zealot zealot) {
        zealot.beAttacked(this.power);
        System.out.println(name + "이" + zealot.getName() + "을 공격합니다");
    }

    //저글링이 마린을 공격하다.
    public void attackMarine(Marine marine) {
        marine.beAttacked(this.power);
        System.out.println(name + "이" + marine.getName() + "을 공격합니다");
    }

    // 내가 공격을 받다.
    public void beAttacked(int power){
        // 방어적 코드
        // -10
        if(this.hp <= 0){
            System.out.println(name + "이(가) 이미 사망하였습니다");
            // 실행에 제어권을 반납하고 싶으면 키워드!! (돌아가)
            return;
        }
        this.hp -= power;
        System.out.println(name + "이(가) 공격을 당합니다");
    }

    //상태를 보여주는 행위
    public void showInfo() {
        System.out.println("--------⭐상태창⭐----------");
        System.out.println("저글링 이름 :" + name);
        System.out.println("저글링 공격력 :" + power);
        System.out.println("저글링 생명력 :" + hp);
    }

}
