package Homework10;

public class OverloadingTest {
    int a;
    int b;
    String c;

    void cat(){
        System.out.println("매개변수 없음");
    }

    void cat(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("매개변수: " + a + ", " + b );
    }

    void cat(String c){
        this.c = c;
        System.out.println("매개변수: "+ c);
    }
}
