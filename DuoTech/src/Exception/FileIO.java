import java.io.File;
import java.io.IOException;

public class FileIO {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\jerro\\Desktop\\Docs\\hello");
        System.out.println(file.exists());

        boolean isCreated = file.createNewFile();
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

        file.renameTo(new File("C:\\Users\\jerro\\Desktop\\Docs\\Java"));
        System.out.println(file.exists());
    }
}
