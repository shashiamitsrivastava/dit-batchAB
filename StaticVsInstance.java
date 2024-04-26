class X{
    int a; // bind with object
    static int b; // Bind with class , class load then static memory create
    static{
        b  = 100;
        System.out.println("Static Block, i call when class load "+b);
    }
    X(){
        a++;
        b++;
        System.out.println("Object call i call "+a+" "+b);
    }
}
public class StaticVsInstance {
    public static void main(String[] args) {
        System.out.println(X.b);
        X x1 = new X();
        X x2 = new X();
        X x3 = new X();

    }
}
