public class Library {
    private static Library libr;
    Journal jrnl[];
    Books books[];
    IssueRegister isr[];


    public Library(int jrnlNo, int bookNo) {
        this.jrnl = new Journal[jrnlNo];
        this.books = new Books[bookNo];
        this.isr = isr;
    }

    public static Library getLibrary(){
        if(libr==null){
            return new Library(20,40);
        }
        else{
            System.out.println("Multiple Instances cannot be created.");
        }
    }
}
