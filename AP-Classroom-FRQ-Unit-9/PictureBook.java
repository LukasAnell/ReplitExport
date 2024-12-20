public class PictureBook extends Book {
    private String illustrator;

    public PictureBook(String t, String a, String i) {
        super(t, a);
        illustrator = i;
    }

    public String getIllustrator() {
        return illustrator;
    }

    public void printBookInfo() {
        System.out.println(getTitle() + ", written by " + getAuthor() + " and illustrated by " + getIllustrator());
    }
}