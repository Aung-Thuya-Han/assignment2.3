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
        System.out.println("Average book rating: " + library.getAverageBookRating());

        Book mostReviewedBook = library.getMostReviewedBook();
        System.out.println("Most reviewed book: " + mostReviewedBook.getTitle());

        User user1 = new User("Alex", 20);
        User user2 = new User("Emma", 22);

        library.addUser(user1);
        library.addUser(user2);

        System.out.println();
        user1.borrowBook(library, book1.getTitle());
        user2.borrowBook(library, book2.getTitle());

        System.out.println();
        library.displayUsers();

        System.out.println();
        user1.returnBook(library, book1.getTitle());
        user2.returnBook(library, book2.getTitle());

        System.out.println();
        library.removeUser("Emma");

        System.out.println();
        library.displayUsers();
    }
}
