import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library Catalog:");

        int number = 1;

        for (Book book : books) {
            System.out.println(
                    number + ". Title: \"" + book.getTitle()
                            + "\", Author: \"" + book.getAuthor()
                            + "\", Year: " + book.getPublicationYear()
            );

            number++;
        }
    }

    public void findBooksByAuthor(String author) {

        System.out.println("Books by Author \"" + author + "\":");

        for (Book book : books) {

            if (book.getAuthor().equals(author)) {
                System.out.println("Title: \"" + book.getTitle() + "\", Year: " + book.getPublicationYear()
                );

            }
        }
    }

    public void borrowBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);

            if (book.getTitle().equals(title)) {
                books.remove(i);
                System.out.println("\"" + title + "\" was borrowed.");
                return;
            }
        }

        System.out.println("\"" + title + "\" is not available.");
    }

    public void returnBook(Book book) {
        books.add(book);
        System.out.println("\"" + book.getTitle() + "\" was returned.");
    }

    public boolean isBookAvailable(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }

        return false;
    }
}