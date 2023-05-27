package Exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathDemo {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:\\Users\\jerro\\Desktop\\Docs\\Jboody.txt");

        List<String> lines = Files.readAllLines(path);

        Files.write(path, List.of("hello", "hi", "goodbye"));

        Files.delete(path);
    }
}
