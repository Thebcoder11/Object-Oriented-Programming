// 4 this keyword is used as argument in method call
class Student{
    public void detail(Student a){
        System.out.println("Student detail");
    }
    public void teacher(){
        detail(this);
    }
    public static void main(String []args){
        Student s = new Student();
        s.teacher();
    }
}
