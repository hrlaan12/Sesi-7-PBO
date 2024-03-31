import java.util.HashSet;
import java.util.ArrayList;

public class CollectionExample {
    public static void main(String[] args) {
        //Menggunakan ArrayList
        ArrayList<String> name =  CollectionUtils.createArrayList();
        System.out.println("ArrayList: " + name);
        
        //Menggunakan Hashset
        HashSet<String> name2 = CollectionUtils.createHashSet();
        System.out.println("HashSet: " + name2);

        //Mengakses element arraylist
        System.out.println("Element ArrayList: " + name.get(0));

        //Mengakses element hashset
        System.out.println("Element HashSet: " + name2);
    }
}