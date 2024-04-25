import java.util.ArrayList;

class Q{
    int x;
    int y;
    String z;
    Q(int x, int y, String z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
public class GCDemo {
    public static void main(String[] args) throws Exception {
        ArrayList<Q> list = new ArrayList<>();
        System.out.println("Code Starts...");
        while(true){
            Q obj = new Q(1,1,"Hello");
            list.add(obj);
            Thread.sleep(100);
        }
    }
}
