public class Loops {
    public static void main(String[] args) {
        // while, for , do while , enhance for loop
        int num = 20;
        int count = 0;
        for(int i = 2; i<num; i++){
            if(num % i ==0){
               System.out.println("Not a Prime Number");
               return ; 
            }
        }
        System.out.println("Prime Number");
        //System.out.println(count==2?"Prime Number":"not a Prime Number");
    }
}
