package my;

public class Hero1 {

    String name;
    int hp;

    public Hero1(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public void attack(){
        System.out.println("기본 공격을 합니다.");
    }
}
