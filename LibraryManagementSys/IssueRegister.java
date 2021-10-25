public class IssueRegister {
    private String issueId;
    private String issuedDate;
    private int issuedTo;
    private int issuedBy;
    private Books books[];
    private Journal journals[];
    private String returnDate;


    
    public IssueRegister(String issueId, String issuedDate, int issuedTo, int issuedBy, Books[] books,
            Journal[] journals, String returnDate) {
        this.issueId = issueId;
        this.issuedDate = issuedDate;
        this.issuedTo = issuedTo;
        this.issuedBy = issuedBy;
        this.books = books;
        this.journals = journals;
        this.returnDate = returnDate;
    }

    
    
}
