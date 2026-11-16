class Stringbuf{
    public static void main(String []args){

        StringBuffer sb = new StringBuffer("Bhavya"); // 16+6 =22
        System.out.println("The capacity of the string : "+sb.capacity());

        StringBuffer sb1 = new StringBuffer(); // 16 predefined 
        sb1.append("Aaryash"); 
        System.out.println("After appending : "+sb1.capacity());

        String s = new String("Bhavya ");
        s.concat("Rahul");
        System.out.println(s); // no change will be detected
        System.out.println(s.concat("Rahul"));

        // StringBuffer size exceeded
        StringBuffer sb2 = new StringBuffer();
        sb2.append("Bhavya Yadav ");
        System.out.println("Before Capacity : "+sb2.capacity());
        sb2.append("Aaryash Yadav ");
        System.out.println("After Capacity : "+sb2.capacity());
        // the formula for capacity is size*2 +2
        // or (size+1)*2 = 16+1 = 17*2 = 34

        // Methods of String buffer 
        System.out.println("\n");
        StringBuffer sb3 = new StringBuffer("Nisha Yadav");
        System.out.println("length of the string : "+sb3.length());
        System.out.println("index of the particular character : "+sb3.indexOf("s"));
        System.out.println("character at particular index : "+sb3.charAt(2));
        System.out.println("last index of this character : "+sb3.lastIndexOf("a"));
        System.out.println("delete the character at this index : "+sb3.deleteCharAt(3));
        System.out.println("delete the character from this to this string "+sb3.delete(3,7));

        StringBuffer sb4 = new StringBuffer("Nisha Yadav ");
        sb4.append("Hi");
        System.out.println(sb4);
        StringBuffer sb5 = sb4.append(""); // most important part
        System.out.println(sb5);
        System.out.println(sb4.equals(sb5));

        // string doesnot override the object class equals method 
        // this equals method checks only address of the given input 
        // if they are same output will be true
        // otherwise false

        StringBuffer sb6 = new StringBuffer("Gaurav Yadav");
        StringBuffer sb7 = new StringBuffer("Gaurav Yadav");
        System.out.println(sb6.equals(sb7)); // false even if the both strings are same
        sb7 = null;
        System.out.println(sb7);
        StringBuffer sb8 = sb6.append("Hi");
        System.out.println(sb6.equals(sb8)); // true

        StringBuffer sb9 = new StringBuffer("Adhya");
        sb9.insert(5,"Y");
        System.out.println(sb9);
        sb9.insert(0,"A");
        System.out.println(sb9);
        sb9.insert(7,"adav");
        System.out.println(sb9);

        System.out.println("\n");
        StringBuffer sb10 = new StringBuffer("Vivaan Yadav");
        sb10.replace(1,2,"a");
        System.out.println(sb10);
        System.out.println(sb10.substring(0));
        System.out.println(sb10.substring(0,5));
        System.out.println(sb10.subSequence(3,5));
        System.out.println(sb10.replace(1,2,"i"));
        System.out.println(sb10);
        System.out.println("\n");
        StringBuffer sb11 = new StringBuffer("Bhavya");
        System.out.println(sb11.capacity());
        sb11.ensureCapacity(100);
        System.out.println(sb11.capacity());
        sb11.trimToSize();
        System.out.println(sb11.capacity());
        sb11.reverse();
        System.out.println(sb11);

        System.out.println("\n");
        StringBuffer sb12 = new StringBuffer("Rahul Yadav");
        sb12.setCharAt(1 ,'r');
        System.out.println(sb12);
        sb12.setCharAt(1,'a');
        System.out.println(sb12);
        sb12.setLength(5);
        System.out.println(sb12);
    }
}
// string - non synchronized
// stringbuffer - synchronized
// stringbuilder - non synchronized
// the object created by stringbuffer is mutable 
// as new value is added into it only no new memory is assigned to it
// string are immutable if we want to concate it , it will make a new object
// it will not change the previous string value 
// string - concat 
// StringBuffer - append

// sb.ensureCapacity();
// sb.replace(1,2,'b');
// sb.equals(s2);
// sb.append("hi");
// sb.trimToSize();
// sb.deleteCharAt();
// sb.delete(3,6);
// sb.indexOf();
// sb.lastIndexOf();
// sb.charAt();
// sb.setlength();
// sb.setCharAt(2,'a');
// sb.substring(2);
// sb.substring(2,5);
// sb.subSequence(3,8);
// sb.capacity();
// sb.length();