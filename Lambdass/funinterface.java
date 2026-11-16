// only one abstract method
// static and default methods are allowed
@FunctionalInterface
interface Bhavya{
    public void hello(); // abstract method
    default void hi(){
        System.out.println("Hi");
        hiii();
    }
    static void hiii(){
        System.out.println("Hii");
    }
}
class funinterface implements Bhavya{
    public void hello(){
        System.out.println("Hello");
    }
    public static void main(String []args){
        funinterface f = new funinterface();
        f.hello();
        f.hi();

    }
}
// static cant be called with object
// if we want to implement the interface the next class should be abstract