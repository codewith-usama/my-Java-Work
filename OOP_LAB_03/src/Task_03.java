import org.omg.PortableServer.POAPackage.ObjectAlreadyActive;
import javax.naming.directory.BasicAttribute;
import java.util.Scanner;

/*

TASK – 03:
Create a class called Account that includes three pieces of information as instance variables
 Account title (type String)
 Balance (Int/Float)
 Account number (Int)
Ask the user to input the initial balance. If the initial balance is less than 0, display an error message.
Write a test application named Account that demonstrates the class capabilities. Create two functions
withdraw and deposit.
If the balance is 0, then user will not be able to withdraw any amount from the account. Display the
updated balance after the user withdraws or deposits money.



 */



public class Task_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));

        System.out.print("Enter Account Title: ");
        String title = scan.nextLine();
        System.out.print("Enter Accnount Number: ");
        int num = scan.nextInt();
        float balance;
        while (true) {
            System.out.print("Enter Balance: ");
            balance = scan.nextFloat();
            if(balance > 0)
                break;
            System.out.println("Invalid Amount");
        }


        Account a1 = new Account(title, balance, num);
        a1.Display();
        a1.Deposit(2000);
        a1.WithDraw(1000);
    }
}

class Account {
    protected String AccountTitle;
    protected  float Balance;
    protected int AccountNumber;

    public String getAccountTitle() {
        return AccountTitle;
    }

    public void setAccountTitle(String accountTitle) {
        AccountTitle = accountTitle;
    }

    public float getBalance() {
        return Balance;
    }

    public void setBalance(float balance) {
        Balance = balance;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    void WithDraw(int amount) {
        if(amount > Balance) {
            System.out.println("Withdraw unsuccessful, insufficient balance");
        }
        else {
            Balance -= amount;
            System.out.println("Withdraw successfully completed");
            System.out.println("Current balance: " + Balance);
        }
    }
    Account(String AccountTitle, float Balance, int AccountNumber) {
        this.AccountTitle = AccountTitle;
        this.Balance = Balance;
        this.AccountNumber = AccountNumber;
    }

    void Deposit(int amount) {
        if(amount < 0) {
            System.out.println("Invalid amount");
            return;
        }
        else {
            Balance += amount;
            System.out.println("Deposit successfully");
            System.out.println("New balance: " + Balance);
        }
    }
    void Display() {
        System.out.println("Account Title: " + AccountTitle + " Balance: " + Balance +
                " Account Number: " + AccountNumber);
    }
}
