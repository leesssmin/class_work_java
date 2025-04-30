package com.association;

public class MainTest1 {

    public static void main(String[] args) {

        Course course = new Course("자바");
        Course db = new Course("데이터 베이스");

        Student student = new Student("홍길동");

        student.showCourse();

    } //end of main
} //end of class
