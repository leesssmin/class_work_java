package com.composition;

import com.dot.C;

public class Car {

    String name;
    int price;
    //포함관계(컴포지션)
    //Car 클래스는 Engine 객체를 포함 합니다.
    Engine engine;

    public Car(){
        // 자동차 객체가 생성될때 엔진 객체도 함께 생성 된다.
        // 강한 의존성
        engine = new Engine();
    }

    void startCar(){
        engine.start(); // car 객체를 통해 Engine의 start()메서드를 호출
        System.out.println("자동차가 출발합니다");
    }

    void stopCar(){
        System.out.println("자동차가 멈춥니다.");
        engine.stop();
    }

    //테스트 코드 작성
    public static void main(String[] args) {

        //**컴포지션 관계를**
        // 자동차 클래스 내부에서 엔진 객체를 생성 시켜야 컴포지션 관계이다.
        Car car = new Car();
        car. startCar();
        car. stopCar();

    } //end of main
}
