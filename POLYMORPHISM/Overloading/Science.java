// can we achieve method overloading by changing the return type of method 
class Science{
    void physics(){
        System.out.println("1");
    }
    int physics(){
        System.out.println("2");
    }
    public static void main(String []args){
        Science s = new Science();
        s.physics();
    }
}
// no we cannot achieve method overloading by changing return type of the method
