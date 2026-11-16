class Rahul{
    public void work(){
        System.out.println("I am Working");
    }
}
class Nisha extends Rahul{
    public void teach(){
        System.out.println("Iam Teaching");
    }
    public static void main(String [] args){
        Rahul w = new Rahul();
        w.work();
        System.out.println("________________________");
        //w.teach(); it cannot call the child class method 
        // but child class object can call parent class method also and child class method
        Nisha n = new Nisha();
        n.work();
        n.teach();
    }
}
// object name is declared with the help of class name
// This is called Single Inheritance