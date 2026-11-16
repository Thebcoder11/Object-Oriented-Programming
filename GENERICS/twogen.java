class twogen{
    public static void main(String[]args){
        Rahul<String,Integer> r = new Rahul<>("Bhavya",1);
        Rahul<Integer,String> r1 = new Rahul<>(2,"Aaryash");
        System.out.println(r.name +" "+ r.id);
        System.out.println(r1.name+ " "+r1.id);
    }
}
class Rahul<A,B>{
    A name;
    B id;
    public Rahul(A name , B id){
        this.name = name;
        this.id = id;
    }
}