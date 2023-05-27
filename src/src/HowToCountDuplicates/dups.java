package HowToCountDuplicates;

public class dups {
    public static void main(String[] args) {
        System.out.println(countString("crazy crayfish crushing craniums", "cra"));

    }

        public static int countString(String str, String toFind){


            int counter = 0;
            int start = str.indexOf(toFind);
            while(start > -1){
                counter++;
                start = str.indexOf(toFind, start + 1);
            }

            return counter;


        }
    }


