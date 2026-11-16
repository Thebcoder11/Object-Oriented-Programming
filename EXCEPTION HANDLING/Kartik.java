// final
// final class cant be inherited
// final method cant be override 
// final variable cant be changed
class Bhavya{
    final int a = 10;
    final void show(){
        //a=20;
        System.out.println(a);
    }

}
class Kartik extends Bhavya{
    // void show(){
    //     System.out.println("Final method cant be override");
    // }
    public static void main(String []args){
        Kartik k = new Kartik();
        k.show();
    }
}
