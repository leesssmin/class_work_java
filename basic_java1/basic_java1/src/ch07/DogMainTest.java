package ch07;

public class DogMainTest {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        System.out.println(d1);

        d1.type = "리트리버";
        d1.size = "대형견";
        d1.weight = 30;
        d1.color = "갈색";
        d1.age = 5;

        System.out.println(d1.type);
        System.out.println(d1.size);
        System.out.println(d1.weight);
        System.out.println(d1.color);
        System.out.println(d1.age);

    } //end of main
}
