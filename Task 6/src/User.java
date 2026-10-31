import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void borrowBook(Library library, String title) {
        Book book = library.borrowBook(title);

        if (book != null) {
            borrowedBooks.add(book);
        }
    }

    public void returnBook(Library library, String title) {
        for (int i = 0; i < borrowedBooks.size(); i++) {
            Book book = borrowedBooks.get(i);

            if (book.getTitle().equals(title)) {
                borrowedBooks.remove(i);
                library.returnBook(book);
                return;
            }
        }

        System.out.println(name + " has not borrowed \"" + title + "\".");
    }

    public void displayBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("Borrowed books: None");
            return;
        }

        System.out.println("Borrowed books:");

        for (Book book : borrowedBooks) {
            System.out.println("- " + book.getTitle());
        }
    }
}
