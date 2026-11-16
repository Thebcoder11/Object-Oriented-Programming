// static keyword is used for memory management
class Employee{
    int empid;
    String name;
    // String Company_name;
    static String Company_name ="SP";
    Employee(int empid,String name){
        this.empid=empid;
        this.name = name;
    }
    public void display(){
        System.out.println(empid+" "+name+" "+Company_name);
    }
    public static void main(String []args){
        Employee e1 = new Employee(1,"Bhavya");
        e1.display();
        Employee e2 = new Employee(2,"Dileep");
        e2.display();
    }
}
// again again memory is assigned to comapny name and the value is same4
// so to avoid this we use static
// object store in heap 
// static keyword use the memory of the clas or the method