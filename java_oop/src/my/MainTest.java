package my;

public class MainTest {
    public static void main(String[] args) {
        my1User m1 = new my1User("초코",70_000);
        my1airPlane my1airPlane1 = new my1airPlane(1);
        my1airPlane my1airPlane2 = new my1airPlane(2);

        m1.takeAir(my1airPlane1);

        m1.showInfo();
        System.out.println("---------------");
        my1airPlane1.showInfo();
    }
}
