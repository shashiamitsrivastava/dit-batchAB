// What are the usecases of final keyword
// S O L I D
// S - SRP
// O - Open Close Principle
// Class is open for extension and close for modification
/*
 *  final = fixed
 * 1. final is used to make constants 
 * a) with value type
 * b) with reference type
 * 2. final with class - prevent inheritance
 * 3. final with method - prevent overriding
 * 4. final with Local Variable
 * 5. final with Instance Variable
 * 6. final with Class Variable
 * static vs final
 * Note: final can be use with Local Variable
 */
//final class Base{
    class Base{
        final void show(){
            System.out.println("I am the Show...");
        }
}
class Child extends Base{
    // @Override
    // void show(){

    // }
}
public class FinalUse {
    // Eager Assignment
    final int r ; // Instance Variable
    // Lazy Assignment
    // Constructor
    FinalUse(){
        r = 100;
    }
    FinalUse(int r){
       // this(); // Call Default Constructor
        this.r = r;
    }
    void disp(){
       // r = 1000;
    }
    public static void main(String[] args) {
        // final int x=1000;
        final Child child =new Child();
       // Math

        final int arr[] = {10,20,30};
        arr[0]++;
        final int MAX = 100;// Constant (ALL CAPS)
        final StringBuffer sb = new StringBuffer("Hello");
        sb.append("Hi");
        System.out.println(sb);
       // sb = new StringBuffer();
        int x = 10;
        x++;
        x = 20 + x;
        System.out.println(x);
    }
}
