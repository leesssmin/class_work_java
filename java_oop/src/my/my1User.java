package my;

public class my1User {

    String name;
    int money;

    //생성자
    public my1User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    //상호작용 시키기
    public void takeAir(my1airPlane my1airPlane) {
        my1airPlane.take(50000);
        this.money -= 50000;
    }

    public void showInfo() {
        System.out.println("고객 이름: " + name);
        System.out.println("고객 소지금:" + money);
    }

}
