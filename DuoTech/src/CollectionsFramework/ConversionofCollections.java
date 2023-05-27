package CollectionsFramework;

import Sets.Linkedhashset;

import java.util.*;

public class ConversionofCollections {

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

        List<String> list = new ArrayList<>(toyotaModels); // converted set to list
        System.out.println(list.get(0));

        toyotaModels = new HashSet<>(list);

        Set<String> hkjg = Set.of("kjhfgkjhg", "kjflkfjd", "jshdkjh", "skdjlk");

        List<String> names = new ArrayList<>(List.of("Alina", "Abby", "Bob","Alina","Bob","Chris"));

//        LinkedHashSet<String> strings = new LinkedHashSet<>(names);
//        System.out.println(strings);
        // To remove duplicates from a list, you can convert it to Set and back to List

        names = new ArrayList<>(new LinkedHashSet<>(names));
        System.out.println(names);
    }
}
