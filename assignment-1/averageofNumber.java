

public class averageofNumber {
  public static void main(String[] args) {

    int[] numbers={
        12,5,6,7,49
    };

    double count=0;
    int i;
    for (i = 0 ; i< numbers.length ; i++){
         count = count + numbers[i];


    }

    double average = count / numbers.length ; 

    System.err.println(average); 
  }
}