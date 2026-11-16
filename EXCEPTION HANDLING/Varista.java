// userdefined unchecked exception
import java.util.Scanner;
class UnderAgeException extends RuntimeException{
    UnderAgeException (){
        super("you are not eligible for voting");
    }
    UnderAgeException(String message){
        super(message);
    }
}
class Varista{
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        try{
            if(age<18){
                throw new UnderAgeException("You are not adult ");
            }
            else{
                System.out.println("You are eligible for voting ");
            }
        }
        catch(UnderAgeException e){
            e.printStackTrace();
        }
    }
}
// this are runtime exceotion these can also be runned without try catch 
// as they will not create any problem in the compliation of the program
// but if you want your program will not abnormally terminate give try catch
// to handle the exception
