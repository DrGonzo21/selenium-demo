package Switch;
import java.io.*;
import java.util.*;

public class switch3 {
    public static void main(String[] args) {

        displayDaysOfMonth(1,2020);// January 2020 has 31 days
        displayDaysOfMonth(2,2016);// February 2016 has 29 days
        displayDaysOfMonth(2,2021);// February 2021 has 28 days
        displayDaysOfMonth(4,2000);// April 2000 has 30 days
        displayDaysOfMonth(12,2019);// December 2019 has 31 days
        displayDaysOfMonth(9,1999);// September 1999 has 30 days
    }
    public static void displayDaysOfMonth(int month, int year){


        if((month==2) && ((year%4==0) || ((year%100==0)&&(year%400==0))))
            System.out.println("february" +year + " has 29 days");

        else if(month==2)
            System.out.println("february "+ year + " has 28 days");

        else if(month==1)
            System.out.println("january "+ year + " has 31 days");

        else if(month==3)
            System.out.println("march "+ year + " has 31 days");

        else if(month==4)
            System.out.println("april "+ year + " has 30 days");

        else if(month==5)
            System.out.println("may "+ year + " has 31 days");

        else if(month==6)
            System.out.println("june"+ year + " has 30 days");

        else if(month==7)
            System.out.println("july "+ year + " has 31 days");

        else if(month==8)
            System.out.println("august "+ year + " has 31 days");

        else if(month==9)
            System.out.println("september "+ year + " has 30 days");

        else if(month==10)
            System.out.println("october "+ year + " has 31 days");

        else if(month==11)
            System.out.println("november "+ year + " has 30 days");



        else
            System.out.println("december "+ year + " has 31");


    }

}

