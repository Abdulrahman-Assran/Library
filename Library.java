public class Library {
    private Book[] books;
    private Member [] members;
    Library(int bookCapacity,int memberCapacity ){
        books = new Book[bookCapacity];
        members = new Member[memberCapacity];
    }
    public void addMember(Member member){
        for (int i=0 ; i<members.length;i++){
            if (members[i]==null){
                members[i] = member;
                System.out.println("Member added successfully");
                break;
            }
        }
    }
    public void addBook(Book book){
        for (int i=0 ; i<books.length;i++){
            if (books[i]==null){
                books[i] = book;
                System.out.println("Book added successfully");
                break;
            }
        }
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Book getBook (int sn){
        for (int i = 0; i< books.length; i++){
            if (books[i]!=null && books[i].getSn()==sn){
                return books[i];
            }
        }
        return null;
    }

    public void setMembers(Member[] members) {
        this.members = members;
    }

    public Member getMember (int id){
        for (int i = 0; i< members.length; i++){
            if (members[i]!=null && members[i].getId()==id){
                return members[i];
            }
        }
        return null;
    }
    public void addBorrowed(Book book,Member member){
        for (int i=0 ; i<member.getBorrowed().length; i++){
            if (member.getBorrowed()[i]==book){
                System.out.println("You have this book already");
               return;
            }
        }
        if (!book.getAvailability()){
            System.out.println("The book is already taken");
            return;
        }
        for (int j=0 ; j<member.getBorrowed().length; j++) {
            if (member.getBorrowed()[j] == null) {
                book.borrowBook();
                member.getBorrowed()[j] = book;
                System.out.println("You got the book");
                return;
            }
        }
        System.out.println("You can't borrow over than 10 books");
    }
    public void removeBorrowed(Book book,Member member){
        for (int i=0 ; i<member.getBorrowed().length; i++){
            if (member.getBorrowed()[i]==book){
                member.getBorrowed()[i] = null;
                book.returnBook();
                System.out.println("Book removed successfully");
                return;
            }
        }
        System.out.println("You don't have this book");
    }
    public void libraryDetails(){
        for (int i = 0; i < books.length ; i++) {
            if(books[i]!=null) {
                System.out.println("Book " + i + ":");
                books[i].displayBookDetails();
            }
        }
    }
}
