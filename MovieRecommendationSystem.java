import java.util.*;

public class MovieRecommendationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, ArrayList<String>> movies = new HashMap<>();

        movies.put("Action", new ArrayList<>(Arrays.asList(
                "Avengers",
                "John Wick",
                "Mad Max",
                "Mission Impossible"
        )));

        movies.put("Comedy", new ArrayList<>(Arrays.asList(
                "3 Idiots",
                "Jathi Ratnalu",
                "Dhamaal",
                "Golmaal"
        )));

        movies.put("Drama", new ArrayList<>(Arrays.asList(
                "The Pursuit of Happyness",
                "Forrest Gump",
                "Jersey",
                "Maharshi"
        )));

        movies.put("SciFi", new ArrayList<>(Arrays.asList(
                "Interstellar",
                "Inception",
                "The Matrix",
                "Avatar"
        )));

        System.out.println("Available Genres:");
        System.out.println("Action");
        System.out.println("Comedy");
        System.out.println("Drama");
        System.out.println("SciFi");

        System.out.print("\nEnter your preferred genre: ");
        String genre = sc.nextLine();

        if (movies.containsKey(genre)) {

            System.out.println("\nRecommended Movies:");

            ArrayList<String> recommendations = movies.get(genre);

            for (int i = 0; i < recommendations.size(); i++) {
                System.out.println((i + 1) + ". " + recommendations.get(i));
            }

        } else {

            System.out.println("\nSorry! Genre not found.");
        }

        sc.close();
    }
}