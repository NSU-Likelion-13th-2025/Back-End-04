package Homework7;

import javax.xml.namespace.QName;

class Reservation <T,K,V> {

    private T name;
    private V age;
    private K appointmentDate;


    public Reservation(T name, V age,K appointmentDate) {
        this.name = name;
        this.age = age;
        this.appointmentDate = appointmentDate;
    }

    public String getName() {
        return (String) name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public int getAge() {
        return (int) age;
    }

    public void setAge(V age) {
        this.age = age;
    }

    public String getAppointmentDate() {
        return (String) appointmentDate;
    }
    public void setAppointmentDate(K appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    @Override
    public String toString() {
        return "환자 : " + name + ", 나이 : " + age + ", 예약 날짜 : " + appointmentDate ;
    }
}

public class main {
    public static void main(String[] args) {
        Reservation<String, String, Integer> book = new Reservation<> ("아무개",15,"2025-05-15");
        System.out.println(book);

        Reservation<String, String ,Integer> book1 = new Reservation<>("김이나", 23, "2025-05-25");
        System.out.println(book1);
    }
}

