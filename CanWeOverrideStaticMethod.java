class K1{
    static int x=1000;
   static void show(){
    System.out.println("k1 Show");
    }
}
class K2 extends K1{
    static int x = 2000;
    //@Override
    static void show(){
        System.out.println("k2 show");
    }
}
public class CanWeOverrideStaticMethod {
    public static void main(String[] args) {
        
        K1.show();
        K2.show();
        // K1 obj =new K2();
        // obj.show();
    }
}
