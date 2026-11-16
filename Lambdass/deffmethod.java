interface bhavya{
    default void hii(){
        System.out.println("Hi");
    }
}
interface Aaryash {
    default void hii(){
        System.out.println("Hello");
    }
}
class deffmethod implements bhavya,Aaryash{
    public void hii(){
        bhavya.super.hii();
        Aaryash.super.hii();
    }
    public static void main(String []args){
        deffmethod d = new deffmethod ();
        d.hii();
    }
}