class Book {
    static int totalBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    static {
        totalBooks = 0;
    }
    { // object initializer
        totalBooks++;
    }

    Book( String isbn , String title , String author ) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn) {
        this(isbn, "unkown" , "unkown");
    }

    static int getTotalBook(){
        return totalBooks;
    }

    void borrowBook(){
       if (isBorrowed){
           System.out.println("Book is already borrwed");
       }else{
           this.isBorrowed = true;
           System.out.println("Enjoy" + this.title);
       }
    }

    void returnBook(){
        if (isBorrowed){
            this.isBorrowed = false;
            System.out.println("Hope You enjoyed the book");
        } else {
            System.out.println("This book is already in library ");
        }
    }
    public static void main(String[] args) {
        Book designOfThings = new Book("1", "Design", "Author");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalBook());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
        myBook.returnBook();
    }
}

