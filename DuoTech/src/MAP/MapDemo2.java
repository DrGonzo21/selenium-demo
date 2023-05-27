package MAP;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {

        Map<String,Object> response = Map.of("id","123","name","John Doe","classID","123333","isOnline","true");  // can only hold 10 items and is not modifiable, immutable map



        Set<Map.Entry<String, Object>> entries = response.entrySet();


//        response = new HashMap<>();
//
//        for (Map.Entry<String,Object> entry : response.entrySet()) {
//
//            entry.setValue(((String) entry.getValue()).toUpperCase());
//
//            System.out.println("Keys: " + entry.getKey() + ", Value: " + entry.getValue());
//
//
//        }


        Map<String, Object> modifiableMap = new HashMap<>(response); // you can create one map from another by passing it in a constructor


      //  response.put("height",184.3);  UnsupportedOperationException is thrown
       // response.remove("id"); Again you would get Unsupported Operation Exception



        // each element of the Map is represented by Entry object which is declared as subinterface

    }
}
