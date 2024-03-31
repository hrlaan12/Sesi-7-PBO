import java.util.Collection;

public class CollectionUtility {
    public static <E> void printCollection(Collection<E> collection) {
        System.out.println("Printing Collection:");
        for (E element : collection) {
            System.out.println(element);
        }
        System.out.println();
    }
}