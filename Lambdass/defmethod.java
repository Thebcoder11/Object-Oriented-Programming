interface Bhavya{
    default void hi(){
        System.out.println("hi");
    }
}
class Aaryash implements Bhavya{
    
}
class defmethod extends Aaryash{
    public static void main(String []args){
        Aaryash a = new Aaryash();
        a.hi();
    }
}