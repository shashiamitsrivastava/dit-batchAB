public class DiceBoardProblem {

    static void diceBoard(int currentValue, int endValue,
     String result){
        // Base Case
        if(currentValue == endValue){
            System.out.print(result+" , ");
            return ;
        }
        if(currentValue>endValue){
            return ; 
        }
        for(int dice = 1; dice<=6; dice++){
            diceBoard(currentValue+dice, endValue, 
            result + dice);
        }
        // diceBoard(currentValue+1, endValue, result + "1");
        // diceBoard(currentValue+2, endValue, result + "2");
    }
    public static void main(String[] args) {
        diceBoard(0, 10, "");
    }
}
