public class Demo3 {
    public static void main(String[] args) {
        String x = "amit".intern(); // 1 object or 0 object
        String y = "amit";
        String z = new String("amit"); // 2 or 1
        System.out.println(x==y);
        System.out.println(x==z);
        System.out.println(y.toUpperCase());
        System.out.println(y);
        // String name = "Amit"; 
        // String name2 = "Amit";
        // String name3 = "Amit";
        // String name4 = new String("Amit");
        // System.out.println(name==name2);
        // System.out.println(name2 == name3);
        // name3 = "ram";
        // System.out.println(name==name2);
        // System.out.println(name2 == name3);
    }
}
