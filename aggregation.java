class Address{
    String houseNo;
    String city;
    String country;
public Address(String houseNo, String city, String country ){
this.houseNo = houseNo;
this.city = city;
this.country = country;
}
}
class Employee{
    String name;
    Address address;

public Employee(String name, Address address){
    this.name = name;
    this.address = address;
}
public void displayDetails(){
    System.out.println(address.houseNo + address.city + address.country );
}
}
public class aggregation {
    public static void main(String[] args) {
        Address a1 = new Address("h10 ", " patna ", " india");
        Employee e1 = new Employee("rahul", a1);
        e1.displayDetails();
    }
}
