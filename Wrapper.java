import java.util.LinkedList;

public class Wrapper {
    public static void main(String[] args) {
        Integer a = 1000;
        Integer b = 2000;
        Integer c = a + b;
        System.out.println(c);
        LinkedList<Integer> l = new LinkedList<>();
        int x = 100;
        l.add(x); // value convert object (Boxing) (Java 5 AutoBoxing)
       // l.add(new Integer(x)); // Manual Boxing
      int y =  l.get(0); // UnBoxing
    }
}
