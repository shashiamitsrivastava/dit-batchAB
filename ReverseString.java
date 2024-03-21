public class ReverseString {
    /*
     * String - Immutable
     * Reverse String must be a new String.
     */
    static String reverse(String str){
        // Base Case
        if(str.length()==0){
            // we need to create a new string
            return "";
        }
        // 1. Make String small till empty
        String smallString = str.substring(1);
        String result = reverse(smallString);
        char firstChar = str.charAt(0);
        return result  + firstChar;

    }
    public static void main(String[] args) {
        System.out.println(reverse("amit"));

    }
}
