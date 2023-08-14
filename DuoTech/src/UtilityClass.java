import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class UtilityClass {

    public static List<List<String>> readFromCSV(String path) {

        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String Line;
            while ((Line = br.readLine()) != null) {
                records.add(Arrays.asList(Line.split(",")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return records;
    }
}
