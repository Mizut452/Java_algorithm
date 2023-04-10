package ObjectPractice;

public class Fish {
    private String fishName;
    private String fishColor;

    public Fish(String fishName, String fishColor) {
        this.fishName = fishName;
        this.fishColor = fishColor;
    }

    //getterとsetter
    public String getFishColor() {
        return fishColor;
    }

    public String getFishName() {
        return fishName;
    }
}
