import java.util.Scanner;

class SalarySlip{
    // Formatting of Result (Amount) 
    // , Currency
    // NumberFormat (Rs, $, Euro)
    // Members (Class / Instance)
    // name - raM kUmaR sHaRmA
    // name = Ram Kumar Sharma
    // names[0] - raM names[1]-kUmaR
    static String properCase(String name){
        //String names[] = name.split(" ");
        String fullName = "";
        for (String n : name.split(" ")){
            fullName += String.valueOf(n.charAt(0))
            .toUpperCase() + 
            n.substring(1)
            .toLowerCase()+" ";
        }
        // for(int i = 0; i<names.length; i++){

        //     // String n = names[i]; // raM
        //     // char firstChar = n.charAt(0);
        //     // String firstLetterCap = String.valueOf(firstChar)
        //     // .toUpperCase();
        //     // String remString = n.substring(1)
        //     // .toLowerCase();
        //     // String n2 = firstLetterCap + remString;
        //     // fullName = fullName + n2 + " ";
        // }
        return fullName.trim();
    }
    static void input(){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter the id");
        int id = scanner.nextInt(); // 1001 \n
        scanner.nextLine(); // eat \n
        System.out.println("Enter the name");
        String name = scanner.nextLine();
        System.out.println("Enter the Basic Salary");
        double basicSalary = scanner.nextDouble();
        compute(id, name, basicSalary);
        scanner.close();
    }
    static void compute(int id, String name,double basicSalary){
        double hra = basicSalary * 0.50;
        double ta = basicSalary * 0.40;
        double da = basicSalary * 0.20;
        double ma = basicSalary * 0.25;
        double pf = basicSalary * 0.05;
        print(id, name , basicSalary, hra, da, ta, ma, pf);
    }
    static void print(int id, String name, double basicSalary, double hra, double da, double ta , double ma, double pf){
        System.out.println("Id "+id);
        System.out.println("Name "+properCase(name));
        System.out.println("Basic Salary "+basicSalary);
        System.out.println("Earning Allowances \t\tDeduction");
        System.out.println("HRA "+hra+" \t\t\t"+"PF "+pf);
        System.out.println("DA "+da);
        System.out.println("TA "+ta );
        System.out.println("MA "+ma);
    }
    public static void main(String[] args) {
        input();
        // input
       
        // Compute
        

        // print
        
        
      
    }
}