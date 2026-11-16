class Math{
    public void linear(int a,String b){
        System.out.println("1");
    }
    public void linear(String b,int a){
        System.out.println("2");
    }
    public static void main(String[]args){
        Math m = new Math();
        m.linear(1,"abc");
    }
}
// method overloading = static polymorphism , compile time polymorphism
// different no of arguments 
// different type of datatype
// sequence of arguments
