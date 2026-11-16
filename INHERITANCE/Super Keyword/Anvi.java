// super keyword is used to refer parent class method also
class Bhavya{
    public void m1(){
        System.out.println("Parent class");
    }
}
class Anvi extends Bhavya{
    public void m1(){
        super.m1();
        System.out.println("Child class");
    }
    public static void main(String []args){
        Anvi a = new Anvi();
        a.m1();
    }
}