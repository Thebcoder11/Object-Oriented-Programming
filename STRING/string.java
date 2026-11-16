public final class string extends Object {
    public static void main(String [] args){
        String s = new String(); // no argument constructor
        System.out.println(s);
        String s1 = new String("Bhavya");
        String s2 = new String (s1);
        System.out.println(s1 == s2); // reference address got checked
        System.out.println(s1.equals(s2)); // actual value got checked

        System.out.println(s1);
        System.out.println(s2);

        String s3 = "Rahul";
        String s4 = new String(s3);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s4.length());

        // stringbuffer and stringbuilder are mutable
        StringBuffer s5 = new StringBuffer("Nisha"); 
        StringBuilder s6 = new StringBuilder("Aaryash");
        s6.append("Yadav");
        System.out.println(s5);
        System.out.println(s6);

        char [] ch = new char[]{'a','b','c'};
        System.out.println(ch);
        String s8 = new String(ch);
        byte [] ch1 = new byte[]{'1','0','1'};
        String s7 = new String(ch1);
        System.out.println(ch1); // in character array string actual value never got display
        System.out.println(s7);
        byte [] ch2 = new byte[]{101,102,103};
        String s9 = new String(ch2);
        System.out.println(s9);
    }  
}
// but if it is stored in the string its value got print 
// string are stored in heap memory and also in string constant pool
// so string constant pool values never goes to garbage collector
// so our password can be hacked so it is always stored in char instead of arr