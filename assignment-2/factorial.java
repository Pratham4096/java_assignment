import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number1 : "); // Added quotation marks
        int n = sc.nextInt();
        int factorial = 1;

        for (int i =1 ; i<n+1 ;i++){
               factorial = factorial * i;

        }
        
        System.out.print("Factorial of " + n + " is : "+ factorial); // Added quotation marks
        
    }
}
