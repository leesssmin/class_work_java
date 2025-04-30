package my;

import com._static.Employee;

public class Static_Employee {

    private int emplyeeId;
    private String name;
    private String department;

    //생성자
    public Static_Employee(String name){
        this.name = name;
        emplyeeId =Static_Company.empSerialNumber;
    }

    public int getEmplyeeId(){
        return emplyeeId;
    }

    public String getName(){
        return getName();
    }

    public String getDepartment(){
        return department;
    }

}
