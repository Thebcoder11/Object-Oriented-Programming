class methods{
    public static void main(String []args){
        String s1 = "Bhavya";
        String s2 = "bhavya";
        //Boolean s = s1.equals(s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        String s3="";
        System.out.println(s3.equals("")); 
        // equals is also used to check whether a string is empty or not
        String s4 = "a";
        String s5 = "A";
        System.out.println(s4.compareTo(s5));
        System.out.println(s4.compareToIgnoreCase(s5));
        System.out.println(s1.compareTo("")); // length of the string
        String s6 = "abc";
        String s7 = "aab";
        System.out.println(s6.compareTo(s7));
        // if first character is found same then next charcter are checked
        // if in the first go only two character are different if will return the lexical value
        // it will not check further
    }
}
// equals() - boolean
// equalsIgnoreCase() - boolean
// compareTo() - int 
// compareToIgnoreCase() - int