import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>(Arrays.asList("Kazuya", "Mizuhara", "Jirou", "Akari", "Greed"));

        friends.add("Kitagawa");
        friends.remove("Kitagawa");
        // for (int i = 0; i < friends.size(); i++) {
        //     System.out.println(friends.get(i));
        // }
        System.out.println(friends);
    }
}