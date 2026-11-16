// 5 this keyword can be passed as argument in construcotr call
class Bhavya{
    Bhavya(Aaryash a){
        System.out.println("Constructor call");
    }
}
class Aaryash{
    public void father(){
        Bhavya a = new Bhavya (this);
    }
    public static void main(String [] args){
        Aaryash a = new Aaryash();
        a.father();
    }
}