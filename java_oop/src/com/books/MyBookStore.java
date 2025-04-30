package com.books;

import com.dot.B;

import java.util.Scanner;

/**
 * 모든 프로그래밍 기본은 CRUD 이다.
 */
public class MyBookStore {
    //샘플데이터 =5
    // 샘플데이터 지우면 인덱스 번호 0부터 하면 됨
    static int currentBookIndex = 6;

    // 메인 함수
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 배열 준비
        Book[] books = new Book[100];
        // books = null; // 가리키는 공간이 없다.
        boolean flag = true;

        // TODO - 추후 삭제하기
        // 샘플 데이터 미리 만들어 두기
        books[0] = new Book("플러터UI실전", "김근호");
        books[1] = new Book("무궁화꽃이피었습니다", "김진명");
        books[2] = new Book("흐르는강물처럼", "파울로코엘료");
        books[3] = new Book("리딩으로리드하라", "이지성");
        books[4] = new Book("사피엔스", "유발하라리");
        books[5] = new Book("홍길동전", "허균");


        final String SAVE = "1";
        final String SEARCH_ALL = "2";
        final String SEARCH_BY_TITLE = "3";
        final String DELETE_ALL = "4";
        final String END = "5";
        // 문자열도 받을 수 있다.
        //          "가나다라" + 줄바꿈
        // String n1 = scanner.nextLine();

        while (flag) {
            System.out.println("** 메뉴 선택 ** ");
            System.out.println("1.저장 2.전체조회 3.선택조회 4.전체삭제 5.종료");
            String selectedNumber = scanner.nextLine();
            // 숫자 비교할 때 == 사용한다.
            // 문자열 비교할 때  "문자열".equals("문자열") --> true , 다르다면 false 반환 한다.
            // 문자열 비교할 때는 무조건 equals() 메서들 사용하자.
            if(selectedNumber.equals(SAVE)) {
                System.out.println(">> 저장하기 <<");
                save(scanner, books);
            } else if(selectedNumber.equals(SEARCH_ALL)) {
                System.out.println(">> 전체조회 <<");
                readAll(books);

            } else if(selectedNumber.equals(SEARCH_BY_TITLE)) {
                System.out.println(">> 책 제목으로 조회하기 <<");
                readByTitle();

            } else if(selectedNumber.equals(DELETE_ALL)) {
                System.out.println(">> 전체 삭제하기 <<");
                deleteAll();

            } else if(selectedNumber.equals(END)) {
                System.out.println(">> 프로그램을 종료 합니다 <<");
                flag = false; // while(false) 가 되어서 종료 됨.

            } else {
                System.out.println("잘못된 선택 입니다");
            }
        }
    } // end of main

    // 저장 하기 (하나의 Book 객체를 배열에 저장하는 기능)
    public static void save(Scanner scanner, Book[] books) {
        System.out.println("--- save() ---");
        //사용자에 값을 받아서 - 데이터를 모아서 북 객체를 생성하고 배열 공간에 넣어야 한다.
        System.out.println(" 책 제목을 입력하세요");
        String title = scanner.nextLine();
        System.out.println("저자를 입력하세요");
        String author = scanner.nextLine();
        Book book = new Book(title, author);
        // books 라는 배열에 북 객체를 저장하는 코드
        //인덱스 번호 어디까지 사용했는지에 대한 정보도 필요하다.( static 변수로 관리함)
        if(currentBookIndex > books.length){
            System.out.println("더이상 저장할 공간이 없습니다");
            return;
        }


        books[currentBookIndex] = book;
        currentBookIndex++;






    }

    // 전제 조회 하기
    public static void readAll(Book[] books) {
        System.out.println("--- readAll() ---");
        // 반목문  배열 ...
        for(int i = 0; i < books.length; i++) {
            // 방어적 코드 작성
            if(books[i] != null) {
                System.out.println(books[i].getTitle() + ", " + books[i].getAuthor());
            }
        }
    }

    // 책 제목으로 조회하기(선택 조회)
    public static void readByTitle() {
        System.out.println("--- readByTitle() ---");
    }


    // 전체 삭제 하기
    public static void deleteAll() {
        System.out.println("--- deleteAll() ---");
    }


} // end of class





