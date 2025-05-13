package Homework5;

import static Homework5.BankInterset.interestrate;

abstract class BankAccount {
    String accountNumber;
    double balance;

    abstract void deposit(double amount); //입금
    abstract void withdraw(double amount);//출금
    //BankAccount 추상 클래스, 입/출금 메서드 정의
}

class CheckingAccount extends BankAccount  implements BankInterset {
    public CheckingAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    } //생성자: 계좌 번호와 초기 잔액을 매개변수로 받아, 해당 값을 객체의 accountNumber와 balance 필드에 저장

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + "원이 출금됐습니다.");
            System.out.println("현재 잔액 : " + balance + "\n" );
        }
        else {
            System.out.println("출금 할 수 없습니다.\n");
        }
    } //출금 메서드

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + "원이 입금됐습니다.");
        System.out.println("잔액 : " + (balance + amount)+ "\n");
    } //입금 메서드

    public void addInterest() {
        System.out.println("이자 " + (balance * interestrate) + "원이 추가됐습니다.\n");
        balance += balance * interestrate;
    } //이자 계산 및 추가

    public void displayAccountInfo() {
        System.out.println("계좌 번호: " + accountNumber);
        System.out.println("잔액 : " + balance);
        System.out.println("이자율 : " + (interestrate*100) + "%\n");
    } //계좌 정보 출력
}

public class main {
    public static void main(String[] args) {
        System.out.println("21102088 한상훈");//각자 학번과 이름으로 설정
        CheckingAccount account = new CheckingAccount("123-4567890", 100000.0);

        account.displayAccountInfo();

        account.withdraw(100000);

        account.deposit(50000);

        account.addInterest();

        account.displayAccountInfo();
    }
}
