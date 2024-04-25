import java.util.*;

class T1{
    int x = 10;
     void show(){
        System.out.println("T1 show");
     }

     void output(){
        System.out.println("T1 output");
     }
    
}
class T2 extends T1{
    int x = 20;
    @Override
    void show(){
        System.out.println("T2 Show..");
    }
    void disp(){
        System.out.println("T2 Disp");
     }
}
public class Binding {

    static void giveMeList(List<Integer> l){

    }
    public static void main(String[] args) {
        // giveMeList(new LinkedList<>());
        // giveMeList(new ArrayList<>());
        // giveMeList(new Vector<>());

        // ArrayList<Integer> l2 = new ArrayList<>();
        // // List - Parent
        // // ArrayList- Child
        // List<Integer> l = new ArrayList<>(); // Upcasting
        // l = new Vector<>();
        // l = new LinkedList<>();
        // Overiding - object bind method
        T1 obj = new T2(); // Upcasting
        
        System.out.println(obj.x); // variable binding with type
        obj.show(); // Object binding - overriding
        obj.output();
        int x = 100;
        byte w = (byte)x;
        if(obj instanceof T2){
            // T2 t2 = (T2) obj;
            // t2.disp();
            ((T2)obj).disp(); // Downcasting
        }
        //obj.disp();
    }
}
