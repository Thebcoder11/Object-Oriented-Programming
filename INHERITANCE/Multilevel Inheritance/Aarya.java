class Rahul{
    public void father(){
        System.out.println("I am Father");
    }
}
class Nisha extends Rahul{
    public void mother(){
        System.out.println("I am Mother");
    }
}
class Aarya extends Nisha{
    public void daughter(){
        System.out.println("I am Daughter");
    }
    public static void main(String []args){
        Rahul r = new Rahul();
        r.father();
        // r.mother();
        // r.daughter();
        System.out.println("______________________");
        Nisha n = new Nisha();
        n.father();
        n.mother();
        //n.Daughter();
        System.out.println("_______________________");
        Aarya a = new Aarya();
        a.father();
        a.mother();
        a.daughter();
    }
}
// This is called multilevel Inheritance
// A class extends B , B class extends C, therefore c can access a also