public class Employee{
    int id;  
    String name;  
    Address address;
    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    @Override
    public String toString() {
        return "Employee [address=" + address + ", id=" + id + ", name=" + name + "]";
    }  

    public static void main(String[] args){
        Address ad=new Address("gzb","UP","india");
        Employee emp1=new Employee(1, "Ram", ad);
        System.out.println(emp1.toString());
    }
}
