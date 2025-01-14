import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> hold;
    private int maxWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.hold = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = 0;

        if (this.hold.isEmpty()) {
            hold.add(suitcase);
        } else {

            for (Suitcase x : hold) {
                totalWeight += x.totalWeight();
            }

            if (totalWeight + suitcase.totalWeight() <= this.maxWeight) {
                hold.add(suitcase);
            }
        }
    }

    public String toString() {
        int totalSuitcases = 0;
        int weightOfSuitcases = 0;

        if (this.hold.isEmpty()) {
            return "0 suitcases (0 kg)";
        }

        for (Suitcase x : hold) {
            totalSuitcases++;
            weightOfSuitcases += x.totalWeight();
        }
        return totalSuitcases + " suitcases (" + weightOfSuitcases + " kg)";
    }

    public void printItems() {
        for (Suitcase x : hold) {
            x.printItems();
        }
    }
}
