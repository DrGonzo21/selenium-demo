package Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class BufferedReaderandWriter {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\jerro\\Desktop\\Docs\\Story.txt"));

//        String line;
//        while((line = bufferedReader.readLine()) != null){
//            System.out.println(line);

//        bufferedReader.lines().forEach(System.out::println); // shorter syntax for the code above

        List<List<String>> collect = bufferedReader.lines()
                .map(s -> List.of(s.split(",")))
                .collect(Collectors.toList());
        System.out.println(collect);
        collect.forEach(System.out::println);
        System.out.println(collect.get(2).get(1));

    }

}




