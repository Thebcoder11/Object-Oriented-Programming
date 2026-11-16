import java.io.FileInputStream;
class Bhavya{
    public static void main(String []args){
        try{
            FileInputStream f = new FileInputStream("C:/bhavya.txt");
            System.out.println("file found successfully");
            Class.forName("com.mysql.jdbc.driver");
            int a = 10, b = 0,c;
            c=a/b;
            System.out.println(c);
            System.out.println("Try does not have any risky code");
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Code Completed Successfully");
    }
}
// here e referes to object created by main class which include Exception name, descrption , stack(line number)
// if exception is not handled by programmer it will handled by main class object
// and it will terminate the program immediately without completing it
// try{
// risky code
// }
// catch(Exception e){
// handling code
// }
// if we know the excpetion name then we can also put it there 
