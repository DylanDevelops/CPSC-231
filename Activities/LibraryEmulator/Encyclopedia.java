public class Encyclopedia extends Book {
    private String edition;
    private int numPages;

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getEdition() {
        return this.edition;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public int getNumPages() {
        return this.numPages;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("   Edition: " + this.edition);
        System.out.println("   Number of Pages: " + this.numPages);
    }
}