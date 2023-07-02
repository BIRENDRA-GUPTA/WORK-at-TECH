interface driving {
    void startEngine();
    void applyBreak();
}
class Car implements driving{
public void startEngine(){
System.out.println("engine started");
}
public void applyBreak(){
System.out.println("Break applied");
}
}
public class interfacee {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.applyBreak();
        c1.startEngine();
    }
}
