// try finally catch alone cant be used
// try finally can be used
// try catch finally can be used
// try sop catch cant be used 
// try (try catch) catch(try catch) finally(try catch)
// two catch can be used
// catch (child class) catch(parent class) allowed vice versa not allowed
// catch (same class) not allowed
// catch connot be written after finally try finally then catch not allowed
import java.io.FileInputStream;
import java.io.FileNotFoundException;
class Anant{
    public static void main(String []args){
        FileInputStream f = null;
        FileInputStream i = null;
        try{
            f = new FileInputStream("c:/bhavya1.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("Exception bhavya file not found "+e);
            try{
                i = new FileInputStream("c:/Dileep.txt");
            }
            // Sytem.out.println("Between try and catch nothing is allowed");
            catch(Exception ae){
                System.out.println("Exception Dileep file not found "+ae);
            }
        }
        catch(Exception ee){
            System.out.println(ee);
        }
        finally{
            try{    
                if(f!=null){
                    f.close();
                }
            }
            catch(Exception fe){
                System.out.println(fe);
            }
            try{
                if(i!=null){
                    i.close();
                }
            }
            catch(Exception g){
                System.out.println(g);
            }
            System.out.println("File Closed Successfully");
        }
    }
}
