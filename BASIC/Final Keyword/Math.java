// 1 if any variable is final its value  cant be changed
class Math{
    final int a = 10;
    // a = a+20;
    public static void main(String[]args){
        Math m = new Math();
        System.out.println(m.a);
    }
}
// if an instance variable is outside the main class then you need to create an object to use it