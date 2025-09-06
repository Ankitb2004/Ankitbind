import java.util.Scanner;
public class StudentGradeCalculator {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Welcome to student grade calculator:");
System.out.println("Enter the your marks:");
int marks = sc.nextInt();
if(marks>=75)
{
System.out.println("You have got Grade A:");
}
if(marks>=60&&marks<75)
{
System.out.println("You have got Grade B:");
}
if(marks>=40&&marks<60)
{
System.out.println("You have got Grade C:");
}
if(marks<40)
{
System.out.println("You have Fail: ");
}
sc.close();
}
}
