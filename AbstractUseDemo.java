// Base Version
abstract class Course{
    int id;
    String name;
    int duration;
    Course(){
        System.out.println("COns Call of Course");
    }
    void enroll(){

    }
    void startTEnd(){

    }
    // Vision
    abstract void discount(int marks);

}
class ITCourse extends Course{
    ITCourse(){
        // super(); // Implict call
        System.out.println("IT Course Cons call");
    }
    void practical(){

    }
    @Override
    void discount(int marks) {
        if(marks>90){
            System.out.println("Discount 20%");
        }
    }
}
class ManagementCourse extends Course{
    void theory(){

    }
    @Override
    void discount(int marks) {
        if(marks>80){
            System.out.println("Discount 10%");
        }
    }
}
public class AbstractUseDemo {
    public static void main(String[] args) {
      //  Course tom = new Course();
        ITCourse ram =new ITCourse();
        ManagementCourse shyam = new ManagementCourse();
    }
}
