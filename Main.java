import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String option ="";
        String mName;
        int id;
        String bName;
        String author;
        int sn;
        Library myLibrary = new Library(500,100);
        while (!option.equals("exit")) {
            System.out.println("============================");
            System.out.println("new member\nnew book\nborrow book\nreturn book\ndisplay my info\ndisplay all books\nsearch for book\nexit");
            System.out.print("Enter your option: ");
            option =input.nextLine().toLowerCase();
            switch (option){
                case "new member":
                    System.out.print("Enter your name: ");
                    mName = input.nextLine();
                    System.out.print("Enter your id: ");
                    id = input.nextInt();
                    input.nextLine();
                    Member member = new Member(mName,id);
                    myLibrary.addMember(member);
                    break;
                case  "new book":
                    System.out.print("Enter book title: ");
                    bName = input.nextLine();
                    System.out.print("Enter book Author: ");
                    author = input.nextLine();
                    System.out.print("Enter book serial number: ");
                    sn = input.nextInt();
                    input.nextLine();
                    Book book = new Book(bName,author,sn);
                    myLibrary.addBook(book);
                    break;
                case "borrow book":
                    System.out.print("Enter your ID: ");
                    id = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter the book serial number: ");
                    sn = input.nextInt();
                    input.nextLine();
                    myLibrary.addBorrowed(myLibrary.getBook(sn),myLibrary.getMember(id));
                    break;
                case "return book":
                    System.out.print("Enter your ID: ");
                    id = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter the book serial number: ");
                    sn = input.nextInt();
                    input.nextLine();
                    myLibrary.removeBorrowed(myLibrary.getBook(sn),myLibrary.getMember(id));
                    break;
                case "display my info":
                    System.out.print("Enter your ID: ");
                    id = input.nextInt();
                    input.nextLine();
                    myLibrary.getMember(id).displayInfo();
                    break;
                case "display all books":
                    myLibrary.libraryDetails();
                    break;
                case "search for book":
                    System.out.print("Enter book serial number: ");
                    sn = input.nextInt();
                    input.nextLine();
                    myLibrary.getBook(sn).displayBookDetails();
                    break;
                case "exit":
                    System.out.println("Good bye");
                    break;
                default:
                break;
            }
        }
    }
}