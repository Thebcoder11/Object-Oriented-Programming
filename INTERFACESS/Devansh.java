interface i{
    void coder();
}
class Devansh implements i{
    public void coder(){
        System.out.println("Devansh is a coder");
    }
    public static void main(String []args){
        Devansh d = new Devansh();
        d.coder();
    }
}
// interface always create abstract method
// we cant create object 
// access modifier should be bigger in the child class
