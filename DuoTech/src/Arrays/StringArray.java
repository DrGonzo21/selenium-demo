package Arrays;

public class StringArray {

    public static void main(String[] args) {

        String[] names = {"Johnny", "Bobby", "Alexander", "Anastacia",};


        // Find the vaule of the index of String in this string array with the max length

        int maxlength = names[0].length();
        String name = " ";
        int index = 0;


        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i].length() + " ");
            maxlength = names[i].length();
            name = names[i];
            index = i;
        }
        System.out.println(" The name with the max length is " + name + " at index " + index + " with a length " + maxlength);
    }
}


