class Gaurav{
    Object teacher(){
        System.out.println("he is a teacher");
        return null;
    }
}
class Vivaan extends Gaurav{
    String teacher(){
        System.out.println("He is teaching only");
        return null;
    }
    public static void main(String []args){
        Gaurav g = new Gaurav();
        g.teacher();
        Vivaan v = new Vivaan();
        v.teacher();
    }
}
// same return type overriding
// // method either have same return type or parent return type in superclass and child return type in subclass
// but not the big parent return type method in subclass it will throw error in superclass has child return type