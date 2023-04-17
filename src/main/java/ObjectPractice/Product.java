package ObjectPractice;

public class Product {
    private int price;

    public Product(int price) {
        this.price = price;
    }

    public String toString() {
        return "値段は" + this.price + "です。";
    }
}
