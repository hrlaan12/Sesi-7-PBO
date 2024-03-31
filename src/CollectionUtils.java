import java.util.ArrayList;
import java.util.HashSet;

public class CollectionUtils {
    public static ArrayList<String> createArrayList() {
        ArrayList<String> name = new ArrayList<>();
        name.add("Adi");
        name.add("Budi");
        name.add("Caca");
        return name;
    }

    public static HashSet<String> createHashSet() {
        HashSet<String> name2 = new HashSet<>();
        name2.add("Adi");
        name2.add("Budi");
        name2.add("Caca");
        return name2;
    }

    public static void printHashSet(HashSet<String> set) {
        for (String name : set){
            System.out.println(name);
        }
    }
}
