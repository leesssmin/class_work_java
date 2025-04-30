package ch02;

/**
 * 형 변환이란?
 * 데이터의 타입을 다른 타입으로 변경하는 것
 * 자동 형 변환, 강제 형 변환
 */
public class TypeConversion {

    //코드의 진입점
    public static void main(String[] args) {

        // 1. 자동 형 변환 확인하기
        int intDataBox = 50;
        System.out.println(intDataBox);

        //자연스럽게 형 변환( 자동 형 변환) - 작은 상자에서 큰 상자로는 자동 형 변환된다.
        double doubleDataBox = intDataBox;
        System.out.println(doubleDataBox);

        // 2. 강제 형 변환 확인하기
        final double PI = 3.1459;
        //int intBox = PI;  // 컴파일 시점에 오류 발생

        // 개발자가 컴파일러에게 "컴파일러야 괜찮으니까 그냥 강제로 넣어"
        // 데이터 손실이 발생 할 수 있지만 괜찮아!
        // 강제 형 변환
        int intBox = (int) PI;
        // 데이터 손실이 발생 했다. (소수점 버림)
        System.out.println(intBox);
        // intBox --> 3

        // 연습

        double interestRate;
        int discount;

        interestRate = 15.5;
        // 8바이트인 더블을 4바이트인 인트에 넣을려고 해서 오류뜸
        discount = (int) interestRate;
        // 15
        System.out.println(discount);

        //응용
        System.out.println((int)7.5);  // 강제 형 변환
        System.out.println((int)0.1234);  // 강제 형 변환






    } //end of main

} // end of class
