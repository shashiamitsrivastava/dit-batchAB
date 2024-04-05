public class SubSequence {

    static void getSubSeq(String str, String result){
        // Base Case
        if(str.length()==0){
            System.out.print(result+" ");
            return ;
        }
        // Not Take It
        getSubSeq(str.substring(1), result);
        // Take It
        getSubSeq(str.substring(1), 
        result + str.charAt(0));
    }
    public static void main(String[] args) {
        getSubSeq("abc", "");
    }
}
