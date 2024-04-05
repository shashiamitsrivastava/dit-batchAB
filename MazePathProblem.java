public class MazePathProblem {

    static void getMazeOptions(int row, int col, int endRow,
     int endCol, String result){

        // Base Case
        if(row == endRow && col == endCol){
            System.out.println(result);
            return ;
        }
        if(row>endRow || col>endCol){
            return ;
        }
        // Small Problem
        getMazeOptions(row, col+1, endRow, endCol, result+"H");
        getMazeOptions(row+1, col, endRow, endCol, result+"V");
    }
    public static void main(String[] args) {
        getMazeOptions(0, 0, 2, 
        2, "");
    }
}
