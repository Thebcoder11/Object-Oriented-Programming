class Strbuf{
    public void Bhavya(StringBuffer x){
        System.out.println("StringBuffer Method");
    }
    public void Bhavya(String a){
        System.out.println("String Method");
    }
    public static void main(String[]args){
        Strbuf s = new Strbuf();
        s.Bhavya("abc"); // it will call string method
        s.Bhavya(new StringBuffer("xyz"));// now string buffer method will run
        //s.Bhavya(null); here compiler will get confuse which one to call it will give error
    }
}
// Method overloading
