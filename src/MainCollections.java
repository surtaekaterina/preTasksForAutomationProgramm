/*
Got the following results:

Statistic for ArrayList/n
Time of filling this collection 22 millis
Time for delete element 1 millis
Time for add element 0
49998
Time for identity element 3 millis


Statistic for LinkedList/n
Time of filling this collection 14 millis
Time for delete element 0 millis
Time for add element 0
49998
Time for identity element 2 millis

which demonstrate that adding, inserting and deleting fir LinkedList work faster
*/


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainCollections {

    public static void main(String[] args) {


        listComparison(new ArrayList<String>(), "ArrayList");
        listComparison(new LinkedList<String>(), "LinkedList");

    }

    private static void listComparison(List<String> list, String listRealisation) {

        System.out.println("Statistic for " + listRealisation + "/n");
        long beforeCreation = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add("String" + i);
        }
        long afterXreation = System.currentTimeMillis();
        System.out.println("Time of filling this collection " + (afterXreation - beforeCreation) + " millis");

        long beforeAL = System.currentTimeMillis();
        list.remove("String5000");
        list.remove(5000);
        long afterAL = System.currentTimeMillis();
        System.out.println("Time for delete element " + (afterAL - beforeAL) + " millis");
        list.add(99998, "String5000");
        long afterAddAL = System.currentTimeMillis();
        System.out.println("Time for add element " + (afterAddAL - afterAL));
        int indexAL = list.indexOf("String50000");
        System.out.println(indexAL);
        long afterIdentityAL = System.currentTimeMillis();
        System.out.println("Time for identity element " + (afterIdentityAL - afterAddAL) + " millis" + "\n\n");
    }

}
