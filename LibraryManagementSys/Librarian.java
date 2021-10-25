public class Librarian extends person{ 

    Librarian(String phNo, String name){
        super(phNo,name,dept,"librarian");
    }

    private static void issueItemsStudent(Student stnd,Book books[],Library libr){
        // check for fine against the user

        // if no fine, search for issed book copies,if available issue it to user
        
        // check no Of Items issued against proper user

        // decrease no of Copies of items

        // update issue register finally

        // generate transaction slip
    }
    private static void issueItemsFaculty(Teacher teacher,Book books[],Journal jrnl[],Library libr){

    }
    private static int makeFine(float fineAmount){
        // set fine amount against user(student).If any previous fine exist,add up.
        // for late return Rs.@1/day
    }
    private static void addBook(Libr libr,Books book){

    }
    private static void addJournel(Libr libr,Journel jrnl){

    }

}
