// can we overload java main method 
class Sst{
    public static void main(String []args){
        System.out.println("1");
        Sst s = new Sst();
        s.main(1);
    }
    public static void main(int a){
        System.out.println("Yes we can achieve method overloading in main method");
    }
}
// method overloading
// yes we can overload java main method
