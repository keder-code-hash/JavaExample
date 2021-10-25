public class IssueRegister {
    private String issueId;
    private String issuedDate;
    private Students student;
    private Teacher teacher;
    private int issuedBy;
    private Books books[];
    private Journal journals[];
    private String returnDate;
    private String userType;


    public IssueRegister(String issueId, String issuedDate, Students student, int issuedBy, Books[] books,
            Journal[] journals, String returnDate) {
        this.issueId = issueId;
        this.issuedDate = issuedDate;
        this.student = student;
        this.issuedBy = issuedBy;
        this.books = books;
        this.journals = journals;
        this.returnDate = returnDate;
        this.userType="S";
    }
    public IssueRegister(String issueId, String issuedDate, Teacher teacher, int issuedBy, Books[] books,
    Journal[] journals, String returnDate) {
        this.issueId = issueId;
        this.issuedDate = issuedDate;
        this.student = student;
        this.issuedBy = issuedBy;
        this.books = books;
        this.journals = journals;
        this.returnDate = returnDate;
        this.userType="T";
    }
    
    
}
