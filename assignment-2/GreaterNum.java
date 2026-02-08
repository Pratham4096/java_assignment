import java.util.Scanner;

public class GreaterNum{
    public static void main(String arg[]){

     Scanner sc = new Scanner(System.in);   
     System.out.print("Enter Your Number1 :");
     int num1 = sc.nextInt();

     System.out.print("Enter Your Number2 :");
     int num2 = sc.nextInt();

     if(num1<num2){
        System.out.println(num2 + " is greater than " + num1);
        System.out.println(num1 + " is smaller than " + num2);
        
     }

     else{
        System.out.println(num1 + " is greater than " + num2);
        System.out.println(num2 + " is smaller than " + num1);
     }
    
    

    }
}