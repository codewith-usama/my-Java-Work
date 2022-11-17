/*

1. Modify the "Box" class given in example of this manual and implement the constructors as per
the following requirements:
a) A constructor that receives both height and width as parameter to create new Box object only
if width and height are both positive values
b) A constructor that receives only height as parameter and takes width as input from the user
c) A constructor that receives no parameter and takes both width and height as user input

 */


import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Box box1 = new Box(2, 4);
        Box box2 = box1;
        System.out.println("Box 1: => ");
        box1.print();
        System.out.println("Box 2: => ");
        box2.print();
    }
}

class Box {
    int width, height;
    Scanner scan = new Scanner(System.in);


    Box(int width, int height) {
        if(width > 0 && height > 0) {
            this.width = width;
            this.height = height;
        }
    }

    Box(int height) {
        width = scan.nextInt();
        this.height = height;
    }

    Box () {
        width = scan.nextInt();
        height = scan.nextInt();

    }
    void print() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }
}
