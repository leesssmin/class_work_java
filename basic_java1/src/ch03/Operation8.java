package ch03;

/**
 * 논리 연산자 복습
 */
public class Operation8 {

    // 메인 함수(코드의 진입점)
    public static void main(String[] args) {

        int number = 5;
        int index = 0;

        //논리 합 || 에서 빠른 평가가 되는 식을 만들어보자
        // 빠른 평가란?
        // 논리 연산에서 첫 번째 조건이 결과를 결정하는 경우, 두번째 조건을 평가 하지 않는다.
        // 논리 합---> 첫 번째 조건이 true 라면 두번째, 세번째 확인 안함


        //                         15 < 10       ||       2 < 10
        //                         F           ||         T
        boolean result1 = ((number += 10) < 10) || ((index += 2) < 10);
        System.out.println("result: " + result1);

        System.out.println("number: " + number);
        System.out.println("index: " + index);



    } //end of main
} //end of class
