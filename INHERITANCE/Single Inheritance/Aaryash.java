class Bhavya{
    public void study(){
        System.out.println("I am Studying");
    }
}
class Aaryash extends Bhavya{
    public static void main(String []args){
        Aaryash a = new Aaryash();
        a.study();
    }
}
// This is called Inheritance
// object of child class is inheriting the properties of the parent class
// this increase code reuseability
// jisme main function hota hai ussi class ka name diya jata h file ko
