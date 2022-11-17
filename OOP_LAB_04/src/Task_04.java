/*

. Create a class called Tank that can be filled and emptied, and has a termination condition that it
must be empty when the object is cleaned up. Write a finalize( ) that verifies this termination
condition.
Hint: You can create an int variable capacity that represents the water level of Tank.


 */



public class Task_04 {
    public static void main(String[] args) {
        Tank T1 = new Tank();
        System.out.println("Before Filling: ");
        if(!T1.isEmpty())
            System.out.println("Tank is Empty");
        T1.setCapacity(23);
        if(T1.isEmpty())
            System.out.println("Tank is Full");
        else
            System.out.println("Tank is Empty");
        System.out.println(T1.getCapacity());

    }
}

class Tank  {
    protected int capacity;

    Tank () {
        capacity = 0;
    }

    public boolean isEmpty() {
        if(capacity == 0)
            return false;
        return true;
    }
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    protected void finalize() {
        capacity = 0;
    }
}