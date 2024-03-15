public class PrintTable {
    // fill the result in a string
    static String printTable2(int num, int value){
        if(value ==0){
            return "";
        }
        String result = printTable2(num, value-1);
        String exp = num + "*"+value+"="+(num*value)+"\n";
        return result + exp;
    }
    static void printTable(int num, int value){
        // Base Case
        // if(value>10){
            if(value ==0){
            return ;
        }
        // System.out.println(num+"*"+value
        // +"="+(num*value));
        // Small Problem
       // printTable(num, value+1);
       printTable(num, value-1);
       System.out.println(num+"*"+value
       +"="+(num*value));

    }
    public static void main(String[] args) {
        //printTable(5, 1);
        String r = printTable2(5,10);
        System.out.println(r);
    }
}
