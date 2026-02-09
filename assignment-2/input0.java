import java.util.Scanner;

public class input0{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int count = 0;


       while (true) { 
   
     System.out.print("Enter Your Neumber1 :");
     int num = sc.nextInt();

     if(num ==0){
       
        System.out.println("Number of Input before Zero are " + count);
        break;
     }

     else{
       
        count++;
      }
        
    }

    }}
