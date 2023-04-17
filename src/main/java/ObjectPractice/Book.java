package ObjectPractice;

public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    //コンストラクタのオーバーロード
    public Book(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return "Book[title = " + title + ", author =, " + author + "]";
    }

    //オーバーロードの実装
    public String toString(String title) {
        return this.title = title;
    }

    public static void main(String[] args) {
        Book book = new Book("マイクロサービスの構築", "John Thompson");
        System.out.println(book);
        System.out.println(book.toString("メンデス"));
        System.out.println(book);
    }
}
