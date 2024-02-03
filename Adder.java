public class Adder {
    public static void main(String[] args) {
        int sum = 0;
        //for(int i = 0 ; i<args.length; i++){
        //     sum = sum + Integer.parseInt(args[i]);
        // }
        // Enhance for loop (Java 1.5)
        for(String a : args){
            sum = sum + Integer.parseInt(a);
        }
        System.out.println(sum);
    }
}
/* java Adder 10 20 30 40 50
 * copy con abcd.txt
 * copy abc.txt xyz.txt
 * md abcd
 * cd abcd
 */
