// Remainder of two numbers
import java.util.Scanner;
class RemOfNum{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        int remainder = a % b;
        System.out.println("The remainder of " + a + " divided by " + b + " is: " + remainder);
        sc.close();
    }
}
