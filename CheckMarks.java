import java.util.Scanner;
public class CheckMarks {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Welcome to check student marks:");
System.out.println("Please Enter your marks are:");
int marks = sc.nextInt();       

if(marks>=75)
{
System.out.println("You are pass:");
}
if(marks<75)
{
System.out.println("You are fail:");
}
}
}