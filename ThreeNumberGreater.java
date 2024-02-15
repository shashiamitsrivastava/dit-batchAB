public class ThreeNumberGreater {
   public static void main(String[] args) {
    int first = 210;
    int second = 120;
    int third = 30;
    if(first>second){
        if(first>third){
            System.out.println("First is Greater");
        }
        else{
            System.out.println("Third is Greater");
        }
    }
    else{
        if(second>third){
            System.out.println("Second is Greater");
        }
        else{
           System.out.println("Third is Greater"); 
        }
    }

   } 
}
