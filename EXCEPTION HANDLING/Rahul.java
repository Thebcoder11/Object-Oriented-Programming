import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
class Rahul{
    public static void main(String []args)throws IOException{
        FileInputStream f = null;
        try{
            f = new FileInputStream("c:/bhavya.txt");
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            if(f!=null){
                f.close();
            }
            System.out.println("File closed Successfully");
        }
    }
}
// if we dont want to use throws exception then we can use try catch method in finally block
