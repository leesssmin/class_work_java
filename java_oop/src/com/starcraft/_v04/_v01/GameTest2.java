package com.starcraft._v04._v01;

import java.util.Scanner;

public class GameTest2 {

    public static void main(String[] args) {
        Zergling zergling1 = new Zergling("저글링1");
        Marine marine1 = new Marine("마린1");
        Zealot zealot1 = new Zealot("질럿1");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1.질럿 2.마린 3.저글링 0.종료");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("공격 개시 1.마린 2. 저글링");
                int target = scanner.nextInt();
                if (target == 1) {
                    zealot1.attackMarine(marine1);
                } else if (target == 2) {
                    zealot1.attackZergling(zergling1);

                }
            } else if (choice == 2) {
                System.out.println("공격 개시 1. 질럿 2. 저글링");
                int target = scanner.nextInt();
                if (target == 1) {
                    marine1.attackZealot(zealot1);
                } else if (target == 2) {
                    marine1.attackZergling(zergling1);
                }

            } else if (choice == 3) {
                System.out.println("공격 개시 1. 질럿 2. 마린");
                int target = scanner.nextInt();
                if (target == 1) {
                    zergling1.attackZealot(zealot1);
                } else if (target == 2) {
                    zergling1.attackMarine(marine1);
                }

            } else if (choice == 0) {
                System.out.println("종료 합니다");
                break;
            } else {
                System.out.println("에러");
            }
        }


    }


}
