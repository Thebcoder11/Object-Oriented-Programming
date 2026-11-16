// 1 this keyword is used to current class instance method
class Vehicle{
    String car_name;
    public void car(String car_name){
        this.car_name = car_name;
    }
    public void show(){
        System.out.println(car_name);
    }
    public static void main(String[]args){
        Vehicle v = new Vehicle();
        v.car("Mercedes");
        v.show();
    }
}