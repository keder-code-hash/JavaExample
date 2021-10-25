abstract class Items {
    private static int _id=0;
    private int id;
    private String itemName;
    private int noOfCopies;
    private String authors;
    private String itemType;

    public Items(String itemName, int noOfCopies, String authors,String itemType) {
        this.id = ++_id;
        this.itemName = itemName;
        this.noOfCopies = noOfCopies;
        this.authors = authors;
        this.itemName=itemType;
    }

    
}
