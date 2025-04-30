package my;

public class my1airPlane {

    int airNumber;
    int money;
    int count;

    //생성자
    public my1airPlane(int airNumber){
        this.airNumber = airNumber;
    }

    // 고객을 태운다. (메서드)
    public void take(int money){
        this.money += money;
        count ++;
    }

    // 상태창 화면
    public void showInfo(){
        System.out.println("일련 번호:" + airNumber);
        System.out.println("고객 수:" + count);
        System.out.println("운임 수익금:" + money);
    }
}
