import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
class writeread {
    void read() throws FileNotFoundException{
        FileInputStream fis = new FileInputStream("c:/bhavya.txt");
    }
    void write() throws FileNotFoundException{
        String text = "Hello";
        FileOutputStream fos = new FileOutputStream("c:/Varista.txt");
    }
}
class ReadWrite{
    public static void main(String []args){
        writeread wr = new writeread();
        try{
            wr.read();
            wr.write();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}