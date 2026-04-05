//Simple Calculator
import java.util.Scanner;
class Calculator{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Simple Calculator");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum: " + (a+b));
        System.out.println("Difference: " + (a-b));
        System.out.println("Product: " + (a*b));
        System.out.println("Quotient: " + (a/b));
        }
}