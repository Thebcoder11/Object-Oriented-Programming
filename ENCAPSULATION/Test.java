class Test{
    int i ;
    public void setvalues(int i){
        // here we take instance varible not the local variable 
        //that is why output is 0 
        // i=i; // instance variable value is 0 that is why output 0
        this.i=i; 
        //  but we this keyword this.i refer to instance and i refer to local
        // that is why output is 101
    }
    public void show(){
        System.out.println(i);
    }
    public static void main(String[]args){
        Test t= new Test();
        t.setvalues(101);
        t.show();
    }
}
