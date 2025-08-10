class library{
    String[] book;
    int no_of_book;
    library(){
        this.book = new String[100];
        this.no_of_book = 0; 
    }
    void addBook(String book){
        this.book[no_of_book] = book;
        no_of_book++;
        System.out.println(book+"book has been added");
    }
    void showAvailableBook(){
        for (String book : book) {
            if(book == null){
                continue;
            }
            System.out.println("*"+book);
        }
    }
    void issuedBook(String book){
        for(int i=0;i<book.length();i++){
            String b = this.book[i];
            if(b==book){
                System.out.println("book has been issued");
                this.book[i]=null;
                return;
            }
            System.out.println("*"+book);
        }
        System.out.println("this book is not exist");
    }
    void returnBook(String book){
        addBook(book);
    }
}
public class cwh_51_exersize04 {
    public static void main(String[] args) {
        // implement the library using java class library
        // methods : addBook, issuedBook, returnBook,etc
        // properties Array to stored avialable book
        // Array to store issued books
        library l = new library();
        l.addBook("think the thougths ");
        l.addBook("c++");
        l.addBook("algorithm");
        l.showAvailableBook();
        l.issuedBook("c++");
        l.returnBook("c++");
        l.showAvailableBook();
    }
    
}
