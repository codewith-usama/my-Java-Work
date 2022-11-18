/*

Q4: Create an ArrayList of String data type. The list will store different
programming languages.
- Add five programming languages using the add method.
- Display the arraylist.
- Change the arraylist element at the second index.
- Remove the element at the last index and then display the list again.

 */


import java.util.*;
import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {

    Language l1 = new Language();
    l1.Display();
    l1.Change(3);
    l1.RemveList();



    }
}

class Language {
    ArrayList<String> list = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    String name;
    Language() {
        name = null;
        System.out.println("Enter five programming Languages below: ");
        for(int i = 0; i < 5; i++) {
            System.out.print(i+1 + ": ");
            name = scan.nextLine();
            list.add(name);
        }
    }
    void Change(int x) {
        System.out.println("Changing ELement at index: " + x);
        list.set(x, "C++");
        System.out.println("List Updated");
        Display();
    }
    void Display() {
        System.out.println("List contains below Programming Languages: ");
        for(String item: list) {
            System.out.println(item);
        }
        System.out.println();
    }

    void RemveList() {
        list.clear();
        System.out.println("List cleared");
        Display();
    }
}
