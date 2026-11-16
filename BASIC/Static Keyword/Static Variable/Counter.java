class Counter{
    static int count = 0;
    Counter(){
        count++;
        System.out.println(count);
    }
    public static void main(String [] args){
        Counter c1 = new Counter();
        Counter c2 = new Counter();
    }
}
// if we will not use static here output will be 1 1 
// beacuse c1 value intialized with 0
// and same with c2
// but with static value will increase