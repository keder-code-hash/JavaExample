public class Students extends Person{
    private String subs[];
    private float fine;
    public Students(String name,String dept,String phNo,String subs[]){
        super(name,phNo,"student");
        this.subs=subs;
    }

    public void setFine(float fineAmount){
        fine=fineAmount;
    }

    public float getFine(){
        return fine;
    }
}
