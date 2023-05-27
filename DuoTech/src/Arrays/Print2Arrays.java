package Arrays;
import java.util.Arrays;

public class Print2Arrays {


        public static void main(String[] args) {

            String[] titlesArray = { "Pluto TV Kids", "CNET", "Pluto TV Sports", "Naturescape", "Fear Factor", "Flicks of Fury", "PeopleTV", "Rescue 911", "The Amazing Race", "Pluto TV Drama Life", "Western TV" };

            String[] categoriesArray = { "5c12fe491c932b67bd8e3d80", "5c12f932be491cbd678e3d87", "5c12fe491cbd932b678e3d8f",
                    "5cffe094ad44e55543791bfc", "5f19a84079572700079d28e0", "5c12fe2b678e3491cbd93d84",
                    "5c12fe491cbd932b678e3d7b", "5f18407959a72700079d28e0", "5f197995727a808e04070d20",
                    "5f19a84079572700079d28e0", "5f19a8763eae7b0007f5c45e" };


            printArray(titlesArray, categoriesArray); // test


        }



        public static void printArray(String[] arr1, String[] arr2){
            String str = "";
            String str1 = "";
            for(int i = 0; i < arr1.length && i<arr2.length; i++){
                str = arr1[i];
                str1 = arr2[i];
                System.out.println(str+","+str1);





            }
        }

    }
