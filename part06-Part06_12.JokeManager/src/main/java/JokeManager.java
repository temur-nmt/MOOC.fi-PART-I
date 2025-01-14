import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {

        this.jokes = new ArrayList<>();

    }

    public void addJoke(String joke) {
        jokes.add(joke);
    }

    public String drawJoke() {

        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }

        Random randomizer = new Random();
        int jokeIndex = randomizer.nextInt(jokes.size());
        return jokes.get(jokeIndex);
    }

    public void printJokes() {
        for (String x : jokes) {
            System.out.println(x);
        }
    }
}
