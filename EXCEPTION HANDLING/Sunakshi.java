// now here object is created by divide method
// then it check if it is managed if not jvm will pass this to main if there handled ok
// otherwise jvm will pass this default exception handler 
// and program will termiante without completing it
class Sunakshi{
    void divide(){
        int a =10,b=0,c;
        try{
            c=a/b;
            System.out.println(c);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String []args){
        Sunakshi s = new Sunakshi();
        s.divide();
    }
}