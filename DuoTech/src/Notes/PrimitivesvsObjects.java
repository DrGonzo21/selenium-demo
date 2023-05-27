package Notes;

public class PrimitivesvsObjects {
    public static void main(String[] args) {
        int i = 89;
        int j = 99;
        j = i;
        System.out.println(i);
        System.out.println(j);

//        Taco taco = new Taco ("Carne Asada");
////         nameOfPackage+nameOfClass+@+ hashcode/memoryaddress
//
//        Taco taco1 = new Taco (" Lengua");
//        System.out.println("Taco1:" + taco1);
//        System.out.println("Taco:"+ taco);
//        taco = taco1;
        //assign taco1 reference to taco
        // after the assignment taco points to whatever taco1 is pointing to

        // int[] arr = new int[200000000] // can run out of heap memory.
//    }
//        Taco taco1 = new Taco("pollo");
//        Taco taco2 = new Taco("carne");
//        Taco taco3 = new Taco("lengua");
//        taco1 = taco2;
//        taco2 = taco3;
//        taco3 = taco1;
//        taco1 = null;
//        taco1 = new Taco("birria");
//        taco5 = taco1;
        // How do you call garbage collection in Java explicitly
        System.gc();
        // This is only suggestion but not a guaranteed, better then not calling
        // It is not going to guarantee the gc process
    }
}
