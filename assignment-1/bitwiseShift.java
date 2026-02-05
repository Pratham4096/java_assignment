public class bitwiseShift {
    public static void main(String[] args) {
        int original = 10; 

        
        int leftShifted = original << 1;
        System.out.println("Left Shifted: " + leftShifted); 

        
        int rightShifted = original >> 1;
        System.out.println("Right Shifted: " + rightShifted);
    }
}
