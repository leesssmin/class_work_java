package ch09;

public class Bus {

    //속성
    int busId; //버스 Id
    String busType; // 버스 종류
    String company; //운영 회사

    //생성자 여러개 있으면 생성자 오버로딩이라 한다.

//    // 생성자
//    // 매개변수를 1받는 생성자
//    public Bus(int id) {
//        busId = id;
//    }
//
//    public Bus(int id, String type){
//        busId = id;
//        busType = type;
//    }

    public Bus(int id, String type, String com){
        busId = id;
        busType = type;
        company = com;
    }

    // 매서드
    public void showInfo(){
        System.out.println("--------상태창---------");
        System.out.println("버스 ID:" + busId);
        System.out.println("버스 type:" + busType);
        System.out.println("버스 회사:" + company);
    }

}
