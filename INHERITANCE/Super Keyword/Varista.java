// 1 super keyword is used to refer parent class instance variable
class Kashya{
    int a = 10;
}
class Varista extends Kashya{
    int a = 20;
    public void show(int a){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
    public static void main(String [] args){
        Varista v = new Varista();
        v.show(30);
    }
}