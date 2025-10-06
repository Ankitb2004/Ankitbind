import java.util.Scanner;
public class Discount {
public static void main (String [] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the price of a product:");
int price = sc.nextInt();
if(price>1000)
{
int discount = (price * 10) / 100; // 10% discount
int finalPrice = price - discount;
System.out.println("You are given 10% discount:");
System.out.println("Discount amount: " + discount);
System.out.println("Final price after discount: " + finalPrice);
}
else
{
System.out.println("No discount available:");
System.out.println("Final price: " + price);
}
sc.close();
}
}
