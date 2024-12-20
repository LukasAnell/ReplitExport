class BookListing {
    private Book book;
    private double price;

    public BookListing(Book b, double p) {
        book = b;
        price = p;
    }

    public double getPrice() {
        return price;
    }

    public Book getBook() {
        return book;
    }

    public void printDescription() {
        System.out.println(book.getTitle() + ", written by " + book.getAuthor() + ", $" + getPrice());
    }
}