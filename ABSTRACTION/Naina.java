abstract class Arvind{
    abstract void principle();
    void head(){
        System.out.println("Head of the college ");
    }
}
class Naina{
    public void principle(){
        System.out.println("Jee teacher");
    }
    void head(){
        System.out.println("head of the project");
    }
    public static void main(String []args){
        // Arvind a = new Arvind();
        // a.head();
        Naina n = new Naina();
        n.head();
    }
}
// abstract class can also have non abstarct method
// we cant create abstract class object and we have to override the method which is abstract
// when we override abstarct method it access modifier should be bigger than from abstract method