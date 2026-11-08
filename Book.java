public class Book {
    private String title;
    private String author;
    private int sn;
    private boolean availability;
    Book(String title,String author,int sn){
        this.title = title;
        this.author = author;
        this.sn = sn;
        this.availability = true;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

    public int getSn() {
        return sn;
    }


    public boolean getAvailability() {
        return availability;
    }
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Serial Number: " + sn);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
        System.out.println("============================");
    }
    public void checkAvailability(int sn) {
        if (availability) {
            System.out.println("The book is available for borrowing.");
        } else {
            System.out.println("The book is currently not available.");
        }
    }
    public boolean borrowBook() {
        if (availability){
            availability=!availability;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean returnBook() {
        if (availability){
            return false;
        }
        else {
            availability=!availability;
            return true;
        }
    }
}
