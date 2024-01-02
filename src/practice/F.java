package practice;

import java.util.*;

public class F {

    public static void main(String[] args) {

// copying one Array List to another
     List <Integer> x = new ArrayList<Integer>() ;

        x.add(10);
        x.add(56);
        x.add(90);
        x.add(23);



        List<Integer> y = new ArrayList<Integer>();

        System.out.println("1"+x);
        System.out.println("2"+y);

        Collections.copy(x,y);
        System.out.println("3"+x);
        System.out.println("4"+y);

        y.add( 30);
        y.add( 40);
        y.add( 70);
        y.add( 80);

        Collections.copy(x,y);
                          // copying x to y >> note: both ArrayList must be of same size
       // // Collections.copy(x,y);  y size should be
       //// equal or smaller than the  size of x  if  greater  then  IndexOutOfBoundsException
        System.out.println("5"+x);
        System.out.println("6"+y);
    }
}

















