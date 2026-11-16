// 6 this keyword is also to return 
class Rahul{
    Rahul m1(){
        return this;
    }
    public static void main(String[]args){
        Rahul r = new Rahul();
        r.m1();
    }
}