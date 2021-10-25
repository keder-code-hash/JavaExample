public class Books {
	int bookId;
	String bookname;
	String author;
	int noOfTitle;
	int purchasedStatus;

	public Books(int bookId, String bookname, String author, int noOfTitle,int purchasedStatus) {
		this.bookId = bookId;
		this.bookname = bookname;
		this.author = author;
		this.noOfTitle = noOfTitle;
		this.purchasedStatus=0;
	}
	
	public void setpurchasedStatus(int status){
		this.purchasedStatus=status;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setNoOfTitle(int noOfTitle) {
		this.noOfTitle = noOfTitle;
	}
}
