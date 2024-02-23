public class NestedLoops {
   public static void main(String[] args) {
        outer:
        for(int i = 1 ; i<=3; i++){
            for(int j = 1; j<=3; j++){
                if(i==j){
                    break outer;
                    //continue outer;
                    //return ; // exit from the current function
                   //continue; // skip the current iteration
                    // break; // exit from the current loop
                }
                System.out.println(i+" "+j);
            }
        }
   } 
}
