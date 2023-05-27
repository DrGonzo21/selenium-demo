package Arrays;

public class arrayclass1 {
    public static void main(String[] args) {

        int[] numbers;
        int numbers2 [];//c++ syntax

        int[] nums = new int[5]; // arrays are objects
        nums[0] = 45;
        nums[1] = 11;
        nums[2] = 33;
        nums[3] = 22;
        nums[4] = 10;

        System.out.println(nums[3]);
        System.out.println(nums[1]+nums[3]+456);


        //arrays require a size when created
        //arrays size is fixed, once created with initial size, it cant be changed

        //double[] temps = new double[];

        //shorthand syntax -> array initializer

        int[] numbs = {1,2,3,4,5,6,7,8,9};

        //this syntax requires and initialization at the same line

        //Alternative, better syntax
        int[]numbs2;
         numbs2 = new int[] {1,2,3,4,5,6,6,7,8,8,3,3};

         boolean[] bools = new boolean[2];

         char[] chars = new char[23];


            // Arrays can be both primitive and Object type


        //String[] names = {"John", "Bob", "Jerrod"};

        //length is a property/instance variable

       // System.out.println(names.length);

        //To call a specific name from the array
        //System.out.println(names[3]); -> Will print "Jerrod"

        //System.out.println(names[names.length-1]); //Last value from a array dynamically
       //=====================================================================================

        //int[] arr = new int[4];
       // System.out.println(arr); // prints its hashtag

        // since we cant directly print arrays with println statement, we can use Arrays.toString()

        //String content = Arrays.toString(arr);
       // System.out.println(content); -> prints the elements with empty vaules (vaule is generally 0)

        // you can override an arrays vaule
        // arr[1] = 0;
        //arr[2] = 10;
        //arr[1] = 5;
        // when printing out arr[1] vaule is now 5, not 0

        //to acces a array you must use the index of that array -> array vaules default to 0
    }
}

