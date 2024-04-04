public class RopeCutDemo {
    static int ropeCut(int ropeLen , int a, int b, int c){
        // Base Case
        if(ropeLen==0){
            return 0;
        }
        // - ve case
        if(ropeLen<0){
            return -1;
        }
        // Try Option A
        int option1 = ropeCut(ropeLen-a, a, b, c);
        // Try Option B
        int option2 = ropeCut(ropeLen-b, a, b, c);
        // try Option C 
        int option3 = ropeCut(ropeLen-c, a, b, c);
        int result = Math.max(Math.max(option1, option2)
        , option3);
        if(result == -1){
            return -1;
        }
        return result + 1;
    }
    public static void main(String[] args) {
        int ropeLen = 5;
        int a = 2;
        int b = 5;
        int c = 1;
        System.out.println(ropeCut(ropeLen, a, b, c));

    }
}
