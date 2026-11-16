class PriyaCase{
    public static void main(String []args){
        String s1 = "Bhavya";
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        System.out.println(s1+s2);
        char [] ch = s1.toCharArray();
        System.out.println("The string converted into array : "+ch);
    }
}
// toCharArray = convert the string into character array
// toLowerCase = convert the string into lowercase
// toUpperCase = convert the string into uppercase
// String.value.Of(a) = convert the given datatype into string