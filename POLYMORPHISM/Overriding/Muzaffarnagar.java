class Delhi{
    void Journey(){
        System.out.println("Life is a journey");
    }
}
class Muzaffarnagar extends Delhi{
    void Journey(){
        super.Journey();
        System.out.println("My journey starts from muzaffarngar");
    }
    public static void main(String[] args){
        Muzaffarnagar m = new Muzaffarnagar();
        m.Journey();
    }
}
// method overriding
// here we super keyword to use parent class method using child class object
// super keyowrd helps to access parent class method using child class object
