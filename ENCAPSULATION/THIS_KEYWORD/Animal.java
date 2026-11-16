// 2 this keyword is used to call cureent class method
class Animal{
    public void eat(){
        System.out.println("Animal eats food");
    }
    public void walk(){
        this.eat();
        System.out.println("Animal walks in search of food");
    }
    public static void main(String []args){
        Animal a = new Animal();
        a.walk();
    }
}