/*
TASK – 01:
Write a class named Car that has the following data members:
 yearModel – an int field that hold the car’s year model.
 make – a String field that holds the make of the car.
 speed – an int field that holds the car’s current speed.
The class also should have the following constructor and other methods:
 constructor – that accepts the car’s year model and make as arguments. These values
should be assigned to the object’s yearModel and make fields. The constructor also
should assign 0 to the speed field.
 Accessors. Appropriate accessor methods should get the values stored in an object’s
yearModel, make and speed fields.
 accelerate. The accelerate method should add 5 to the speed field each time it is called.
 brake. The brake method should subtract 5 from the speed field each time it is called.
Demonstrate the class in a program that creates a Car object, and then calls the accelerate
method five times. After each call to the accelerate method, get the current speed of the car and
display it. Then call the brake method five times. After each call to the brake method, get the
current speed of the car and display it


 */



public class Task_01 {

    public static void main(String[] args) {
        Car car = new Car(2020, "Mercedes");
        System.out.println("YearMode:" + car.getYearModel() + ", Make: "
        + car.getMake() + ", Current Speed: " + car.getSpeed());
        System.out.println();

        System.out.println("Accelersting...");
        for(int i = 0; i < 5; i++) {
            System.out.println("Current speed: " + car.getSpeed());
            car.Accelerate();
        }
        System.out.println();
        System.out.println("Decelerating...");
        for(int i = 0; i < 5; i++) {
            System.out.println("Current speed: " + car.getSpeed());
            car.Brake();
        }
    }
}

class Car {
    protected int yearModel;
    protected String make;
    protected int speed;

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }



    Car(int yearModel, String make) {
        this.yearModel = yearModel;
        this.make = make;
        speed = 0;
    }
    void Accelerate() {
        speed += 5;
    }
    void Brake() {
        speed -= 5;
    }
}