public class typeInference {
    public static void main(String[] args) {
        var x = 12; 
        var y = "Pratham"; 
        var z = true; 
        
        
        System.out.println(((Object) x).getClass().getSimpleName()); 
        System.out.println(y.getClass().getSimpleName()); 
        System.out.println(((Object) z).getClass().getSimpleName()); 
    }
}
