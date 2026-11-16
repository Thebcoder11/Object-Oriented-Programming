class genmethod{
    public static void main(String [] args){
        genmethod g = new genmethod();
        g.Bhavya("Aaryash");
        g.Bhavya(12);


    }
    <A> void Bhavya(A data){
        System.out.println(data);
    }
}