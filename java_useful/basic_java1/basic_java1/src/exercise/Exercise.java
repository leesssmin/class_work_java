package exercise;

import java.util.Scanner;

public class Exercise {

    // 코드의 진입점
    public static void main(String[] args) {

        // 스캐너 도구를 사용해서
        // 뺄셈, 곱셈, 나눗셈 연산하는 프로그램을 직접 만들어보자.
        // 사용자에게 값 2개를 연산 하시오.
        // 문제: 철수는 하루에 15만원 영희는 10만원을 번다. 둘이 하루에 버는 일당과 일주일 일했을시 버는 일당을 구해라

        Scanner sc = new Scanner(System.in);

        System.out.printf("철수 일당: ");
        int x = sc.nextInt();
        System.out.println();

        System.out.printf("영희 일당: ");
        int y = sc.nextInt();
        System.out.println();

        System.out.println("일당");
        System.out.println("일주일 일당: "+ ((x + y) * 7));


    } //end of main
} //end of class
