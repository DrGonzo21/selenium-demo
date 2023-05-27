package Sets;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TReeSet {

    public static void main(String[] args) {

        Set<String> toyotaModels = new TreeSet<>();

        toyotaModels.add("Camry");
        toyotaModels.add("Tacoma");
        toyotaModels.add("Highlander");
        toyotaModels.add("Supra");
        toyotaModels.add("Corolla");
        toyotaModels.add("Avalon");
        toyotaModels.add("Celica");
        toyotaModels.add("Rav4");
        toyotaModels.add("Tundra");
        toyotaModels.add("Tundra");
       // toyotaModels.add(null); Exception in thread "main" java.lang.NullPointerException
        System.out.println(toyotaModels); // TreeSet sorts the items in natural order

        // Null is not allowed because treeSet using sorting

    }
}
