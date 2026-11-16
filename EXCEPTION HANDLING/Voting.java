import java.util.Scanner;
class YoungerAgeException extends RuntimeException{
    YoungerAgeException(String msg){
        System.out.println(msg);
    }
}
class Voting{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        if(age<19){
            throw new YoungerAgeException("You are not eligible right now");
        }
        else{
            System.out.println("Eligible");
        }
    }
}