import java.util.ArrayList;
import java.util.Scanner;

public class inputzero {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers to add (enter 0 to calculate the sum and restart):");

        while (true) {
            
            int num = sc.nextInt();

            if (num != 0) {
   
                
                numbers.add(num);
            } else {
                
                int count = 0;
                for (int value : numbers) {
                    count += value;
                }

                
                System.out.println("The sum is: " + count);

                
                numbers.clear();
                System.out.println("\nEnter new numbers (enter 0 to calculate the sum):");
            }
        }
    }
}
