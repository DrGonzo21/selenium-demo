package Sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        // Set is a data structure that allows only unique elements


        Set<String> toyotaModels = new HashSet<>();
        // Hashset does not keep the insertion order

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
        System.out.println(toyotaModels.contains("Supra"));
        System.out.println(toyotaModels.size());

//        toyotaModels.forEach(System.out::println);


        for (String model : toyotaModels) {
            System.out.println(model);
        }

        int i = 0;

      for ( String toyotaModel : toyotaModels){
          if(i == 2){
              System.out.println(toyotaModel);
              break;
          }

          i++;
      }
    }
}
