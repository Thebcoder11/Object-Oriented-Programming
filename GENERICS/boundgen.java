class boundgen{
    public static void main(String[]args){
        boundgen b = new boundgen();
        b.data(12);
        //b.data("bhvaya");

    }
    <A extends Number> void data(A data){
        System.out.println(data);
    }
}