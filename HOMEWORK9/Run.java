package HOMEWORK9;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        arr[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        arr[1] = new Student("이준섭", 25, 180.0, 68.2, 1, "컴퓨터소프트웨어학과");
        arr[2] = new Student("김말똥", 21, 187.3, 80.0, 2,"경영학과");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }


        Scanner s = new Scanner(System.in);
        Employee[] emp = new Employee[3];
        int count = 0;
        while(true){
            System.out.print("이름을 입력해라: ");
            String name = s.nextLine();

            System.out.print("나이를 입력하시오: ");
            int age = s.nextInt();

            System.out.print("신장을 입력하시오: ");
            double height = s.nextDouble();

            System.out.print("몸무게를 입력하시오: ");
            double weight = s.nextDouble();

            System.out.print("급여를 입력하시오: ");
            int salary = s.nextInt();

            s.nextLine();

            System.out.print("부서를 입력하시오: ");
            String dept = s.nextLine();


            emp[count] = new Employee(name, age, height, weight, salary, dept);
            count ++;

            if(count == 3){
                break;
            }


            System.out.println("더 입력하시겠습니까??");
            String key = s.nextLine();

            if(key.equalsIgnoreCase("n")){
                System.out.println("종료합니다.");
                break;
            }
            else if(key.equalsIgnoreCase("y")){
                continue;
            }


        }
        for(int i = 0; i < emp.length; i++){
            System.out.println(emp[i]);
        }


    }
}

