package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;


public class CollectionTasks {
    public static void main(String[] args) {
//        outLessFive();
        unionCollection();
    }
    static void unionCollection(){
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,1,2,3,5,8,13,21,34,55,89));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
        a.retainAll(b);
        System.out.println(a);




    }
    static void outLessFive(){
        //Есть список со значениями, задача вывести все меньше 5

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 6, 13));
        list.add(7, 21);
        list.add(8, 34);
        list.add(9, 55);
        list.add(10, 89);
        System.out.println(list);
        for (int x : list) {
            if (x < 5) {
                System.out.println(x);
            }
        }
    }
}


