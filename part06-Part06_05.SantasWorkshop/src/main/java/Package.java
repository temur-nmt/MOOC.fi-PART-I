import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> list;

    public Package() {
        this.list = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.list.add(gift);
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Gift x : list) {
            totalWeight += x.getWeight();
        }
        return totalWeight;
    }
}
