class Engine{
    String name = "v8";
void start(){
System.out.println("engine started");
}
}
class Car extends Engine{

}
public class inheritance {
    public static void main(String[] args) {
        Car e = new Car();
        e.start();
    }
}
