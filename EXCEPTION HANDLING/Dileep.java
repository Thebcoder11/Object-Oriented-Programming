import java.io.FileInputStream;
class Dileep{
    public static void main(String []args){
        FileInputStream f = null;
        try{
            f = new FileInputStream("C:/bhavya.txt");
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            try{
                if(f!=null){
                    f.close();
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
            System.out.println("Finally code completed");
        }

    }
}