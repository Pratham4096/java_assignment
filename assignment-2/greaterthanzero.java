import java.util.Scanner;

public class greaterthanzero{
    public static void main(String arg[]){

    while (true) { 

     Scanner sc = new Scanner(System.in);   
     System.out.print("Enter Your Neumber1 :");
     int num1 = sc.nextInt();
     int num2 = 2;

     if(num1<0){
        System.out.println("Unsuitable number");
     }

     else if(num1==0){
        break;
     }
    
      else{
        System.out.println(Math.pow(num1, num2));
        break;
      }
        
    }

     
    

    }
}