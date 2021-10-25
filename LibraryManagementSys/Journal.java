public class Journal extends Items{ 
    private int issueNumber;
    private String dateOfPublish;
    private int vloumeNo;



    public Journal(int issueNumber, String dateOfPublish, int vloumeNo,String itemName, int noOfCopies, String authors) {
        super(itemName,noOfCopies,authors,"journal");
        this.issueNumber = issueNumber;
        this.dateOfPublish = dateOfPublish;
        this.vloumeNo = vloumeNo;
    }

    public String getJName(){
        return this.jName;
    }
    
    public String getIssueNumber(){
        return this.issueNumber;
    } 
    public String dateOfPublish(){
        return this.dateOfPublish;
    }
}
