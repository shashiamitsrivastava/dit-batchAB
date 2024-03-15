public class ArraySearch {
    static boolean searching(int arr[], int search, int index){
        if(arr.length==index){
            return false;
        }
        if(arr[index]== search){
            return true;
        }
        return searching(arr, search, index + 1);
        // boolean r =  searching(arr, search, index + 1);
        // return r;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50, 40, 100, 40};
        boolean result = searching(arr, 40, 0);
        System.out.println(result?"Found":"Not Found");
    }
}
