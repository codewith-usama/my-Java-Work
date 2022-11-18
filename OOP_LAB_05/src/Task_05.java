/*

Q5: Create an array list of marks that stores marks for 5 students. Display the
whole class’s result. Now, Check if any student has got < 50 marks then omit
his/her result and calculate the average of class

 */

import java.util.ArrayList;
import java.util.Scanner;
public class Task_05 {
    public static void main(String[] args) {
        Marks m1 = new Marks();
        m1.Display();
        m1.CheckReult();
        m1.Average();
    }
}

class Marks {
    ArrayList<Integer> list = new ArrayList<Integer>(5);
    Scanner scan = new Scanner(System.in);

    Marks() {
        System.out.println("Enter Student Marks: ");
        int marks = 0;
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter Student " + (i+1) + " marks: ");
            marks = scan.nextInt();
            this.list.add(marks);
        }
    }
    void Display() {
        System.out.println("Marks of Student: ");
        for(int marks: this.list) {
            System.out.println(marks);
        }
        System.out.println();
    }
    void CheckReult() {
        for(int i = 0; i < this.list.size(); i++) {
            if(this.list.get(i) < 50)
                this.list.remove(i);
        }
        System.out.println("Updated marks: ");
        Display();
    }

    void Average() {
        int sum = 0;
        for(int marks: this.list)
            sum += marks;

        System.out.println("AVG of class is: " + sum);
        System.out.println();
    }
}
