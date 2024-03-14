public class PrintNameNTimes {

    static void show(int num){
        // Recursion Stop 
        // Termination Case / Base Case
        if(num ==0){
            return ; // exit from the current call
        }

        System.out.println("Amit "+num); // Logic
        
        // Small Problem
        show(num - 1);  // Recursion
        System.out.println("Srivastava "+num);
    }
    public static void main(String[] args) {
        show(5);
    }
}
