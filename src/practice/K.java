package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class K {

    public static void main(String[] args) {
//        List<Integer> x =  new ArrayList<Integer>();
//        x.add(10);
//        x.add(20);
//        x.add(30);
//        x.add(40);
//        x.add(50);
//
//
////        List<Integer>x  = Arrays.asList(11,56,78,23,98);
//
//        System.out.println(x);
//
//        //Extract a portion of a array list
//
//        List<Integer> subList = x.subList(0, 3);
//
//        System.out.println(subList);

    String  [] x =   new String [] {"10","20","30","40","50"} ;

        for (String s: x) {

            System.out.println(s);

        }

        List<Object> list1 = Arrays.asList();
        System.out.println( "1"+list1);

        List<String> list = Arrays.asList(x);

        System.out.println( "2"+list);

        List< String >  y = Arrays.asList(x);

        System.out.println(  "3"+x);
        System.out.println( "4"+y);



    }
}
