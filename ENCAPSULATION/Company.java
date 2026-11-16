class Employee {
    private int emp_id;

    public void setEmp_id(int id) {
        emp_id = id;
    }

    public int getEmp_id() {
        return emp_id;
    }
}

class Company {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmp_id(101);
        System.out.println(e.getEmp_id());
    }
}