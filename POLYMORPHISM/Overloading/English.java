// byte -> short -> int -> float
// char -> int 
// int -> float -> double
// int -> double   
// int -> long -> double
// this is automatic promotion       
class English{
    public void grammer(int a){
        System.out.println("1");
    }
    public void grammer(String b){
        System.out.println("2");
    }
    public static void main(String []args){
        English e = new English();
        e.grammer('a');
    }
}
// method overloading
// char a will automatically converts into int 