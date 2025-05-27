package Homework9;

public class Person  {
    String name;
    int age;
    double height;
    double weight;

    protected String getName(){
        return name;
    }
    protected void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    Person(){
    }
    Person(int age, double height, double weight){
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    String tostring(){
        return "나이: " + age + " 신장: " + height + " 몸무게: " + weight;
    }


}

