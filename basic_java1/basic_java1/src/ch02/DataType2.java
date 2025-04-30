package ch02;

/*
문자 제이터 타입 : char
char 자료형에 크기는 2byte; 16비트 [] 네모칸이 16개 있다라는 의미
 */
public class DataType2 {

    public static void main(String[] args) {

        // 단 하나의 ㅁ누자를 저장하기 위해 사용할 수 있다.

        char charBox;
        charBox = 'A';  // '가' -> 문자타입,  "가나다" -> 문자열
        System.out.println(charBox);

        char alphabetA = 'A';
        char alphabetB = 'B';
        char alphabetBox = alphabetA;
        System.out.println(alphabetBox);

        // 더 많은 글자를 담고 싶으면
        String temp = "안녕반가워";
        System.out.println(temp);


    } // end od main
} //end of class
