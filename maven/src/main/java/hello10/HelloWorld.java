package hello10;
import org.joda.time.LocalTime;

public class HelloWorld{
    public static void main(String[] args){
        LocalTime currentTime = new LocalTime();
        System.out.println("La hora actual es: " + currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}