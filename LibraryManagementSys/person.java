abstract class Person {
    private static int userId=0;
    private int id;
    private String phNo;
    private String name; 
    private String userType;
    // private String Address;
    public Person(String phNo, String name, String userType) {
        this.id=++userId;
        this.phNo = phNo;
        this.name = name; 
        this.userType=userType;
    } 

    
}
