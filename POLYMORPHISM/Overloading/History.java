class History{
    public void civics(String a,float b){
        System.out.println("1");
    }
    public void civics(float a, int b){
        System.out.println("2");
    }
    public static void main(String[] args){

        History h = new History();
        //h.civics(10,20.5f);
        h.civics(20.6f,10);
        //h.civics(10,20); // now here compiler will confuse which one i can do promotion
        h.civics("Aaryash",10); // now it will do automatic promotion

    }
}
