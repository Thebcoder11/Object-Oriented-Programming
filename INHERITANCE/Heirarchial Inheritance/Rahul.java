class Nisha{
    public void accountant(){
        System.out.println("I am Accountant");
    }
}
class Bhavya extends Nisha{
    public void engineer(){
        System.out.println("I am Engineer");
    }
}
class Rahul extends Nisha{
    public void librarian(){
        System.out.println("I am Librarian");
    }
    public static void main(String [] args){
        Nisha n = new Nisha();
        n.accountant();
        //n.librarian
        //n.engineer
        System.out.println("_______________");
        Bhavya b = new Bhavya();
        b.accountant();
        b.engineer();
        System.out.println("_______________");
        //b.librarian
        Rahul r = new Rahul();
        r.accountant();
        r.librarian();
    }
}
// this is called hierarchial inheritance
// two class can inherit the same class

