package object.oriented.programming;

abstract class Abstract {
    abstract void show();
}

class SubClass {
    void show() {
        System.out.println("In Sub Class");
    }

}

public class FinalAbstractKeyword {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.show();

    }
}
