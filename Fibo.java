public class Fibo {

    static int fibo(int n){
        // Base Case
        if(n<=1){
            return n;
        }
        // first term
        int firstTerm = fibo(n-1);
        
        // second term
        int secondTerm = fibo(n-2);
        return firstTerm + secondTerm;
    }
    public static void main(String[] args) {
        System.out.println(fibo(8));
    }
}
