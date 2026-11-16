class Shanvi{
    public void sid(Object a){
        System.out.println("Object method");
    }
    public void sid(String n){
        System.out.println("string method");
    }
    public static void main(String[]args){
        Shanvi s = new Shanvi();
        s.sid('a');
    }
}
// method overloading
// object is the parent class of string
// if a call string "abc" then it will print string method 
// now it not call the parent class
