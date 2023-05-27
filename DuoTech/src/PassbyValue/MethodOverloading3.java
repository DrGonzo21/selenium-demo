package PassbyValue;

// method overloading is a very common tech question during interviewing
public class MethodOverloading3 {
    public static void main(String[] args) {

        // Overloading can be by amount of parameters
        // 1. number of parameters
        // 2. type of parameters
        // 3. order of parameters
        // Everything other then the signature can be overloaded

        printMessage();
        printMessage("Hi");
        printMessage("Hello","Hi");

//        printMessage("hdsghf","fhdioih","fhoihf");
//        Math.max(1,2,3);
    }
        public static void printMessage(){
            System.out.println("Hello");
//            return 0;
            // method overloading only deals with method signatures
            // method signature -> name + parameters
            // correct method overloading requires that method name is the same and parameters are different
            // return type, static/non-static, visibility-> DO NOT MATTER FOR OVERLOADING

    }

        public static void printMessage(String str){
            System.out.println(str);
        }
//    public static void printMessage(String str, int times){
//        System.out.println(str+times);    // this combines 1 & 2
//    }
//
    public static void printMessage(String str, String str2){
        System.out.println(str+str2);

    }
    public static void printMessage(char[] arr){ //#2
        System.out.println(arr);
    }
    public static void printMessage(int i){ //#2
        System.out.println(i);
    }
    public static void printMessage(int times, String message){
       for (int i = 0; i< times; i++){   //#3

       }
//       public static void myMethod(int num, int num2){
//        }
//       public static void myMethod(int hello, int hi){
//       even though the name is changed but the parameters are still the same
        }
   }

// Invocation order for overloaded methods
//exact match by type
//exact primtitive type
//autoboxed type
//