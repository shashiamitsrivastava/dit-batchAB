public class StringSearchAndReplace {
    static String searchAndReplace(String str, char search,
     char replace){
        // Base Case
        if(str.length()==0){
            return "";
        }
        // Make String small
        String result = searchAndReplace(str.substring(1), search, replace);
        char firstChar = str.charAt(0);
        if(firstChar == search){
            return replace + result;
        }
        else{
            return firstChar + result;
        }
    }
    public static void main(String[] args) {
        String result = searchAndReplace("hello",
         'l', 'x');
        System.out.println(result);
    }
}
