public class EvenOddPosSum {
    public static void main(String[] args) {
        int num = 8765;
        int position = 0;
        int evenPosSum= 0;
        int oddPosSum=0;
        while(num!=0){
        int digit = num % 10;
        position++;
        if(position%2==0){
            evenPosSum = evenPosSum + digit;
        }
        else{
            oddPosSum = oddPosSum + digit;
        }
        num = num / 10;
    }
    System.out.println(evenPosSum + " "+oddPosSum);

    }
}
