public class SumOfDigit {

    static int show(int num){
        if(num==0){
            return 0;
        }
        int sum = show(num/10);
        return sum + num % 10;
    }

    // 123 = 1 + 2 + 3 = 6
    static void show(int num , int sum){
        // Termination Case
        if(num ==0){
            System.out.println(sum);
            return ;
        }
        show(num/10, sum + num % 10);
    }
    public static void main(String[] args) {
        //show(123, 0);
        int r = show(123);
        System.out.println(r);
    }
}
