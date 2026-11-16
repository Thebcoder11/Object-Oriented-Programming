class piyush{
    static void ssc(){
        System.out.println("SSC aspirant");
    }
}
class Pranav extends piyush{
    void ssc(){
        System.out.println("SSC aspirants");
    }
    public static void main(String []args){
        piyush p = new piyush();
        p.ssc();
    }
}
// method overriding
// private method cannot be overriden
// but i have also studied private static final also cant be overriden
