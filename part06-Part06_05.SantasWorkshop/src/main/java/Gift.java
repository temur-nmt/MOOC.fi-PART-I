public class Gift {
    private String name;
    private int weight;

    public Gift(String giftName, int giftWeight) {
        this.name = giftName;
        this.weight = giftWeight;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public String toString() {
        return this.name + " (" + this.weight + " kg)";
    }
}
