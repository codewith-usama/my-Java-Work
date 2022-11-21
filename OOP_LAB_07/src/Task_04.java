public class Task_04 {
    public static void main(String[] args) {

    }
}

class Accounts {
    protected double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void debit(double amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw Sucessfull!! Current Balance " + balance);
        }
        else
            System.out.println("Error!! Enter valid Amount");
    }

    void credit(int amount){
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposit Sucessffull! Current Balance " + balance);
        }
        else {
            System.out.println("Error!! Enter Valid Amount");
        }
    }


}

class SavingAccount extends Accounts {
    protected int timeSpan;


}

class CheckingAccount extends Accounts {

}