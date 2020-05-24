package dz2_3_1;

//import java.util.*;


public class Main {

    public static void main(String[] args) {
	List<String> words = Arrays.asList(
	        "Car", "Bus", "Train", "Underground", "Plane",
            "Boat", "Ship", "Bus", "Helicopter", "Car",
            "Underground", "Boat", "Tank", "Plane", "Rocket",
            "Train", "Plane", "Bike", "Scooter", "Ship"
    );

	Set<String> unique = new HashSet<String>(words);

        System.out.println("Полный список");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов");

        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }

    }
}
