class method{
    public static void main(String []args){
        String name = "Bhavya";
        int a = name.length();
        System.out.println("Length of the String is : "+a);
        Boolean b = name.isEmpty();
        System.out.println("Is the String is Empty : "+b);
        String ny = name.trim();
        System.out.println("After remove the space the string is : "+ny);
        String name1 = null;
        try{
            System.out.println("length of the string : " +name1.length());
        }
        catch (NullPointerException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Exception Handled Successfully");
        }
        String name2 = null;
        try{
            System.out.println("Is the String Empty : "+name2.isEmpty());
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Exception handled");
        }
        String name3 = "     Bhavya    Yadav     ";
        System.out.println("Length of the String : "+name3.length());
        System.out.println("Is the given string is Empty : "+name3.isEmpty());
        System.out.println("After triming the length of the string : "+name3.trim().length());
        System.out.println("After trimming is the string is empty :"+name3.trim().isEmpty());

        String name4 = "   ";
        System.out.println("length of the string : "+name4.length());
        System.out.println("Is the string empty : "+name4.isEmpty());
        System.out.println("after trimming the length of the string : "+name4.trim().length());
        System.out.println("After trimming is the length of the string is Empty : "+name4.trim().isEmpty());
    }
}
// is any string is assigned with null value it will generate an exception
// name.length() - integer return
// name.isEmpty() - boolean return
// name.trim() - string return