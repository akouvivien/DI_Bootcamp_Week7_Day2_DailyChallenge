public class App {
    public static void main(String[] args) throws Exception {
        
Author author = new Author("Akou", "akouvivien@gmail.com", 'M', true);
Book book = new Book("harry potter",author, 20, 10);
System.out.println(book);
    }
}
