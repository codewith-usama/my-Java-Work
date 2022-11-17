/*


5. Create a class containing an uninitialized String reference. Demonstrate that this reference is
initialized by Java to null. Create a class with a String field that is initialized at the point of definition,
and another one that is initialized by the constructor.

 */


public class Task_05 {
    public static void main(String[] args) {
        Task_ T1 = new Task_("world");
        T1.Display();

    }
}

class Task_ {
    String var1;
    String var2 = "hello";
    String var3;

    Task_(String var3) {
        this.var3 = var3;
    }

    void Display() {
        System.out.println("Var1: " + var1 + " Var2: " + var2 + " VAr3: " + var3);
    }
    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public String getVar2() {
        return var2;
    }

    public void setVar2(String var2) {
        this.var2 = var2;
    }

    public String getVar3() {
        return var3;
    }
    public void setVar3(String var3) {
        this.var3 = var3;
    }
}
