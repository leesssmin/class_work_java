package ch07;

public class CarMainTest {
    public static void main(String[] args) { Car c1 = new Car();
        System.out.println(c1);

        c1.name = "자동차";
        c1.number = 7737;
        c1.weight = 2100.12;
        c1.color = "파란색";
        c1.horsepower = 330;

        System.out.println("이름: " + c1.name);
        System.out.println("차 번호:" + c1.number);
        System.out.println("차 중량:" + c1.weight);
        System.out.println("차 색:" + c1.color);
        System.out.println("마력:" + c1.horsepower);

    }


}
