// finalize method
class Sunny{
    protected void finalize(){
        System.out.println("Object destroyed Successfully");
    }
    public static void main(String []args){
        Sunny s = new Sunny();
        s = null;
        System.gc();
    }
}