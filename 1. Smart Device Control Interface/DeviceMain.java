// Interface
interface SmartDevice {
    void turnOn();
    void turnOff();
}

// Light Class
class Light implements SmartDevice {

    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }
}

// AC Class
class AC implements SmartDevice {

    public void turnOn() {
        System.out.println("AC is ON");
    }

    public void turnOff() {
        System.out.println("AC is OFF");
    }
}

// TV Class
class TV implements SmartDevice {

    public void turnOn() {
        System.out.println("TV is ON");
    }

    public void turnOff() {
        System.out.println("TV is OFF");
    }
}

// Main Class
public class DeviceMain {

    public static void main(String[] args) {

        // Polymorphism
        SmartDevice d1 = new Light();
        SmartDevice d2 = new AC();
        SmartDevice d3 = new TV();

        SmartDevice[] devices = {d1, d2, d3};

        for (SmartDevice d : devices) {
            d.turnOn();
            d.turnOff();
            System.out.println("----------------");
        }
    }
}