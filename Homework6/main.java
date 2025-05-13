package Homework6;

class HomeController {
    static interface Device {
        void turnOn();
        void turnOff();
    } //이너 인터페이스 Device

    class Light implements Device {
        public void turnOn() {
            System.out.println("조명이 켜졌습니다.");
        }
        public void turnOff() {
            System.out.println("조명이 꺼졌습니다.");
        }
    } //인스턴스 멤버 이너 클래스 Light Device

    static class Door implements Device {
        public void turnOn() {
            System.out.println("문이 열렸습니다.");
        }

        public void turnOff() {
            System.out.println("문이 닫혔습니다.");
        }
    } //정적 멤버 이너 클래스 Door Device

    void ControlAllDevices(){
        class AirConditioner implements Device {
            @Override
            public void turnOn(){
                System.out.println("에어컨이 켜졌습니다.");
            }
            @Override
            public void turnOff(){
                System.out.println("에어컨이 꺼졌습니다.");
            }
        }
        AirConditioner a = new AirConditioner();
        a.turnOn();
        a.turnOff();
    } //지역 클래스 AirConditioner ControllDevices() 메서드 안에서 선언

}

public class main {
    public static void main(String[] args) {
        HomeController.Device TV = new HomeController.Device() {
            public void turnOn() {
                System.out.println("TV가 켜졌습니다.");
            }
            public void turnOff() {
                System.out.println("TV가 꺼졌습니다");
            }
        }; //익명 이너 클래스

        HomeController.Light Light = new HomeController().new Light();
        HomeController.Door Door = new HomeController.Door();

        Light.turnOn();
        Light.turnOff();

        Door.turnOn();
        Door.turnOff();

        new HomeController().ControlAllDevices();

        TV.turnOn();
        TV.turnOff();
    }
}
