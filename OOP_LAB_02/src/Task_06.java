/*
TASK – 06:
Create a menu driven transactions’ processing unit in a bank as long as user enters correct
input. Initially, take the username and password as input from user. If that username and
password is correct then the user will log in to the system and can perform any transaction as
per the menu shown below.
Main Menu ** Welcome to Bank of Pakistan**
1. Deposit Money
2. Withdraw Amount
3. Account status
Select your choice: ____
(After completing the selected transaction) Do you want to continue? [y/Y]
(goes to Main Menu, if y/Y is pressed).
Depending upon the user’s choice, perform the transaction and display the remaining account
balance along with the owner’s username.


 */



import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Task_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = "ooplab02";
        String password = "abc123";
        int balance = 20000;
        while (true) {
            System.out.print("Enter username: ");
            String user = scan.nextLine();
            System.out.print("Enter password: ");
            String pass = scan.nextLine();
            if(username.equals(user) && password.equals(pass)) {
//                System.out.println("Login");
                System.out.println("Main Menu ** Welcome to Bank of Pakistan**");
                System.out.println("1. Deposit Money\n2. Withdraw Amount\n" +
                        "3. Account status");
                System.out.print("Enter you choice: ");
                int choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter Amount: ");
                        double amount = scan.nextDouble();
                        balance += amount;
                        System.out.println("New Balance is:  " + balance);
                        break;
                    case 2:
                        System.out.print("Enter Amount: ");
                        double amount1 = scan.nextDouble();
                        if(amount1 <= balance) {
                            balance -= amount1;
                            System.out.println("Withdraw Sucessfully\n" +
                                    "new Balance: " + balance);
                        }
                        else
                            System.out.println("Insufficient Balance");
                        break;
                    case 3:
                        System.out.println("Access Granted");
                        break;
                }
                System.out.print("Do you want to continue: [y/Y]");
                String check = scan.next();
                if(check.equalsIgnoreCase("y"))
                    continue;
                else
                    break;
            }
        }
    }
}
