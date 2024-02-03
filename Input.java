import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // System.out.println("Enter your name");
        // int singleByte = System.in.read();
        int count = 0;
        //nextXXX nextLine
        Scanner scanner = new Scanner("Hello How are You\n Hi \n OK\n");
        while(scanner.hasNextLine()){
            scanner.nextLine();
            count++;
            //System.out.println(scanner.next()); // current element , and move to the next element
        }
        // while(scanner.hasNext()){
        //     scanner.next();
        //     count++;
        //     //System.out.println(scanner.next()); // current element , and move to the next element
        // }
        System.err.println(count);
    }
}
