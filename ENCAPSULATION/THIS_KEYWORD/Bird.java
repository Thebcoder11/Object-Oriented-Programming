// 3 this keyword is used to invoke current class constructor
class Bird{
    Bird(){
        System.out.println("Default Constructor");
        this(10);
    }
    Bird(int a){
        System.out.println("Parameterized constructor");
    }
    public static void main(String [] args){
        Bird b = new Bird();

    }
}