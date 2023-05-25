package ObjectPractice;

public enum EnumPractice {
    PREMIER(0.2),
    PRIME(0.1),
    NORMAL(0.0);

    // フィールド
    private final double discountRate;

    // コンストラクタ
    private EnumPractice(double discountRate) {
        this.discountRate = discountRate;
    }

    // メソッド
    public int getDiscountPrice(int price) {
        return (int) (price * (1 - discountRate));
    }
}
