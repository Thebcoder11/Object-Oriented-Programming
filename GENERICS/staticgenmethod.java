class staticgenmethod{
    public static void main(String []args){
        printdata(12);
        printdata("Bhavya");

    }
    static<A> void printdata(A data){
        System.out.println(data);
    }
}
// if we create a method a static it became a class level method no it dont need any object to run it