// program to simulate a simple ATM machine.
import java.util.Scanner;
class ATMProjuct {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int pin = 2004;
int balance = 100000;
System.out.println("Enter your ATM pin:");
int enteredpin = sc.nextInt();
// cheack pin
if(enteredpin == pin)
{
System.out.println("Pin Accepted:");
System.out.println("Your current balance:₹" + balance);
System.out.println("Enter amount to withdraw:");
int amount = sc.nextInt();
// cheack withdraw condition
if(amount<= balance)
{
balance -= amount;
System.out.println("Withdraw successefuly!");
System.out.println("remaning balance:₹" + balance);
}
else
{
System.out.println("Insufficient Balance:");
}
}
else
{
System.out.println("Invalid PIN!");
}
sc.close();
}
}
