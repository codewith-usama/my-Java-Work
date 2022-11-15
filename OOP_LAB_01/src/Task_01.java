/*

QUESTION#1
        Write a program that calculates how long it takes to drive from Karachi to Lahore
        at 75 mile per hour (Use 3000 miles as the approximate distance between two
        cities).


 */


public class Task_01 {
    public static void main(String[] args) {
        int speed = 75; // 75 km/h
        int distance = 3000; // distance between 2 cities
        float time = distance/speed;
        System.out.println("Time required is: " + time);

    }
}
