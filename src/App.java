import java.util.ArrayList;
import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        // Menguji CollectionUtils
        ArrayList<String> nameList = CollectionUtils.createArrayList();
        HashSet<String> uniqueNameSet = CollectionUtils.createHashSet();

        System.out.println("ArrayList dari CollectionUtils: " + nameList);
        System.out.println("HashSet dari CollectionUtils: " + uniqueNameSet);
    }
}
