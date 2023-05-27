package stringrip;

public class stringmanip {

    printInfo("Yi Oh");
    printInfo("Justin Timberlake");
    printInfo("Donald Duck");
}


    public static void printInfo(String str){

        //implement here



        System.out.println("first name: "+ str.substring(0,str.indexOf(' ')+1));
        System.out.println("last name: "+ str.substring(str.indexOf(' ')+1));
        System.out.println("intials: "+str.substring(0, 1)+" "+str.substring(str.indexOf(' ')+1).charAt(0));

    }
}