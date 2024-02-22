public class SwapFirstAndLast {
    public static void main(String[] args) {
        int num = 7642;
        // last digit
        int lastDigit = num % 10; // 2
        int count = 0;
        int cpy = num;
        while(cpy!=0){
            cpy=cpy/10;
            count++;
        }
        // first digit extract
        int firstDigit = num /(int) Math.pow(10, count-1);
        System.out.println(firstDigit + " "+lastDigit);
        // middle digit
        num = num / 10; // remove the last digit
        int middleDigit = num % (int)Math.pow(10, count - 2);
        middleDigit = middleDigit * 10; // place at zero to ten place
        int result = lastDigit * (int)Math.pow(10,  count-1) 
        + middleDigit + firstDigit;
        System.out.println(result);

    }
}
