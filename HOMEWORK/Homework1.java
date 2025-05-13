package HOMEWORK;

public class Homework1 {

    abstract static class BankAccount {
        protected String accountNumber;
        protected double balance;

        public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public abstract void deposit(double amount);
        public abstract void withdraw(double amount);

        public void displayAccountInfo(double interestRate) {
            System.out.println("계좌번호: " + accountNumber);
            System.out.println("잔액: " + balance + "원");
            System.out.println("이자율: " + (interestRate * 100) + "%");
        }
    }

    interface BankInterest {
        double INTEREST_RATE = 0.02;
        void addInterest();
    }

    static class CheckingAccount extends BankAccount implements BankInterest {

        public CheckingAccount(String accountNumber, double balance) {
            super(accountNumber, balance);
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println(amount + "원이 입금됐습니다.");
                System.out.println("잔액: " + balance + "원");
            } else {
                System.out.println("입금 금액이 유효하지 않습니다.");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println(amount + "원이 출금됐습니다.");
                System.out.println("현재잔액: " + balance + "원");
            } else {
                System.out.println("출금 금액이 잘못되었거나 잔액이 부족합니다.");
            }
        }

        public void addInterest() {
            double interest = balance * INTEREST_RATE;
            balance += interest;
            System.out.println("이자 " + interest + "원이 추가됐습니다.");
        }
    }

    public static void main(String[] args) {
        System.out.println("21101848 이준섭\n");

        CheckingAccount myAccount = new CheckingAccount("1002-841-886669", 100000);

        myAccount.displayAccountInfo(BankInterest.INTEREST_RATE);
        System.out.println();

        myAccount.withdraw(100000);
        System.out.println();

        myAccount.deposit(50000);
        System.out.println();

        myAccount.addInterest();
        System.out.println();

        myAccount.displayAccountInfo(BankInterest.INTEREST_RATE);
    }
}
