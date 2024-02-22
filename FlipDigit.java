public class FlipDigit {
    public static void main(String[] args) {
        int num = 32145;
        int position = 0;
        int sum =0;
        while(num!=0){
        int digit = num % 10;
        position++;
        sum = sum + position * (int)Math.pow(10, digit-1);
        num = num / 10;
        }
        System.out.println(sum);


    }
}
