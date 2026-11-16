class Bird{
    String color;
    int age;
    public void detail(String c,int a){
        color = c;
        age = a;
    }
    public void display(){
        System.out.println(color+" "+age); 
    }
    public static void main(String []args){
        Bird sp = new Bird();
        sp.detail("white",20);
        sp.display();
    }
}
// variable initialization
// by using method