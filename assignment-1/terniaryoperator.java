public class terniaryoperator {

    public static void main(String[] args) {
        int number = -5;
        int temp = -number;
        
        int absValue1 = (number < 0) ? -number : number;

        System.out.println("Original number: " + number + ", Absolute value: " + absValue1);
        System.out.println(temp);


    }
}
