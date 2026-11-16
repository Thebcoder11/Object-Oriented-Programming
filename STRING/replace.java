class replace{
    public static void main(String []args){
        String s1 = "a";
        String s2 = "b";
        System.out.println(s1.replace(s1,s2));
        String s3 = "Hello My name is Bhavya";
        String s4 = "Hello My name is Aaryash";
        System.out.println(s3.replace("Hello","HI"));
        String s5 = "this is bhavya";
        System.out.println(s5.replace("is","was"));
        System.out.println(s5.replaceFirst("is","was"));
        System.out.println(s5.replaceAll("is","was"));
        System.out.println(s5.replaceAll("is(.)","was"));
        System.out.println(s5.replaceAll("is(.*)","was"));

        System.out.println(s4.replaceAll("My(.)","I"));
        // jaha jaha my uske baad kay space remove ho jayenge
        System.out.println(s4.replaceFirst("My(.)","I"));
    }
}
// replace changes all the value and in this regular expression cannot be passed
// replaceAll has regular expression and this make it different from replace
// replaceFirst will change only first value comming