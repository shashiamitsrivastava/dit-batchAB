public class ArraySearchOccurances {
    // Count occurance
    static int[] searchOccurHelper(int arr[], int search 
    , int index, int count){
        // Base Case
        if(arr.length == index){
            // if(count ==0){
            //     int result[] = new int[1];
            //     return result;
            // }
            int [] result = new int[count];
            return result;
        }
        if(arr[index]==search){
            count++;
        }
        int result [] =searchOccurHelper(arr, search, index + 1, count);
        if(arr[index]==search){
            result [count-1] = index;
        }
        return result;
    }
    //{10,20,40,90,40,100,40,200}
    static int[] searchOccur(int arr[], int search 
    , int index){
       return searchOccurHelper(arr, search, index, 0);
    }
    public static void main(String[] args) {
        // int result [] = new int[3];
        // result[0] = 2;
        // result[1] = 4;
        int arr[] = {10,20,40,90,40,100,40,200};
        int search = 40;
        int indexes[]= searchOccur(arr, search, 0);
        for(int index : indexes){
            System.out.println(index);
        }

    }
}
