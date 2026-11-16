// generics class
class gen{
    public static void main(String []args){
        Bhavya<String> b = new Bhavya<>("Aaryash");
        System.out.println(b.getid());
        Bhavya<Integer> c = new Bhavya<>(18);
        System.out.println(c.getid());

    }
}
class Bhavya<V>{
    V id;
    public Bhavya(V id){
        this.id = id;
    }
    V getid(){
        return id;
    }
}
// we can give any data type to the class 