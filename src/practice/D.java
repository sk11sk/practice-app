package practice;

import java.sql.*;
import java.util.ArrayList;

public class D {

    public static void main(String[] args) {

        ArrayList x  = new ArrayList();
        x.add(10);
        x.add(20);
        x.add("sharabh");
        x.add(true);
        x.add(10.3);
        System.out.println(x);  //[10, 20, sharabh, true, 10.3]


        x.add(1,100);  // [10, 100, 20, sharabh, true, 10.3]

        System.out.println(x);

        ArrayList y = new ArrayList();

        y.add(25);
        y.add(56);

        System.out.println(y); //[25, 56]


        x.addAll(y);

        System.out.println(x); //[10, 100, 20, sharabh, true, 10.3, 25, 56]

        x.addAll(3,y); //[10, 100, 20, 25, 56, sharabh, true, 10.3, 25, 56]

        System.out.println(x);

        x.remove(2);  //[10, 100, 25, 56, sharabh, true, 10.3, 25, 56]

        System.out.println(x);

        System.out.println( x.contains(25)); //true
    }
}
