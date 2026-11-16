import java.io.FileInputStream;
class Flow{
    public static void main(String[]args){
        try{
            System.out.println("1");
            FileInputStream f = new FileInputStream("C:/bhavya.txt");
            int a = 10, b =0,c;
            System.out.println("2");
            c =a/b;
            System.out.println(c);
            System.out.println("3");
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("4");
        }
        System.out.println("Code completed Successfully");
    }
}
// if exception occured in try the code after the excpetion will not run
// it will directly go to catch to handle the exception 