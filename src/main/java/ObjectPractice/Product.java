package ObjectPractice;

public class Product {
    private static int price;

    public Product(int price) {
        this.price = price;
    }

    public String toString() {
        return "値段は" + this.price + "です。";
    }

    public static void add() {
        price++;
    }

    public static void main(String[] args) {
        price = 100;
        add();
        add();
        System.out.println("priceは"+ price + "円");
    }
}
