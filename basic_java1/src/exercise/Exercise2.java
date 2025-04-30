package exercise;

public class Exercise2 {
    public static void main(String[] args) {

        // 1. 데이터 10, 100, 1000을 변수 선언과 동시에 초기화하고 화면에 출력
        int a = 10;
        int b = 100;
        int c = 1000;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);

        // 2. int ageBox 상자에 20 담기
        int ageBox = 20;

        // 2-1 ageBox 상자의 값을 30으로 변경하고 기존에 담겨 있던 데이터를 다른곳으로 옮기기
        int ageBox1 = ageBox;
        ageBox = 30;
        System.out.println("수정된 나이:" + ageBox);
        System.out.println("원래 나이:" + ageBox1);

        // 3. int d= 1; int e = 3; 선언하고 a와b에 담겨 있는 값을 서로 스위칭
        int d = 1;
        int e = 3;

        int temp = d;
        d = e;

        e = temp;
        System.out.println("d:" + d);
        System.out.println("e:" + e);


    } // end of main


} // end of class
