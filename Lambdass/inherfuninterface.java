interface Bhavya{
    public void hi();
}
@FunctionalInterface
// 1 no abstract method still functional interface
interface Aarya extends Bhavya{

}

// 2  same abstract method
@FunctionalInterface
interface Aaryash extends Bhavya{
    public void hi();
}

// // 3 two method in a interface not a functional interface then
// @FunctionalInterface
// interface Nisha extends Bhavya{
//     public void heello();
// }
// 4 can have static method and deafult method also
interface Rahul extends Bhavya{
    static void goodmorning(){
        System.out.println("Good Morning ");
    }
    default void goodnight(){
        System.out.println("Good night");
        goodmorning();
    }
}

class inherfuninterface {
    public static void main(String[]args){
    }
}
// class implements interface
// interface extends interface