package HOMEWORK9;

public class Person {
    int age;
    double height;
    double weight;
    String name;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Person(){

    }

    Person(int age, double height, double weight){
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String toString(){
        return "이름: " + name + ", 나이: " + age + ", 신장: " + height + ", 몸무게: " + weight;
    }
}


