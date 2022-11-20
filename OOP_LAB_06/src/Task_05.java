public class Task_05 {
    public static void main(String[] args) {
        Car car1 = new Car("abc-879", 200, "Black", 4, 4);
        car1.Display();
    }
}

class Vehicle {
    private int speed;
    private String color;
    private int wheels;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    Vehicle() { }
    Vehicle(int speed, String color, int wheels) {
        this.speed= speed;
        this.color = color;
        this.wheels = wheels;
    }

    void Display() {
        System.out.println("Speed of Vehicle: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Number of Wheels: " + wheels);
    }
}

class MotorVehicle extends Vehicle {
    private String licenseplate;

    public String getLicenseplate() {
        return licenseplate;
    }

    public void setLicenseplate(String licenseplate) {
        this.licenseplate = licenseplate;
    }
    MotorVehicle () { }

    MotorVehicle(String licenseplate, int speed, String color,int wheels) {
        super(speed, color, wheels);
        this.licenseplate = licenseplate;
    }

    @Override
    void Display() {
        super.Display();
        System.out.println("License Plate: " + licenseplate);
    }
}

class Car extends MotorVehicle {
    private int noOfDoors;

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    Car() { }
    Car(String licenseplate, int speed, String color, int wheels, int noOfDoors) {
        super(licenseplate, speed, color, wheels);
        this.noOfDoors = noOfDoors;
    }
    @Override
    void Display() {
        super.Display();
        System.out.println("Number Of Doors: " + noOfDoors);
    }
}
