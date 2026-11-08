public class Member {
    private String name;
    private int id;
    private Book[] borrowed;
    Member(String name, int id){
        this.name = name;
        this.id = id;
        borrowed = new Book[10];
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setBorrowed(Book[] borrowed) {
        this.borrowed = borrowed;
    }

    public Book[] getBorrowed() {
        return borrowed;
    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Your books details:");
        System.out.println("============================");
        for (int i=0 ; i< borrowed.length ;i++ ){
            if (borrowed[i]!=null) {
                System.out.println("Book " + i + ":");
                borrowed[i].displayBookDetails();
                System.out.println("============================");
            }
        }
    }

}
