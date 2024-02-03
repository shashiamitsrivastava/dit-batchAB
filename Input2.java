import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id");
        int id = scanner.nextInt();
        scanner.nextLine(); // eat \n
        System.out.println("Enter the Name");
        String name = scanner.nextLine();
       
        System.out.println("id "+id);
        System.out.println("name "+name);
       
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter the City");
        String city = scanner2.next();
        System.out.println("City "+city);
        scanner.close();
        scanner2.close();
    }
}
