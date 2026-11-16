import java.util.Scanner;
class SeniorCitizenException extends RuntimeException{
    SeniorCitizenException(String message){
        System.out.println(message);
    }
}
class OldAge{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        if(age>60){
            throw new SeniorCitizenException("You are now a senior citizen");
        }
        else{
            System.out.println("You are not a senior citizen");
        }
    }
}