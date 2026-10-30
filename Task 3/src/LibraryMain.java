public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book(
                "Introduction to Java Programming",
                "John Smith",
                2020
        );

        Book book2 = new Book(
                "Data Structures and Algorithms",
                "Jane Doe",
                2018
        );

        Book book3 = new Book(
                "The Art of Fiction",
                "Alice Johnson",
                2019
        );

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        System.out.println();

        Book borrowedBook = book2;

        boolean availableBeforeBorrowing =
                library.isBookAvailable(borrowedBook.getTitle());


        library.borrowBook(borrowedBook.getTitle());

        boolean availableAfterBorrowing =
                library.isBookAvailable(borrowedBook.getTitle());

        System.out.println(
                "Available after borrowing: "
                        + availableAfterBorrowing
        );

        System.out.println();
        library.displayBooks();

        System.out.println();
        library.returnBook(borrowedBook);

        boolean availableAfterReturning =
                library.isBookAvailable(borrowedBook.getTitle());

        System.out.println(
                "Available after returning: "
                        + availableAfterReturning
        );

        System.out.println();
        library.displayBooks();
    }
}