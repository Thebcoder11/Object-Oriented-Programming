interface i1{
    public abstract void show();
    static void bhavya(){
        System.out.println("Static concrete method");
    }
    default void Aaryash(){
        System.out.println("Deafault concrete method");
        Nisha();
    }
    private void Nisha(){
        System.out.println("After 9th version private concrete method");
    }
    // that is how fields are defined
    public static final int a = 10;

}
interface i2{
    public abstract void display();
}
class Brown implements i1,i2{
    public void show(){
        System.out.println("Interface 1");
    }
    public void display(){
        System.out.println("Interface 2");
    }
    public static void main(String []args){
        Brown b = new Brown();
        b.show();
        b.display();
        i1.bhavya();
        b.Aaryash(); // CLASS object can call deafult method but not static
        //i1.Nisha(); we cant call private method directly
    }
}
// This is Interface it is used for multiple inheritance
// all methods in the abstract class are represented by => public abstract void method
// then child class should also have same or greater access modifier
// here field are declared as public static void final
// default method can directly called
// static can be called by interface