// Calculator class
class Calculator {
// Addition for Method

public int add(int a,int b) {
    return a + b;
}
// Subtrsction for Method

public int sub(int a,int b) {
    return a - b;
}
// Multiplication for Method

public int mult(int a,int b) {
   return a * b;
}
// Devision for Method

public int div(int a,int b) {
   if(b == 0)
{
System.out.println("cannot divided by zero:");
}
   return a / b;
}
}
// Main class

public class Main
{
public static void main(String[] args) {
Calculator calc = new Calculator();
int a;
int b;
System.out.println("Enter the two number:");
System.out.println("The number of Addition: " + calc.add(a, b));
System.out.println("The number of Subtraction: " + calc.sub(a, b));
System.out.println("The number of Multiplication: " + calc.mul(a, b));
System.out.println("The number of Division: " + calc.div(a, b));
}
}

 