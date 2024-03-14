public class EvenOddSum {
    static int[] countEvenOdd(int n){
        // [0] = Even Count
        // [1] = Odd Count
        // Base Case
        if(n==0){
            int arr [] = new int[2]; // fill 0
            // arr[0] = 0 and arr[1] = 0
            return arr;
        }
        // Small Problem + Recursion
        int arr[] = countEvenOdd(n-1);
        if(n%2==0){
            arr[0] = arr[0] + 1; // Even Count
        }
        else{
            arr[1] = arr[1]+ 1; // Odd Count
        }
        return arr;

    }
    static void countEvenOdd(int n, int even, int odd){
        // Base Case
        if(n==0){
            System.out.println("Even "+even +" Odd "+odd);
            return ;
        }
        // Small Problem
        // 10(n) -->9 (n-1)
        if(n%2==0){
            even++;
        }
        else{
            odd++;
        }
        countEvenOdd(n-1, even, odd); 
    }
    public static void main(String[] args) {
        //countEvenOdd(10, 0, 0);
        int arr[] = countEvenOdd(10);
        System.out.println("Even "+arr[0]);
        System.out.println("Odd "+arr[1]);
    }
}
