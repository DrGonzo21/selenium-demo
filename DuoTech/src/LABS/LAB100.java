package LABS;

public class LAB100 {
    //    Create 3 overloaded methods called printArray:
//            1. accepts a single dimensional integer array and prints its contents in a single line with a space
//    {1,2,3,4,5} -> 1 2 3 4 5
//            2. accepts a single dimensional character array and prints its contents in a single line without a space
//    {'h','e','l','l','o'} -> hello
//             3. accepts a 2 dimensional String array and prints its contents as a matrix
//    { {"hey","what's","up"},
//        {"hola","que","hondas"},
//        {"como","te","vas"},
//        {"how","do","you", "do"}
//    }
//    hey what's up
//    hola que hondas
//    como te vas
//    how do you do
    public static void main(String[] args) {
        //Test your methods by passing the given arrays

        int [] arr1 = {1,2,3,4,5};

        char[] arr2 = {'h','e','l','l','o'};

        String[][] arr3 = { {"hey","what's","up"},
                {"hola","que","hondas"},
                {"como","te","vas"},
                {"how","do","you", "do"}
        };
        printArray(arr1);
        printArray(arr2);
        printArray(arr3);
    }

    public static void printArray(int[] arr1){

        for(int i = 0; i < arr1.length;i++){
            System.out.print(arr1[i] +" ");

        }
        System.out.println();
    }
    public static void printArray(char[] arr2){

        for(int i = 0; i < arr2.length;i++){
            System.out.print(arr2[i] +" ");
        }
        System.out.println();
    }
    public static void printArray(String[][]arr3){

        for(int i = 0; i < arr3.length;i++){
            for(int j = 0; j < arr3[i].length; j++){

                System.out.print(arr3[i][j] +" ");
            }
            System.out.println();
        }
    }
}

