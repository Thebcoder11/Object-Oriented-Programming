// userdefined exception handler -> checked
import java.util.Scanner;
class UnderAgeException extends Exception{
    UnderAgeException(){
        super("You are under age right now ");
    }
    UnderAgeException(String message){
        super(message);
    }
}
class Adhya{
    public static void main(String [] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        try{
            if(age<18){
                throw new UnderAgeException("Not Eligible for vote ");
            }
            else{
                System.out.println("Eligible for voting");
            }
        }
        catch(UnderAgeException e){
            e.printStackTrace();
        }
    }
}
// try catch are needed to compile the code 
// because they are the checked exception
// or then use throws keyword if you are not using try catch