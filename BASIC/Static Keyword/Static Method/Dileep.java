// static method refer to to class not the object
// you can call static method with class name and the method name
// it is good for memory management
// static method can only have static varible and can only call static method
// static method cant have super or this keyword
// if static method is within the class you can directly call its m=by method name even 
// without using the class name
// if it is in another class then you need to give class name 
class Dileep{
    // int a = 10; non static variable
    static int a = 10;
    static void History(){
        System.out.println(a);
        System.out.println("Dileep Studies geographic politics");
        maths();
    }
    static void maths(){
        System.out.println("Dileep is good at maths");
    }
    // void maths(){
    //     System.out.println("Dileep is good at maths");
    // } // cant use non static method
    public static void main(String []args){
        History();
        Bhavya.kdrama();
    }
}
class Bhavya{
    static int c = 30;
    static void kdrama(){
        //System.out.println(this.c); // cant use super or this keyword
        System.out.println(c);
        System.out.println("Bhavya watches kdrama");
    }
}