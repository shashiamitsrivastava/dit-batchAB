public class Rotate {
   public static void main(String[] args) {
        int num = 12345;
        int rotations = 8;
        int count = 0;
        int cpy = num;
        while(cpy!=0){
            cpy = cpy / 10; // make number small
            count++;
            }
        rotations = rotations % count;
        int rhs = num % (int)Math.pow(10, rotations);
        int lhs = num / (int)Math.pow(10, rotations);
      
        
       int result =  rhs * (int)Math.pow(10, count- rotations) + lhs;
       System.out.println(result);
        // System.out.println(rhs);
        // System.out.println(lhs);
       // String result = rhs +""+lhs;
       // System.out.println(Integer.parseInt(result));
        //System.out.println(rhs + ""+lhs);
   } 
}
