class Student{
    String name;
    int roll;
    Student(String name,int roll){
        System.out.println("Parameterized constructor");
        System.out.println(name+" "+roll);
    }
    public static void main(String []args){
        Student s = new Student ("Bhavya",590017668);
        Student s1 = new Student("Shanvi",590017669);
    }
}
// these constructor are created by programmer
// this is parametrized constructor that is how values are passed
