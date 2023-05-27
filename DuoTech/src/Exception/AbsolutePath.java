package Exception;

import java.io.File;

public class AbsolutePath {

    public static void main(String[] args) {


        File file = new File("C:\\Users\\jerro\\Desktop\\Docs\\Story.txt"); // normal absolute path

        System.out.println(file.exists());

        //relative path is relative to the current directory
        // current directory in IntelliJ is the projects folder
        // Using System.getProperty("user.dir"); is a dynamic path

        File file2 = new File("src\\story.txt");
        System.out.println(file2.exists());

//        String normalabsoultePath = "C:\\Users\\jerro\\Desktop\\Docs\\Story.txt";
//        System.out.println(System.getProperty("user.dir") + "\\ src \\story.txt");
//
//        File file3 = new File(System.getProperty("user.dir") + "/src/story.txt");  // dynamic path that will work on all computers
//        System.out.println(file3.exists());

 //       System.getProperty("user.dir") -> gets the absolute path to file while making it compatible with all Os
    }
}
