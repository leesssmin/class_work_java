package com.Inheritance;


class Animal{
  // 자식클래스에서 접근 가능하다.
  protected String name;

    //부모 클래스
    void eat(){
        System.out.println(name + "이(가) 밥을 먹습니다.");
    }
}

//자식 클래스
class Dog extends Animal{
    void bark(){
        System.out.println(name + "이(가) 멍멍 짖습니다.");
    }

    void eat(){
        super.eat();

        //super.eat(); 필요하다면 사용함
    }

}

class Cat extends  Animal{

    void bark(){
        System.out.println("고양이가 야옹~ 합니다");
    }

    void eat(){
        //고양이의 먹는 모습 구현
        // super.eat();
    }
}




//xxx.java 단하나의 자바 파일에는 public 가진 클래스는 오직 하나만 존재할 수 있다.
public class Main1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "바둑";

        dog.eat(); //부모의 클래스 메서드 호출
        dog.bark(); // 자식 클래스 메서드 호출
    } //end of main

}// end of class
