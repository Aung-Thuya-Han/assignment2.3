import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

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
                System.out.println(
                        "Title: \"" + book.getTitle()
                                + "\", Year: " + book.getPublicationYear()
                );
            }
        }
    }

    public Book borrowBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);

            if (book.getTitle().equals(title)) {
                books.remove(i);
                System.out.println("\"" + title + "\" was borrowed.");
                return book;
            }
        }

        System.out.println("\"" + title + "\" is not available.");
        return null;
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

    public double getAverageBookRating() {
        if (books.isEmpty()) {
            return 0.0;
        }

        double totalRating = 0.0;

        for (Book book : books) {
            totalRating = totalRating + book.getRating();
        }

        return totalRating / books.size();
    }

    public Book getMostReviewedBook() {
        if (books.isEmpty()) {
            return null;
        }

        Book mostReviewedBook = books.get(0);

        for (Book book : books) {
            if (book.getReviews().size() > mostReviewedBook.getReviews().size()) {
                mostReviewedBook = book;
            }
        }

        return mostReviewedBook;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(String name) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);

            if (user.getName().equals(name)) {
                users.remove(i);
                System.out.println(name + " was removed from the library.");
                return;
            }
        }

        System.out.println(name + " was not found.");
    }

    public User findUser(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }

        return null;
    }

    public void displayUsers() {
        System.out.println("Library Users:");

        for (User user : users) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
            user.displayBorrowedBooks();
            System.out.println();
        }
    }
}
