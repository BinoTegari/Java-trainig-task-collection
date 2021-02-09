package main.java;

import java.util.*;


public class CollectionTasks {
    public static void main(String[] args) {
//        outLessFive();
//        retainCollection();
//        sortMinMax();
//        unionCollection();
//        threeKeyMax();
        numToString();
    }

    static void numToString(){
        //Перевод целого числа в строку, применимо для любой системы исчисления
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение: ");
        Integer num = scan.nextInt();
        List numToString = Arrays.asList(String.valueOf(num));
        System.out.println(numToString);
        System.out.println();
    }
    static void threeKeyMax() {
        //Вывести три самых высоких значения ключа
        Map<String, Integer> myDictionary = new HashMap<>();
        myDictionary.put("a", 500);
        myDictionary.put("b", 5874);
        myDictionary.put("c", 560);
        myDictionary.put("d", 400);
        myDictionary.put("e", 5874);
        myDictionary.put("f", 20);

        Collection<Integer> values = myDictionary.values();
        ArrayList<Integer> listValues = new ArrayList<>(values);
        System.out.println(values);
        Collections.sort(listValues);
        System.out.println(listValues);
        System.out.println("Три самых больших значения ключа: ");
        for(int i=1;i<=3;i++){
            System.out.println(listValues.get(listValues.size() - i));
        }

    }

    static void unionCollection() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13));
        ArrayList<Integer> c = new ArrayList<>();
        c.addAll(a);
        c.addAll(b);
        System.out.println(c);
    }

    static void sortMinMax() {
        ArrayList<Integer> sortMinMax = new ArrayList<>(Arrays.asList(1, 24, 2, 3, 53, 8, 13, 21, 34, 55, 89));
        System.out.println("До сортировки: ");
        for (Integer counter : sortMinMax) {
            System.out.print(counter + " ");
        }
        System.out.println();
        System.out.println("После сортировки от меньшего к большему: ");
        Collections.sort(sortMinMax);
        for (Integer counter : sortMinMax) {
            System.out.print(counter + " ");
        }
        System.out.println();
        System.out.println("После сортировки от большего к меньшему: ");
        Collections.sort(sortMinMax, Collections.reverseOrder());
        for (Integer counter : sortMinMax) {
            System.out.print(counter + " ");
        }
    }

    static void retainCollection() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13));
        a.retainAll(b);
        System.out.println(a);


    }

    static void outLessFive() {
        //Есть список со значениями, задача вывести все меньше 5

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 6, 13));
        list.add(7, 21);
        list.add(8, 34);
        list.add(9, 55);
        list.add(10, 89);
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            Integer next = iter.next();
            if (next <= 5) {
                System.out.println(next);
            }
        }
        System.out.println(list);
        for (int x : list) {
            if (x < 5) {
                System.out.println(x);
            }
        }
    }
}


