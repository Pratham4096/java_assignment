import java.util.Scanner;

public class negativeinput{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int count = 0;


    while (true) { 
   
     System.out.print("Enter Your Neumber1 :");
     int num = sc.nextInt();

     if(num ==0){
       
        
        break;
     }

     else if(num<0){
       
        count++;
      }
        
    }

    System.out.println("Number of Negative Input before Zero are " + count);

    }}
