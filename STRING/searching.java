class searching{
    public static void main(String []args){
        String s1 = "Bhavya";
        System.out.println(s1.indexOf("a"));
        System.out.println(s1.lastIndexOf("a"));
        System.out.println(s1.charAt(4));
        System.out.println(s1.contains("h"));
        System.out.println(s1.startsWith("B"));
        System.out.println(s1.endsWith("y"));

        System.out.println(s1.indexOf("r"));
        // if this character is not present it will return -1
        System.out.println(s1.indexOf("av"));
        System.out.println(s1.lastIndexOf("ya"));
    }
}
// indexOf input - char output - integer
// lastIndexOF input - string/char output - integer
// charAt input - index , output - string
// contains input - string/char, output - boolean true / false
// startsWith input - strin/char , output - boolean 
// endsWith input -string/char , output - boolean
