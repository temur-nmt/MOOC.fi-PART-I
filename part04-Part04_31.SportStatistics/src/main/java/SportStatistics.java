
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();

        System.out.println("Games: " + gamesPlayed(team, file));
        System.out.println("Wins: " + getWins(team, file));
        System.out.println("Losses: " + getLosses(team, file));
    }

    public static int gamesPlayed(String team, String file) {
        int counter = 0;

        try (Scanner read = new Scanner(Paths.get(file))) {
            while (read.hasNextLine()) {
                String line = read.nextLine();

                if (line.contains(team)) {
                    counter++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return counter;

    }

    public static int getWins(String team, String file) {
        int wins = 0;

        try (Scanner read = new Scanner(Paths.get(file))) {
            while (read.hasNextLine()) {
                String line = read.nextLine();
                String[] parts = line.split(",");

                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPts = Integer.valueOf(parts[2]);
                int visitingTeamPts = Integer.valueOf(parts[3]);

                if ((homeTeam.equals(team) && (homeTeamPts > visitingTeamPts))) {
                    wins++;
                } else if ((visitingTeam.equals(team) && (homeTeamPts < visitingTeamPts))) {
                    wins++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return wins;
    }

    public static int getLosses(String team, String file) {
        int losses = 0;

        try (Scanner read = new Scanner(Paths.get(file))) {
            while (read.hasNextLine()) {
                String line = read.nextLine();
                String[] parts = line.split(",");

                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPts = Integer.valueOf(parts[2]);
                int visitingTeamPts = Integer.valueOf(parts[3]);

                if ((homeTeam.equals(team) && (homeTeamPts < visitingTeamPts))) {
                    losses++;
                } else if ((visitingTeam.equals(team) && (homeTeamPts > visitingTeamPts))) {
                    losses++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return losses;
    }
}
