public class ManageBooks {
	int bookNo;
	Books bookList[];
	
	public ManageBooks(int bookNo) {
		this.bookNo=bookNo;
		this.bookList=new Books[bookNo];
		for(int i=0;i<bookNo;i++) {
			Books newBook=new Books(i,"book"+i,"author"+i,4,0);
			this.bookList[i]=newBook;
		}
	}
	
	//constructor for purchasing a new book which is not purchased earlier
	public ManageBooks(ManageBooks purBook,String bookName) {
		for(int i=0;i<purBook.bookNo;i++) {
			if(purBook.bookList[i].bookname.equals(bookName)) {
					if(purBook.bookList[i].purchasedStatus==0 && purBook.bookList[i].noOfTitle>0){
						System.out.println(bookName+" purchased successfully!");
						purBook.bookList[i].setpurchasedStatus(1);
						purBook.bookList[i].setNoOfTitle(purBook.bookList[i].noOfTitle-1);
					}
					else if(purBook.bookList[i].noOfTitle <= 0){
						System.out.println(bookName+" not available");
					}
					else{
						System.out.println(bookName+" already purchased");
					}
				break;
			}
		}
	}
	
	//constructor for purchasing a book from existing book title
	public ManageBooks(String bookName,ManageBooks purBook) {
		for(int i=0;i<purBook.bookNo;i++) {
			if(purBook.bookList[i].bookname.equals(bookName)) {	
				if(purBook.bookList[i].noOfTitle>0){
					System.out.println(bookName+" purchased successfully!");
					purBook.bookList[i].setpurchasedStatus(1);
					purBook.bookList[i].setNoOfTitle(purBook.bookList[i].noOfTitle-1);
				}
				else{
					System.out.println("not available ");
				}
				break;
			}
		}
	}
	public static void main(String args[]) {
		ManageBooks allBook=new ManageBooks(5);
		ManageBooks purchase=new ManageBooks(allBook,"book2");
		//ManageBooks purchase1=new ManageBooks(allBook,"book2",1);
		ManageBooks purchase2=new ManageBooks("book2",allBook);
		ManageBooks purchase8=new ManageBooks("book2",allBook);
		ManageBooks purchase12=new ManageBooks("book2",allBook);
		ManageBooks purchase22=new ManageBooks("book2",allBook);
		ManageBooks purchase32=new ManageBooks("book2",allBook);/*
		ManageBooks purchase3=new ManageBooks(allBook,"book2");
		ManageBooks purchase4=new ManageBooks(allBook,"book2");
		ManageBooks purchase5=new ManageBooks(allBook,"book2");
		ManageBooks purchase6=new ManageBooks(allBook,"book2");*/
		
		/*for(int i=0;i<5;i++){
			System.out.println("Book purchased Status: "+allBook.bookList[i].purchasedStatus+'\n');
		}*/
	}
	
}
