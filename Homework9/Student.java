package Homework9;

public class Student extends Person {
    int grade;
    String major;

    public int getGrade(){
        return grade;
    }
    public void setGrade(){
        this.grade = grade;
    }

    public String getMajor(){
        return major;
    }
    public void setMajor(){
        this.major = major;
    }

    Student(){
    }

    Student(String name, int age, double height, double weight, int grade, String major) {
        super(age, height, weight);
        this.name = name;
        this.grade = grade;
        this.major = major;
    }

    @Override
    public String toString() {
        return " 이름 :"+ name +" 나이: " + age + " 신장: " + height + ", 몸무게: " + weight + ", 학년: "+ grade+ ", 전공: "+ major;
    }
}
