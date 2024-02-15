public class SwitchCaseDemo {
    public static void main(String[] args) { // function
        for(int i = 1; i<=10; i++){
            if(i==5){
               // return ; // exit from the current function
                //break; // Block Exit
            }
        }
        System.out.println("Code...");

        int d = 1;
        int r = switch(d){
            case 1->{
                System.out.println("Case 1 Shirts");
                yield 10; // switch to next thread
            }
            case 2->{
                System.out.println("Case 1 Jeans");
                yield 20;
            }
            default->{
                System.out.println("All Dis");
                yield 5;
            }
        };
        // int d = 1;
        // int result = switch(d){
        //     case 1 ->20;
        //     case 2->30;
        //     case 3->40;
        //     default->50;
        // };
        // System.out.println("Discount is "+result);
        // Colon vs Arrow
        // Java 14
        // Auto Break
        String item = "burger";
        switch(item){
            case "burger","pizza"->
            System.out.println("Price is Rs 100");
            
            case "drink"->{
            System.out.println("Price is Rs 50");
            System.out.println("Mock Tails");
            }
           
        }  

        // Java 7 (String)
        // int , byte, short, char, Enum
        // String item = "burger";
        // switch(item){
        //     case "burger":
        //     System.out.println("Price is Rs 100");
        //     break;
        //     case "drink":
        //     System.out.println("Price is Rs 50");
        //     break;
        // }    

        // int item = 1;
        // final int BURGER = 1;
        // final int DRINK = 2;
        // final int DESSERT = 3;
        // switch(item){
        //     case BURGER: // item ==1
        //         System.out.println("Price is Rs 100");
        //     case DRINK:
        //     System.out.println("Price is Rs 50");
        //     case DESSERT:
        //     System.out.println("Price is Rs 200");
        //    default:
        //    System.out.println("50 % Off");

        // }
    }
}
