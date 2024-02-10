class Email{
    static Email email = new Email(); 
    private Email(){

    }
    // int show(){
    //     return 20;
    // }
    static Email getEmailInstance(){
        // if(email == null){
        //     email =new Email();
        // }
        return email;
    }
}
public class SingleTonDemo {
 public static void main(String[] args) {
    Email e1 = Email.getEmailInstance();
    Email e2 = Email.getEmailInstance();
    Email e3 = Email.getEmailInstance();
    System.out.println(e1 == e2 && e1 == e3);
    // Email email1 = new Email();
    // Email email2 = new Email();
    // Email email3 = new Email();
 }   
}
