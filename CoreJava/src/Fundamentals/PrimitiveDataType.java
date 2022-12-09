package Fundamentals;
import java.util.Scanner;

public class PrimitiveDataType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a byte value: ");
        byte a = scan.nextByte(); // stores 1 byte of data
        System.out.print("Enter a short type value: ");
        short b = scan.nextShort(); // stores 2 byte of data
        System.out.print("Enter a integer value: ");
        int c = scan.nextInt(); // stores 4 byte of data
        System.out.print("Enter a Long type value: ");
        long d = scan.nextLong(); // stores 8 byte of data
        System.out.print("Enter a float type value: ");
        float e = scan.nextFloat(); // stores 4 byte of data
        System.out.print("Enter a double value: ");
        double f = scan.nextDouble(); // stores 8 byte of data
        System.out.print("Enter a char: ");
        char g = scan.next().charAt(0); // stores 2 byte of data
        System.out.print("Enter a Boolean value: ");
        boolean h = scan.nextBoolean(); // stores 1 bit of data
        scan.close();

        System.out.println("byte " + a);
        System.out.println("short " + b);
        System.out.println("integer " + c);
        System.out.println("long " + d);
        System.out.println("float " + e);
        System.out.println("double " + f);
        System.out.println("char " + g);
        System.out.println("boolean " + h);
    }
}
