import java.io.FileInputStream;
class Methodp{
    public static void main (String[]args){
        try{
            int a=10,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        catch(Exception e){
            e.printStackTrace(); // Exception Name ,description stack trace
            System.out.println(e); // Exception Name , description
            System.out.println(e.toString());// Exception name,descrption
            System.out.println(e.getMessage()); // only Descrption
        }
    }
}