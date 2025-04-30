package my_test;

public class MyTest1 {
    public static void main(String[] args) {


        // 이전 배웠던 내용 + 복합 대입연산자 활용해서 직접 문제를 만들고 결과 확인

        // a= 10 b=18 일때 복합 대입 연산자를 활용하여 a에는 5을 더하고 b에는 3을 나누어 보시오
        int a = 10;
        int b = 18;

        a += 5;
        b /= 3;

        System.out.println("a는: " + a);
        System.out.println("b는: " + b);

    } // end of main
} // end of class
