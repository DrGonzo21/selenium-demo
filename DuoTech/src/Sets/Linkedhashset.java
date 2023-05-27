package Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashset {

    public static void main(String[] args) {


        Set<String> toyotaModels = new LinkedHashSet<>();

        toyotaModels.add("Camry");
        toyotaModels.add("Tacoma");
        toyotaModels.add("Highlander");
        toyotaModels.add("Supra");
        toyotaModels.add("Corolla");
        toyotaModels.add("Avalon");
        toyotaModels.add("Celica");
        toyotaModels.add("Rav4");
        toyotaModels.add("Tundra");
        toyotaModels.add(null);  // it is possible to add the null value to the hashset

        System.out.println(toyotaModels);


        // Even if you keep the order you still cant get specific element at a specific index while using sets.
        // If you need to change to list and then convert back to a list after manipulation.
    }
}
