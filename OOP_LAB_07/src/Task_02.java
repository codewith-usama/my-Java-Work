/*

Task 2:
Write a Java program that has a class named as Vehicle.
▪ The class Vehicle has a default constructor that displays “It’s a vehicle”.
▪ It has the attributes VehicleName, VehicleNo and wheels.
▪ Create an accelerate method that will take speed as argument and displays the speed
of the vehicle as _________ km/hr.
Derive a class FourWheeler.
▪ Create a parameterized constructor that will initialize VehicleName, VehicleNo,
wheels and PowerSteering.
▪ The class has a Boolean attribute power steering. If its trye then then vehicle has a
power steering otherwise not.
▪ Create a display method to show the details of the vehicle and if PowerSteering is true,
then print your car has a power steering otherwise print an appropriate message.
Moreover, it also displays the spped at which the vehicle is operating.
In the main, create a fourwheeler object and call the display functions to display the details

 */
public class Task_02 {
    public static void main(String[] args) {
        FourWheeler f1 = new FourWheeler(90, "Audi", "abc-123", 4, true);
        f1.display();
    }
}

class Vehicle {
    protected String vehicleName;
    protected String vehicleNo;
    protected int wheels;

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    Vehicle(String vehicleName, String vehicleNo, int wheels) {
        System.out.println("It's a vehicle");
        this.vehicleNo = vehicleNo;
        this.vehicleName = vehicleName;
        this.wheels = wheels;
    }

    void accelerate(int speed) {
        System.out.println("Speed of Vehivle is " + speed + "km/hr");
    }
}

class FourWheeler extends Vehicle{
    private Boolean powerSteering;
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Boolean getPowerSteering() {
        return powerSteering;
    }

    public void setPowerSteering(Boolean powerSteering) {
        this.powerSteering = powerSteering;
    }

    FourWheeler(int speed, String vehicleName, String vehicleNo, int wheels, Boolean powerSteering) {
        super(vehicleName, vehicleNo, wheels);
        this.powerSteering = powerSteering;
        this.speed = speed;
    }

    void display() {
        super.accelerate(speed);
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Vehicle No: " + vehicleNo);
        System.out.println("Wheels: " + wheels);
        if(powerSteering)
            System.out.println("Vehicle has Power Steering");
        else
            System.out.println("Sorry!! This Vehcle doesn't provide Power Steering Function");
    }
}
