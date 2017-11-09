import java.util.Scanner;
import java.lang.String;

public class Login {
    public static void main(String [] args){
        Scanner keyboard=new Scanner(System.in);
        String username,password;
        System.out.println("Enter username");
        username=keyboard.nextLine();
        System.out.println("Enter password");
        password=keyboard.nextLine();
        if (username.equals("Andres")&&password.equals("javarocks")){
            System.out.println("Welcome Andres!");}
        else {
            System.out.println("Wrong Username or Password!");}
    }
}
