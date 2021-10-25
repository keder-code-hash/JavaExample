public class TestMain {
    
    public static void main(String[] args) {
        Students students[]=new Students[20];
        Teachers teachers[]=new Teachers[20];
        Library libr=Library.getLibrary();

        // create an instance of Librarian
        Librarian librarian=new Librarian("123456","abc def");

        // add some books
        
        // add some journals

        // issue books or journal
        Books books[]=new Books[10];
        Journal jornals[]=new Journal[10];
        books[0]=1;
        books[1]=2;
        librarian.issueItemsStudent(students[1],books,libr);

    }
}
