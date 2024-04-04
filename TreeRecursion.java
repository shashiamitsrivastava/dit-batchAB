public class TreeRecursion {
    // Multiple Branch 
    static void fun(int n){
        // Base Case
        if(n<=0){
            return ;
        }
        // Stack Build 
        System.out.println("Pre Call "+n);
        fun(n-1); // One Branch
        // Stack Fall for n-1
        System.out.println("B/w Call "+n);
        // fall of first branch then second branch start
        fun(n-2); // second branch
        System.out.println("Post Call "+n);
    }public static void main(String[] args) {
        fun(4);
    }
}
