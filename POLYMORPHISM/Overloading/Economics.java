class Economics{
    public void History(int a){
        System.out.println("1");
    }
    //varargs
    public void History(int... a){
        System.out.println("2");
    }
    public static void main(String[]args){
        Economics e = new Economics();
        e.History(1,2,3);
        e.History();
        e.History(1);
    }
}
// method overloading 
// Compile time polymorphism = staic polymorphism
// same name, same class , different arguments
// use of varagrs data type
