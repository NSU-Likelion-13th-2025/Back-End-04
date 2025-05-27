package Homework9;

import java.util.Objects;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Student[] arr= new Student[3];
        arr[0] = new Student("한상훈,",24,168.0,55.0,4,"정보통신공학과");
        arr[1] = new Student("김말똥,", 21, 183.7, 80.0, 2, "경영학과");
        arr[2] = new Student("강개순,", 23, 167.0, 45.0, 4, "정보통신공학과");

        for (int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[3];
        int count = 0;

        while(true){
            System.out.print("이름: ");
            String name = sc.next();

            System.out.print("나이: ");
            int age = sc.nextInt();

            System.out.print("신장: ");
            double height = sc.nextDouble();

            System.out.print("몸무게: ");
            double weight = sc.nextDouble();

            System.out.print("급여: ");
            int salary = sc.nextInt();

            sc.nextLine();

            System.out.print("부서: ");
            String dept = sc.nextLine();

            emp[count] = new Employee(name,age,height,weight,salary,dept);
            count++;

            if (count == 3) {
                break;
            }

            System.out.print("더 입력하시겠습니까?:");
            String as = sc.next();

            if(Objects.equals(as, "Y") || Objects.equals(as, "y")) {
                continue;
            }
            else if(Objects.equals(as, "N") || Objects.equals(as, "n")) {
                break;
            }
            else{
                break;
            }
        }
        for (int i =0; i<emp.length; i++){
            System.out.println(emp[i]);
        }
    }
}
