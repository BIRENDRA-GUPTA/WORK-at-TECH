public class object_and_class {
    public static void main(String[] args) {
        System.out.println("class example");
        Rahul ra = new Rahul();
        ra.getData();
        ra.getName();
        ra.printName();
    }
}
class Rahul{
    String name = "Biru";
void getData(){
    System.out.println("my name is rahul");
}
String getName(){
    return this.name;
}
void printName(){
    System.out.println(this.name);
}
}