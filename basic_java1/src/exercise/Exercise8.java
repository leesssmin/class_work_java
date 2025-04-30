package exercise;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        // 프로그래밍에서는 C R U D 개념이 있다.
        // 생성, 조회, 수정, 삭제
        // 실행에 흐름을 만들어 보는 연습 1단계

        // 준비물 : 스캐너
        Scanner sc = new Scanner(System.in);
        // 2단계
        // 괄호 - 조건식
        // 4 < 10 --> true
        // boolean flag = true
        // true
//        while (true){
//            System.out.println("......");
//            if( 5 < 10 ){
//                break;
//            }
//        }
        // 도구를 준비
        int choice = sc.nextInt(); //키보드에서 정수값을 받을수 있는 명령어

        // 1, 2, 3, 4, 0 따라서 실행에 흐름을 만들어야 된다.

        // 1. 스캐너
        // 2. while
        // 3. 만약 ... if 구문

        boolean flag = true;
        while (flag) {
            System.out.println("메뉴를 선택하시오.");
            System.out.println("1.등록 2.조회 3.수정 4.삭제 0.종료");

            if (choice == 1) {
                System.out.println("등록을 선택했습니다.");
            } else if (choice == 2) {
                System.out.println("조회를 선택했습니다.");
            } else if (choice == 3) {
                System.out.println("수정을 선택 했습니다.");
            } else if (choice == 4) {
                System.out.println("삭제를 선택 했습니다.");
            } else if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                flag = false;  // break
            } else {
                System.out.println("잘못된 입력입니다. 다시 선택해주세요");
            }

        }

        } // end of main
    } //end of class
