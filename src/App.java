import java.util.*;;
public class App {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(10, "A");
        System.out.println("First element: " + pair.getFirst());
        System.out.println("Second element: " + pair.getSecond());

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<String> stringSet = new HashSet<>(Arrays.asList("A", "B", "C", "D", "E"));

        CollectionUtility.printCollection(integerList);
        CollectionUtility.printCollection(stringSet);
    }
}
