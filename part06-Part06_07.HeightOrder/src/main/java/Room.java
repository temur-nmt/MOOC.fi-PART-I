import java.util.ArrayList;

public class Room {

    private ArrayList<Person> list;

    public Room() {
        this.list = new ArrayList<>();
    }

    public void add(Person person) {
        list.add(person);
    }

    public boolean isEmpty() {
        if (this.list.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return list;
    }

    public Person shortest() {
        if (this.list.isEmpty()) {
            return null;
        } else {
            Person shortest = new Person(null, Integer.MAX_VALUE);

            for (Person x : list) {
                if (x.getHeight() < shortest.getHeight()) {
                    shortest = x;
                }
            }
            return shortest;
        }
    }

    public Person take() {
        if (this.list.isEmpty()) {
            return null;
        } else {
            Person shortest = shortest();
            int indexOfShortest = 0;

            for (int i = 0; i < this.list.size(); i++) {
                Person currentPerson = list.get(i);

                if (currentPerson.equals(shortest)) {
                    indexOfShortest = i;
                }
            }
            this.list.remove(indexOfShortest);
            return shortest;
        }
    }
}
