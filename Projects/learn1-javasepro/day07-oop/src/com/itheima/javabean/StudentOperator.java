package com.itheima.javabean;

public class StudentOperator {
    private Student student;
    public StudentOperator(Student student) {
        this.student = student;
    }

    public void printPass(){
        if(student.getScores() > 60){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
}
