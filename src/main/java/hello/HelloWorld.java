package hello;

public class Greeter {

    public String sayHello() {
        return "Hello world!";
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
