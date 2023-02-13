 
 public class Book {

    private String mame;
    private Author Author;
    private double price;
    private int qty;


    public Book(String mame, Author Author, double price, int qty) {
        this.mame = mame;
        this.Author = Author;
        this.price = price;
        this.qty = qty;
    }

    public String getMame() {
        return this.mame;
    }

    public void setMame(String mame) {
        this.mame = mame;
    }

    public Author getAuthor() {
        return this.Author;
    }

    public void setAuthor(Author Author) {
        this.Author = Author;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }


    @Override
    public String toString() {
        return getMame() +" by "+this.Author.toString();
    }
    
}