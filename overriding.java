class User{
    void getLogin(){
        System.out.println("user login");
    }
}
class Client extends User {
    void getLogin(){
        System.out.println("client login");
    }
}
public class overriding {
    public static void main(String[] args) {
// User c1 = new User();
// c1.getLogin();
Client d1 = new Client();
d1.getLogin();
    }
}
