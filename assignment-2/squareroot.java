import java.util.Scanner;

public class squareroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Your Number2 : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.print("Square Root of " + sum + " is : ");
        System.out.println(Math.sqrt(sum));
    }
}
