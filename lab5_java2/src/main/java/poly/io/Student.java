package poly.io;

import java.io.Serializable;

public class Student implements Serializable {
    public String name;
    public double marks;
    public String major;

    public Student(String name, double marks, String major) {
        this.name = name;
        this.marks = marks;
        this.major = major;
    }
    
    public String getGrade(){
        if(this.marks < 3){
            return "kem";
        }
        if(this.marks < 5){
            return "yeu";
        }
        if(this.marks < 6.5){
            return "trung binh";
        }
        if(this.marks < 7.5){
            return "kha";
        }
        if(this.marks < 9){
            return "gioi";
        }
        return "xuat sac";
    }
    
    public boolean isBonus(){
        return this.marks >= 7.5;
    }
}
