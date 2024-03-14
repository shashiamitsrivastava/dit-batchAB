public class PrintDigit {
    static void printDigit(int num){
        // Base Case
        if(num ==0){
            return ;
        }
        // Small Problem
        printDigit(num/10);
        System.out.println(num%10);
    }
    public static void main(String[] args) {
        printDigit(12345);
    }
}
