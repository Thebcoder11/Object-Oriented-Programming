// 3 super keyword is used to refer parent class constructor
class Bhavya{
    Bhavya(){
        System.out.println("Parent class constructor");
    }
}
class Khushi extends Bhavya{
    Khushi(){
        //super();
        System.out.println("Child class constructor");
    }
    public static void main(String [] args){
        Khushi k = new Khushi ();
    }
}
// super is keyword
// super() it is used to call parent class constructor
// and it is not necessary to write it it automatically done it