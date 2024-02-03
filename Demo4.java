public class Demo4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
       // StringBuffer sb = new StringBuffer(); // 16 
        System.out.println(sb.capacity()); // 16
        System.out.println(sb.length()); // 0
        synchronized(sb){
            sb.append("hello");
        }
       
       // sb.ensureCapacity(200);
        System.out.println(sb.capacity()); // 16
        System.out.println(sb.length()); // 5
        sb.append("gkjfhdkjgjhgfdhkjghjkfdhgdfkhgjfdhjkgfdhkgjhg");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
