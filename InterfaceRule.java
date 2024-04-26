interface A{
    int MAX = 10; // public static final int MAX = 10;
    void show();
}
interface B{
    int MAX = 20;
    void show();
}
// Multiple Inheritance Possible
interface C extends A, B{

}
public class InterfaceRule {
    public static void main(String[] args) {
        
    }
}
