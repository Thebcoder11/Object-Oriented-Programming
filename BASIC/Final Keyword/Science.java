// 2 is final keyword is used in the method you cannot override it
class Math{
    final void m1(){
        System.out.println("Final method");
    }
} 
class Science extends Math{
    // void m1(){
    //     System.out.println("Method overridding");
    // }
    public static void main(String[]args){
        Science s = new Science();
        s.m1();
    }
}