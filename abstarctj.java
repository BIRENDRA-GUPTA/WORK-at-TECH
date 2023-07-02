abstract class Android{
    void goodFeature(){
        System.out.println("Android os is good feature");
    }
    abstract void makeYourUi();
}
class AnySmartPhone extends Android{
    void makeYourUi(){
        System.out.println("smartphone company has own os");
    }
}
public class abstarctj {
    public static void main(String[] args) {
        AnySmartPhone a1 = new AnySmartPhone();
        a1.makeYourUi();
        a1.goodFeature();
    }
}
