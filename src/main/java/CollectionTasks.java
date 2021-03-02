package main.java;

import java.awt.List;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CollectionTasks {
    public static void main(String[] args) {
        try {
//            outLessFive();
//            retainCollection();
//            sortMinMax();
//            unionCollection();
//            threeKeyMax();
//            numToString();
//            pascalTriangleCollection();
//            palindrome();
//            converterSeconds();
            fileExtention();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void fileExtention() {
        try (Scanner scan = new Scanner(System.in)) {
            String fileName = scan.nextLine();
            Pattern pattern = Pattern.compile("^[а-я А-Я]*\\w*[.]{1}[a-z A-Z]*\\d*$");
            Matcher matcher = pattern.matcher(fileName);
            boolean found = matcher.matches();
            ArrayList<String> words = new ArrayList<String>();
            if (found) {
                for (String word : fileName.split("\\.")) {
                    words.add(word);
                }
                System.out.println(words.get(1));
            } else throw new Exception("Не опознанная фигня в имени файла");
            System.out.println(words);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }


    static void converterSeconds() {
        System.out.println("Ведите количество секунд: ");
        Scanner scan = new Scanner(System.in);
        long totalSeconds = scan.nextLong();
        long seconds = totalSeconds % 60;
        long minutes = totalSeconds % 3600 / 60;
        long hours = totalSeconds % 86400 / 3600;
        long days = totalSeconds % 2592000 / 86400;
        long month = totalSeconds % 31104000 / 2592000;
        long years = month % 12;
        LinkedHashMap<String, Long> linkedHashMap = new LinkedHashMap<>();
        if (seconds == 0) {
            linkedHashMap.put("секунд", seconds);
            linkedHashMap.put("минут", minutes);
            linkedHashMap.put("часов", hours);
            linkedHashMap.put("дней", days);
            linkedHashMap.put("месяцев", month);
            linkedHashMap.put("лет", years);
        } else {
            if ((seconds % 10 == 0) || (seconds % 10 >= 5) || (seconds >= 12) && (seconds <= 15)) {
                linkedHashMap.put("секунд", seconds);
            } else if (seconds % 10 == 1) {
                linkedHashMap.put("секунда", seconds);
            } else if ((seconds % 10 > 1) && (seconds % 10 <= 4)) {
                linkedHashMap.put("секунды", seconds);
            }

            if ((minutes % 10 == 0) || (minutes % 10 >= 5) || (minutes > 12) && (minutes <= 15)) {
                linkedHashMap.put("минут", minutes);
            } else if (minutes % 10 == 1) {
                linkedHashMap.put("минута", minutes);
            } else if ((minutes % 10 > 1) && (minutes % 10 <= 4)) {
                linkedHashMap.put("минуты", minutes);
            }

            if ((hours % 10 == 0) || (hours % 10 >= 5) || (hours > 12) && (hours <= 15)) {
                linkedHashMap.put("часов", hours);
            } else if (hours % 10 == 1) {
                linkedHashMap.put("час", hours);
            } else if ((hours % 10 > 1) && (hours <= 4)) {
                linkedHashMap.put("часа", hours);
            }

            if ((days % 10 == 0) || (days % 10 >= 5) || (days > 12) && (days <= 15)) {
                linkedHashMap.put("дней", days);
            } else if (days % 10 == 1) {
                linkedHashMap.put("день", days);
            } else if ((days % 10 > 1) && (days <= 4)) {
                linkedHashMap.put("дня", days);
            }

            if ((month % 10 == 0) || (month % 10 >= 5)) {
                linkedHashMap.put("месяцев", month);
            } else if (month % 10 == 1) {
                linkedHashMap.put("месяц", month);
            } else if ((month % 10 > 1) && (month <= 4)) {
                linkedHashMap.put("месяца", month);
            }

            if ((years % 10 == 0) || (years % 10 >= 5)) {
                linkedHashMap.put("лет", years);
            } else if (years % 10 == 1) {
                linkedHashMap.put("год", years);
            } else if ((years % 10 > 1) && (years <= 4)) {
                linkedHashMap.put("года", years);
            }
        }
        String result = linkedHashMap.toString();
        result = result.replaceAll("=", ":");
        System.out.println(result);
//        ArrayList<String> list = new ArrayList<String>(linkedHashMap.entrySet());
//        Collections.reverse(list);
//        System.out.println(list);


    }

    static void palindrome() {
        System.out.println("Введите строку :");
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        ArrayList originString = new ArrayList();
        ArrayList reverseString = new ArrayList();
        String noWhitespaceString = in.replaceAll(" ", "").toLowerCase();
        for (int i = 0; i < noWhitespaceString.length(); i++) {
            originString.add(i, noWhitespaceString.charAt(i));
        }
        for (int j = 0; j < originString.size(); j++) {
            reverseString.add(j, originString.get(originString.size() - 1 - j));
        }
        if (reverseString.equals(originString)) {
            System.out.println("Палиндром");
        } else System.out.println("Не палиндром");
    }

    static void pascalTriangleCollection() throws Exception {
        System.out.println("Введите высоту треугольника n");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n > 4) throw new Exception("Воу воу потише, у меня тут не суперкомпьютер, а скромный старенький мак)");
        ArrayList arrayList = new ArrayList();
        TreeSet treeSet = new TreeSet();
        ProjectOop.InOut.Numbers.pascalTriangle(n);
        for (int i = 0; i < n; i++) {
            int number = 1;
            for (int j = 0; j <= i; j++) {
                number = number * (i - j) / (j + 1);
                treeSet.add(number);
                arrayList.add(j, number);
            }
        }
        System.out.println("TreeSet - " + treeSet);
        System.out.println("ArrayList - " + arrayList);

    }

    static void numToString() {
        //Перевод целого числа в строку, применимо для любой системы исчисления
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение: ");
        String num = scan.next();
//        List numToString = Arrays.asList(String.valueOf(num));
        ArrayList<String> number = new ArrayList();
        number.add(num);


        System.out.println(number.get(0).toString());
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
        for (int i = 1; i <= 3; i++) {
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


