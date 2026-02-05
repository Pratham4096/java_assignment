import java.io.IOException;

class SuperClass {
    void executeTask() throws IOException {
        System.out.println("SuperClass executing task...");
        throw new IOException("IO Error occurred in SuperClass");
    }
}

class SubClass extends SuperClass {
    void executeTask() throws ArithmeticException {
        System.out.println("SubClass executing task...");
        throw new ArithmeticException("Arithmetic Error occurred in SubClass");
    }
}

class dayMonth {
    public static void main(String[] args) {
        SuperClass obj = new SubClass();
        
        try {
            obj.executeTask();
        } catch (IOException e) {
            System.out.println("Caught Checked Exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught Unchecked Exception: " + e.getMessage());
        }
    }
}