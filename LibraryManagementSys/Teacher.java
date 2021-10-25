public class Teacher extends Person{
    private String sub;
    private String dept;
    public Teacher(String name,String dept,String phNo,String sub){
        super(name,phNo,"faculty");
        this.sub=sub;
        this.dept=dept;
    }
}
