class Animal{
    public void eat(){
        System.out.println("I am Eating");
    }
    public void run(){
        System.out.println("I am Running");
    }
    public static void main(String []args){
        Animal buzo = new Animal();
        buzo.eat();
        buzo.run();
    }
}
// to compile the code in cmd we use javac Animal.java
// java Animal => here we give class name which has main method
// one object can call multiple methods
