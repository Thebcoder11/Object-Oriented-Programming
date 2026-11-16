// Super keyword 3 uses
class Bhavya{
    Bhavya(){
        System.out.println("Parent class Constructor");
    }
    public void m1(){
        System.out.println("Parent class method");
    }
    int a = 10;
}
class Avika extends Bhavya {
    Avika(){
        super();
        System.out.println("Child Class Constructor");
    }
    public void m1(){
        super.m1();
        System.out.println("Child class method ");
    }
    int a = 20;
    public void show(int a){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
    public static void main(String [] args){
        Avika a = new Avika();
        a.m1();
        a.show(30);
    }
}
