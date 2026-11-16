class stringadd{
    public static void main(String [] args){
        String s1 = "Bhavya";
        String s2  = " Yadav";
        System.out.println(s1+s2);//Bhavya
        System.out.println(s1+10);// Bhavya10
        System.out.println(s1+10+20); //Bhavya1020
        System.out.println(10+s1+20); //10Bhavya20
        System.out.println(s1+2*100); // here bodmas will happen first Bhavya200
        System.out.println(s1+200/100); //Bhavya2
        // System.out.println(s1+10-5); error will generate
        System.out.println("Concat method : "+s1.concat(s2));
        System.out.println(String.join(" ",s1,s2));
        System.out.println(String.join(".",s1,s2));
        System.out.println(s1.subSequence(0,6));
        System.out.println(s2.subSequence(0,4));
        System.out.println(s1.substring(0)); // it will print till the last index 
        System.out.println(s1.substring(0,4));

    }
}
// delimeter and string elements can be null