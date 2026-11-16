class stringbul{
    public static void main(String []args){
        StringBuilder sb = new StringBuilder("Bhavya");
        System.out.println(sb.capacity()); // 16 + 6 = 22

        StringBuilder sb1 = new StringBuilder ();
        System.out.println(sb1.capacity());
        sb1.append("Bhavya");
        System.out.println(sb1.capacity());

        sb1.append(" Daughter of Rahul Yadav");
        System.out.println(sb1.capacity());
        // now capacity will increase (size+1)*2 =16+1 = 17*2 = 34
        // or another way is (16*2)+2 = 34

        sb1.ensureCapacity(100);
        System.out.println("After defining the particular capacity "+sb1.capacity());
        sb1.trimToSize();
        System.out.println(sb1.capacity());

        StringBuffer sb2 = new StringBuffer("Rahul Yadav");
        System.out.println(sb2.indexOf("a"));
        System.out.println(sb2.lastIndexOf("v"));
        System.out.println(sb2.charAt(3));

        System.out.println(sb2.substring(2,5));
        System.out.println(sb2.substring(0));
        System.out.println(sb2.subSequence(2,4));

        System.out.println("After Deletion : "+sb2.delete(1,2));
        System.out.println("After inserting : "+sb2.insert(1,"a"));

        System.out.println(sb2.deleteCharAt(1));
        System.out.println(sb2.insert(1,"a"));
        System.out.println(sb2.delete(0,5));
        System.out.println(sb2.insert(0,"Rahul"));

        System.out.println(sb2.reverse());
        System.out.println(sb2.reverse());
        
        sb2.setLength(5);
        System.out.println(sb2);
        StringBuilder sb3 = new StringBuilder("Aaryash ");
        StringBuilder sb4 = sb3.append(" Yadav");
        System.out.println(sb3.equals(sb4));
        // here equals checks the oject address whether the address of the given strings are same or not
        StringBuilder sb5 = new StringBuilder("Nisha");
        StringBuilder sb6 = new StringBuilder("Nisha");
        System.out.println(sb5.equals(sb6)); // false


        sb6.setCharAt(1,'a');
        System.out.println("\n "+sb6);
        sb6.replace(1,2,"i");
        System.out.println(sb6);
    }
}
// here stringBuilder have a non synchronized method so it need less memory as comapred to 
// stringBuffer , stringBuffer has Sysnchronized method it will lead to delay as one thread 
// will run at one time it require more security 
// the only difference between is this only
// stringBuffer - Synchronized
// stringBuilder - non - Synchronized