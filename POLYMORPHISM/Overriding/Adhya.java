class Gaurav{
    void teacher(){
        System.out.println("Gaurav is a teacher");
    }
}
class Adhya extends Gaurav {
    protected void teacher(){
        System.out.println("Adhya will became teacher");
    }
    public static void main(String []args){
        Gaurav g = new Gaurav();
        g.teacher();
        Adhya a = new Adhya();
        a.teacher();
    }
}
// access modifier overriding
// child class should always have same access modifier as parent class or the greater access modifier
// default < protected
// default < public 