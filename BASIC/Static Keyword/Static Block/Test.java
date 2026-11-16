// static block is used to intialize static variable 
// static block is automatically called
// before 1.6 version there is no need main function
// no matter whether static method is written above or below them main function 
// first all the static methods are called
// second use of static is to load native code in the static block
class Test{
    static{
        System.out.println("Static block");
    }
    public static void main(String [] args){
        System.out.println("Main method");
    }
    static{
        System.out.println("Second static block");
    }
}
