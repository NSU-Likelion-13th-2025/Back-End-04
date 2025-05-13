package HOMEWORK;

import java.time.LocalDate;

class Reservation<T> {
    private String name;
    private int age;
    private T appointmentDate;

    public Reservation(String name, int age, T appointmentDate) {
        this.name = name;
        this.age = age;
        this.appointmentDate = appointmentDate;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public T getAppointmentDate() { return appointmentDate; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setAppointmentDate(T appointmentDate) { this.appointmentDate = appointmentDate; }

    @Override
    public String toString() {
        return "환자: " + name + ", 나이 : " + age + ", 예약일 : " + appointmentDate;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Reservation<LocalDate> r1 = new Reservation<>("이준섭", 25, LocalDate.of(2025, 5, 22));
        Reservation<LocalDate> r2 = new Reservation<>("홍길동", 24, LocalDate.of(2025, 6, 1));

        System.out.println(r1);
        System.out.println(r2);
    }
}
