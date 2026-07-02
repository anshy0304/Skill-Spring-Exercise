import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class LambdaExpressions {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Riya", "Aman", "Kabir", "Neha"));

        Collections.sort(names, (first, second) -> first.compareToIgnoreCase(second));

        System.out.println("Sorted names: " + names);
    }
}
