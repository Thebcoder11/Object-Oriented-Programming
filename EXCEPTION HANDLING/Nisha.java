class Nisha{
    public static void main(String []args){
        try {
        int a = 10,b =0,c;
        c=a/b;
        System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("I m in the Finallu block");
        }
    }
}
// finally can be only one
// it will always run no matter what whether an exception has occured or not
// catch can be multiple in single try method
// if System.exit(0) then finally block will not run
// death thread
// fatal error
// exception in the finally block
// even after the jump statement finally block will run
// if try - catch - finally are there and excpetion occured then first try - catch - finally will run
// if catch block is not there and error occured then try - finally block will run and complier will throw exception after finally block
// finally block cant run alone it need try