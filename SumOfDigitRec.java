public class SumOfDigitRec {
    
    static int sumOfDigit(int num){
        //int sum = 0; // One time
        // Base Case
        if(num ==0){
            return 0; // 0 is a initial value of sum
        }

        int sum = sumOfDigit(num/10);
        sum = sum + num % 10;
        return sum;
         //sum = sum + digit; // N time
        // Sum Compute Digits (N Times)

    }
    static void sumOfDigit(int num, int result){
       // int result = 0;
        // Base Case
        // One time
        if(num == 0){
            System.out.println("Sum "+result);
            return ;
        }
        // N Times
        // LOGIC 
        int digit = num % 10;
        result = result + digit;
        // Small Problem
        sumOfDigit(num/10, result);
    }
    public static void main(String[] args) {
        sumOfDigit(123, 0);
    }
}
