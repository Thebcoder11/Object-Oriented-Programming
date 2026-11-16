class Anubhav{
    void height(){
        System.out.println("He has good height");
    }
}
class Kartik extends Anubhav{
    synchronized void height(){
        System.out.println("He also has good height");
    }
    public static void main(String[]args){
        Kartik k = new Kartik();
        k.height();
        Anubhav a = new Anubhav();
        a.height();
    }
}
// method overloading
// in this we are using synchronized and strictfp keyword to override the method
// we can use these keywords in both superclass and also in sub class
