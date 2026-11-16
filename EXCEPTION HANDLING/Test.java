import java.io.FileInputStream;
class Test{
    public static void main(String []args){
        try{
            FileInputStream f = new FileInputStream("C:/bhavya.txt");
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(Exception e){
            System.out.println(e);
        }
        // jdbc stands for java database connectivity
        // the code which is in try and catch are compile time exception code
        // this divide one will have runtime exception
        //int s = 4/0; // compiler will compile the code but it will give error at run time
        
    }
}
// if file is not found in the system it will throws error of file not found
// and the problem which can easily be finded by compiler are called compile time expection or checked excpetion
// and which are not handled by complier are called runtime exception or unchecked exception