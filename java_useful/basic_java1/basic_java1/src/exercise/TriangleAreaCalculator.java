package exercise;

public class TriangleAreaCalculator {

    // 코드의 진입점
    public static void main(String[] args) {

        // 삼각형의 면적을 구하는 코드를 작성해보자.
        // 식: (밑변 * 높이)/2
        final double BASE = 10.0;
        final double HEIGHT = 5.0;

        final double Area = (BASE * HEIGHT) / 2;
        System.out.println("삼각형의 면적:" + Area);

    } //end of main
} //end of class
