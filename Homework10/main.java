package Homework10;

public class main {
    public static void main(String[] args) {
        OverloadingTest a1 = new OverloadingTest();
        OverloadingTest a2 = new OverloadingTest();
        OverloadingTest a3 = new OverloadingTest();

        a1.cat();
        a2.cat(10,20);
        a3.cat("hello");


    }
}
