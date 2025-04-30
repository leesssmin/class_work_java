package ch03;

import java.util.Scanner;

public class IfTest5 {

    // 메인함수(코드의 진입점)
    public static void main(String[] args) {

        // 키보드에서 값을 받을 도구 준비
        Scanner sc = new Scanner(System.in);

        System.out.println("성적을 입력하세요: ( 0 ~ 100)");
        //만약 저 범위 수가 잘못 입력 된다면 -> 잘못된 입력 입니다. 출력
        int score = sc.nextInt(); //키보드 정수값을 받을 수 있는 명령문
        char grade = 'x';

        // 100 ~ 90 --> A 학점 입니다.
        // 89 ~  80 --> B 학점 입니다.
        // 79 ~  70 --> C 학점 입니다.
        // 69 ~  60 --> D 학점 입니다.
        // 59 이하 --> F 학점 입니다.


        if ((score >= 90) && (score <= 100)) {
            grade = 'A';
        } else if ((score >= 80) && (score <= 89)) {
            grade = 'B';
        } else if ((score >= 70) && (score <= 79)) {
            grade = 'C';
        } else if ((score >= 60) && (score <= 69)) {
            grade = 'D';
        } else if (score <= 59) {
            grade = 'F';
            // 101~              ||  -1 ~
        } else if ((score > 100) || (score < 0)) {
            System.out.println("잘못된 입력 입니다.");
        }

        // 만약 잘못된 값이 들어왔다면 아래 구문을 출력 안할 수 있도록
        if(grade != 'x') {
            System.out.println("당신의 학점은:" + grade + "입니다.");
        }
    } //end of main
} // end of class
