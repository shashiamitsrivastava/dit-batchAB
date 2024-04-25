class User{
    // Instance 
    // Object Creation
     String userid; // (Heap (Young/Old))
     String password;
    static int loginCount; //(Meta Space(HEAP)) // Class Load Time
    User(String userid, String password){
        System.out.println("Cons call");
        this.userid = userid;
        this.password = password;
        loginCount++;
    }
}
class T{
    // Binding
    int y; // Instance Var
    static int z; // Class Var
}
public class InstanceVarVsClassVarVsLocalVar {
    public static void main(String[] args) {
        int z = 100;
        User ram = new User("ram", "111");
        System.out.println(ram.userid + " "+ram.password);
        User shyam = new User("shyam", "112221");
        System.out.println(ram.userid + " "+ram.password);
        User tim = new User("tim", "777");
        System.out.println(ram.userid + " "+ram.password);
        System.out.println(User.loginCount);
        // System.out.println(T.z);
        // T obj = new T();
        // T obj2 = new T();
        // System.out.println(obj.y);

    }
}
