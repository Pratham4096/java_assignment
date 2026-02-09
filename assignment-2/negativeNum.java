import java.util.Scanner;

public class negativeNum{
    public static void main(String arg[]){

     Scanner sc = new Scanner(System.in);   
     System.out.print("Enter Your Number :");
     int num = sc.nextInt();

     if(num<0){
        System.out.println("Your Number is " + -num);
     }

     else{
        System.out.println("Your Number is " + num);
     }
    
    

    }
}