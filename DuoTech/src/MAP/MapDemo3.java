package MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo3 {

    public static void main(String[] args) {

        Map<String,String> vehicles = new HashMap<>();

        vehicles.put("edkljghsdflkj "," Honda Accord, 2009, silver, auto");
        vehicles.put("uirlhgrfli "," Tesla Model y, 2022, blue, auto");
        vehicles.put("hudisohu ", null);
        vehicles.put("ncdjbsikubisd "," subaru sti, 2019, black, manual");
        vehicles.put( null , null); // only one null key and as many null values as you want are allowed

        System.out.println("vehicles: " + vehicles);

        Map<String,String> vehicles1 = new TreeMap<>();
        vehicles1.put("ncdjbsikubisd ", null); // only null value is allowed. no null keys
        vehicles1.put("edkljghsdflkj "," Honda Accord, 2009, silver, auto");
        vehicles1.put("uirlhgrfli "," Tesla Model y, 2022, blue, auto");
        vehicles1.put("hudisohu "," Toyota Supra, 1996, white, manual");



        System.out.println("vehicles 1: " + vehicles1);

        Map<String,String> vehicles2 = new LinkedHashMap<>();
        vehicles2.put( null , null); // only one null key and as many null values as you want are allowed
        vehicles2.put("edkljghsdflkj "," Honda Accord, 2009, silver, auto");
        vehicles2.put("uirlhgrfli "," Tesla Model y, 2022, blue, auto");
        vehicles2.put("hudisohu "," Toyota Supra, 1996, white, manual");
        vehicles2.put("ncdjbsikubisd "," subaru sti, 2019, black, manual");

        System.out.println("vehicles 2: " + vehicles2);
    }
}
