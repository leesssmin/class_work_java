package ch10;

public class GoingToSchool2 {

    public static void main(String[] args) {

        // 버스 객체를 3개 생성해 보시오
        Bus bus1 = new Bus(77);
        Bus bus2 = new Bus(31);
        Bus bus3 = new Bus(68);
        // 학생 객체를 2명 생성해 보시오
        Student s1 = new Student("학생 1", 20000);
        Student s2 = new Student("학생 2", 21000);

        //학생이 버스를 타는 행위를 만들어 보세요
        s1.takeBus(bus2);
        s2.takeBus(bus2);
        // 버스에 상태 창을 출력해서 결과 확인
        s1.showInfo();
        bus2.showInfo();


    }// end of main

}
