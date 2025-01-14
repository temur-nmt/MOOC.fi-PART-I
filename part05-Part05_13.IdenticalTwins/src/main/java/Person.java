
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Person)) {
            return false;
        }

        Person twin = (Person) compared;

        if (this.name.equals(twin.name) && this.birthday.equals(twin.birthday) && (this.height == twin.height)
                && (this.weight == twin.weight)) {
            return true;
        }
        return false;
    }
}
