class Nishu{
    void speak(){
        System.out.println("Nishu is Speaking");
    }
}
class Adhvik extends Nishu{
    void speak(){
        System.out.println("Adhvik is also speaking");
    }
    public static void main(String []args){
        Nishu n = new Nishu();
        n.speak();
        Adhvik a = new Adhvik();
        a.speak();
    }
}
// different class, same method,same arguments , Inheritance => to achieve overloading
// Polymorphism 
// Runtime time polymorphism
// Dynamin polymorphism
// Method Overriding
