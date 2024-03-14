public class ArraySorted {
    static boolean isSortedArray(int [] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        return isSortedArray(arr, index+1);
    }
   public static void main(String[] args) {
    int arr[] = {10,20,30,40,50};
    boolean result = isSortedArray(arr, 0);
    System.out.println(result?"Sorted ":"Not Sorted");
   } 
}
