import java.util.Scanner;
public class sawppingNumber {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int a = 10;
int b = 20;
System.out.println("\n Befor swapping:");
System.out.println(" a: = " + a);
System.out.println(" b: = " + b);
System.out.println(" After swapping:");
int c = a;
b = b - a;
a = b + a;
c = b;
System.out.println(" a: = " + a);
System.out.println(" b: = " + b);
}
}

