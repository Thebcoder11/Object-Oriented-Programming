abstract class vehicle{
    int number_of_tyres;
    abstract void start();
}
class car extends vehicle{
    void start(){
        System.out.println("Cae starts with key");
    }
}
class bike extends vehicle{
    void start(){
        System.out.println("Bike starts with kich");
    }
    public static void main(String []args){
        car c = new car();
        c.start();
        bike b = new bike();
        b.start();
    }
}
