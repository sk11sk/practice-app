package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class M {

    public static void main(String[] args) {

//        //Compare two array lists
//
////        List<Integer> x = new ArrayList<Integer>();
////        x.add(10);
////        x.add(20);
////
//
//
////        List<Integer> y = new ArrayList<Integer>();
////        y.add(11);
////        y.add(12);
//
//
////        List<Integer> z = new ArrayList<Integer>();
//
//
////        System.out.println(x);
//
//
////        Write a Java program that swaps two elements in an array list.
//
////        Java: Swap two elements in an array list
//
////        List<String> y = new ArrayList<String>();
////        y.add("first");
////        y.add("second");
////        y.add("third");
////        y.add("fourth");
////
////        System.out.println("Arraylist before swapping :");
////        System.out.println(y);
////
////        Collections.swap(y,0,2);
////
////        System.out.println("Arraylist after swapping :");
////        System.out.println(y);
//
//
//
//        //  Java: Join two array list
//
//        List<String> y = new ArrayList<String>();
//        y.add("first");
//        y.add("second");
//        y.add("third");
//        y.add("fourth");
//
//
//
//
//






      //

        ArrayList<String> x = new ArrayList<String>();
        x.add("fifth");
        x.add("sixth");
        x.add("seventh");
        x.add("eighth");
        x.add("nine");

        ArrayList<String> y = new ArrayList<String>();

        y.add("a");
        y.add("a");
        y.add("a");
        y.add("a");
        Collections.copy(y,x);  //Collections.copy(destination, source);

 // source size should be less than or equal to destination size
        // and destination ArrayList must not be empty

        System.out.println(x);
        System.out.println(y);


    }

}
