import java.util.Scanner;

public class TriangleArea{

public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.println("Welcome to Area Calculate\n");
System.out.println("Please enter your base in cms:");

double base = input.nextDouble();
System.out.println("Now,enter your perpendicular height in cms:");
double height = input.nextDouble();
double area = (base * height);
System.out.println("The area of your triangle is:= " + area + "cms");
System.out.println("Thank you:");
}
}