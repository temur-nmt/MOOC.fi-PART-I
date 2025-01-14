import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> list;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.list = new ArrayList<>();
    }

    public void addItem(Item item) {
        int totalWeight = 0;

        if (this.list.isEmpty()) {
            list.add(item);
        } else {

            for (Item x : list) {
                totalWeight += x.getWeight();
            }

            if (totalWeight + item.getWeight() <= this.maxWeight) {
                list.add(item);
            }
        }

    }

    public String toString() {

        if (this.list.isEmpty()) {
            return "no items (0 kg)";
        }

        if (this.list.size() == 1) {
            return "1 item " + "(" + this.list.get(0).getWeight() + " kg)";
        }

        int totalItems = 0;
        int totalWeight = 0;

        for (Item x : list) {
            totalItems++;
            totalWeight += x.getWeight();
        }

        return totalItems + " items (" + totalWeight + " kg)";
    }

    public void printItems() {
        for (Item x : list) {
            System.out.println(x);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Item x : list) {
            totalWeight += x.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {

        Item heaviest = new Item(null, Integer.MIN_VALUE);

        if (this.list.isEmpty()) {
            return null;
        }

        for (Item x : list) {
            if (x.getWeight() > heaviest.getWeight()) {
                heaviest = x;
            }
        }
        return heaviest;
    }

}
