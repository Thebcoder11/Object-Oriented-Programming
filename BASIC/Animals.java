class Animals{
    public void eat(){
        System.out.println("I am Eating");
    }
    public void run(){
        System.out.println("I am Running");
    }
    public static void main(String[] args){
        Birds mitho = new Birds();
        mitho.fly();
        Animals buzo = new Animals();
        buzo.eat();
        buzo.run();
    }
}
class Birds{
    public void fly(){
        System.out.println("Birds are flying");
    }
}
// jisme main function uski ka class name diya jayega
