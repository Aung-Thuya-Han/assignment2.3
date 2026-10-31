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

        book1.setRating(4.5);
        book1.addReview("A useful book for learning Java.");
        book1.addReview("The examples are easy to understand.");

        book2.setRating(4.0);
        book2.addReview("A good introduction to algorithms.");

        book3.setRating(4.8);
        book3.addReview("An interesting book.");

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        System.out.println();

        Book borrowedBook = book2;

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

        System.out.println();
        System.out.println("Book: " + book1.getTitle());
        System.out.println("Rating: " + book1.getRating());
        System.out.println("Reviews: " + String.join(", ", book1.getReviews()));

        System.out.println();
        System.out.println("Average book rating: " + library.getAverageBookRating());

        Book mostReviewedBook = library.getMostReviewedBook();
        System.out.println("Most reviewed book: " + mostReviewedBook.getTitle());
    }
}
