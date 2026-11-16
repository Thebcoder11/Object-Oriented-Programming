class Varista{
    int a = 10;
}
class Kashya extends Varista{
    int a = 20;
    public void show(int a){
        System.out.println(a); // this refer to local variable // 30
        System.out.println(this.a); // current class instance variable // 20
        System.out.println(super.a);// parent class instance variable // 10
    }
    public static void main(String [] args){
        Kashya k = new Kashya();
        k.show(30);
    }
}