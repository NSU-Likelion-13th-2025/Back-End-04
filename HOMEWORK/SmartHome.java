package HOMEWORK;

public class SmartHome {

    interface Device{
        void turnOn();
        void turnOff();
    }

    class Light implements Device{
        public void turnOn(){
            System.out.println("조명이 켜졌습니다.");
        }
        public void turnOff(){
            System.out.println("조명이 꺼졌습니다.");
        }
    }

    static class Door implements Device{
        public void turnOn(){
            System.out.println("문이 열렸습니다.");
        }
        public void turnOff(){
            System.out.println("문이 닫혔습니다.");
        }
    }

    public void controlAllDevices(){
        class AirConditioner implements Device{
            public void turnOn(){
                System.out.println("에어컨이 켜졌습니다.");
            }
            public void turnOff(){
                System.out.println("에어컨이 꺼졌습니다.");
            }
        }
        Device ac = new AirConditioner();
        ac.turnOn();
        ac.turnOff();

        Device tv = new Device(){
            public void turnOn(){
                System.out.println("TV가 켜졌습니다.");
            }
            public void turnOff(){
                System.out.println("TV가 꺼졌습니다.");
            }
        };
        tv.turnOn();
        tv.turnOff();
    }
    public static void main(String[] args) {
        SmartHome s = new SmartHome();

        Device light = s.new Light();
        light.turnOff();
        light.turnOff();

        Device door = new Door();
        door.turnOn();
        door.turnOff();

        s.controlAllDevices();

    }
}
