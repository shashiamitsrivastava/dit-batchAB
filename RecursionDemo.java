public class RecursionDemo {
    /*
     * Name Print 5 Times - Big Problem
     * Think about Small Problem
     */
    static void show(int num){
        // Termination Case 
        if(num == 0){
            return ;
        }
        System.out.println("Amit "+num); // Processing Logic
        // small problem (n-1) + Recursion (Cycle)
        show(num-1); // Function call It Self (Cycle)
        System.out.println("Amit "+num);
    }
    public static void main(String[] args) {
        show(5);
    }
}
