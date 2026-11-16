// instance variable can be static 
// but local variable cant be static
// outer class cant be static
// static variable to refer to class
// instance variable refer to object
class Test{
    static int a = 10;
    int b = 20;
    public static void main(String []args){
        System.out.println(Test.a);
        Test t = new Test();
        System.out.println(t.b);
    }
}