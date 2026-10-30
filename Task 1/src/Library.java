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
        System.out.println();
        System.out.println("Books by Author \"" + author + "\":");

        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(
                        "Title: \"" + book.getTitle()
                                + "\", Year: " + book.getPublicationYear()
                );
            }
        }
    }
}