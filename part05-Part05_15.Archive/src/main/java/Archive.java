public class Archive {

    private String identifier;
    private String nameOfToy;

    public Archive(String id, String name) {
        this.identifier = id;
        this.nameOfToy = name;
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.nameOfToy;
    }

    public boolean equals(Object compared) {

        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Archive)) {
            return false;
        }

        Archive copmpItem = (Archive) compared;

        if (this.identifier.equals(copmpItem.identifier)) {
            return true;
        }
        return false;
    }
}
