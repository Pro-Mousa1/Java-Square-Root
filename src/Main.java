import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();

        int square = num*num;
        System.out.println("The square of "+num+" is: " +square);
        System.out.println();
        double squareroot=Math.sqrt(num);
        System.out.print("The square root of "+num+" is: " +squareroot+"\n");

        Scanner number = new Scanner(System.in);
        System.out.println("Enter the number");
        int even = number.nextInt();
        int count = 0;

        for (int i = 2; i <even; i++) {
            if (i%2==0) {
                count++;
            }
        }
        System.out.println("The even numbers are: " +count);
    }
}