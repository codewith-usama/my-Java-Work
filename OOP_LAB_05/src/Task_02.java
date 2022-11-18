/*

Q2: Create a class called cars. The class has private attributes that include the
name of the car, model year, engine and colour.
- Use set and get methods to set the values of all the private variables.
- Make a static variable number of cars that maintains the count of the cars.
- Create a parameterized constructor that initializes all the attributes.
- Create three cars. Display all the information of the car along with the total
number of cars.


 */


public class Task_02 {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "2020", "Petrol", "Black");
        car1.Display();

        Car car2 = new Car("Auid", "2018", "Petrol", "Grey");
        car2.Display();


        Car car3 = new Car("Mercedes", "2021", "Petrol", "White");
        car3.Display();

        System.out.println("Total Number of Cars: " + Car.numOfCars);
    }
}

class Car {
    private String carName;
    private String modelYear;
    private String engineType;
    private String color;

    static int numOfCars = 0;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
     Car(String carName, String modelYear, String engineType, String color) {
        this.carName = carName;
        this.modelYear = modelYear;
        this.engineType = engineType;
        this.color = color;
        numOfCars++;
     }

     void Display() {
         System.out.println("CarName: " + carName);
         System.out.println("ModelYear: " + modelYear);
         System.out.println("EngineType: " + engineType);
         System.out.println("Color: " + color);
         System.out.println();
     }


}
