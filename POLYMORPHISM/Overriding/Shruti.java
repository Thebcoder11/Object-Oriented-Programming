class Sarthak{
    void person(){ 
        System.out.println("He is a person");
    }
}
class Shruti extends Sarthak{
    void person() throws RuntimeException{
        System.out.println("She is a person");
    }
    public static void main(String[]args) throws RuntimeException{
        Sarthak s = new Sarthak();
        s.person();
        Shruti sr = new Shruti();
        sr.person();
    }
}
// Method overriding 
// and exception handling
// if parent class throws exception child class can show no exception or same exception or subclass exception of it 
// if parent class does not throws any exception child class can only shows exception which are unchecked
// like Arthimetic exception it cant throws checked exception
