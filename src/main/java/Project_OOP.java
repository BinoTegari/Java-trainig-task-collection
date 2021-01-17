package main.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Project_OOP {
    public static void main(String[] args) {
        Menu.mainMenu();
    }

    static class Menu {
        static void mainMenu() {
            boolean exit = true;
            while (exit) {
                Scanner scan = new Scanner(System.in);
                try {
                    System.out.println("Главное меню\nВыберите пункт:\n1.Задачи с операторами сравнения" +
                            "\n2.Задачи с числами\n3.Задачи с массивами\n0.Выход");
                    int q = scan.nextInt();
                    switch (q) {
                        case 1:
                            comparsionsMenu();
                            break;
                        case 2:
                            numbersMenu();
                            break;
                        case 3:
                            arraysMenu();
                            break;
                        case 0:
                            scan.close();
                            exit = false;
                    }
                    if (q != 0 && q < 1 || q > 3) {
                        System.out.println(">>Используйте только цифры пунктов меню<<");
                    }
                } catch (InputMismatchException i) {
                    System.out.println(">>Используйте только цифры<<");
                }
            }
        }

        static void comparsionsMenu() {
            boolean exit = true;
            while (exit) {
                Scanner scan = new Scanner(System.in);
                try {
                    System.out.println("Задачи с операторами сравнения\nВыберите пункт:" +
                            "\n1.XOR шифрование\n2.Сравнение чисел\n3.От одного до десяти\n4.2 или 9\n5.Сумма вклада с процентами" +
                            "\n6.Простой калькулятор\n7.Рубли в доллары\n8.Конвертер секунд\n9.Популяция за 10 лет\n10.Сумма вклада 7%\n0.Выход");
                    int q = scan.nextInt();
                    switch (q) {
                        case 1:
                            InOut.Comparsions.xorCrypt(InOut.enterNumber(1), InOut.enterNumber(2));
                            break;
                        case 2:
                            InOut.Comparsions.comparsionNum(InOut.enterNumber(3), InOut.enterNumber(4));
                            break;
                        case 3:
                            InOut.Comparsions.numForOneToTen(InOut.enterNumber(1));
                            break;
                        case 4:
                            InOut.Comparsions.num_2_or_9(InOut.enterNumber(1));
                            break;
                        case 5:
                            InOut.Comparsions.interestOnDeposit(InOut.enterNumber(5));
                            break;
                        case 6:
                            InOut.Comparsions.simpleCalculator(InOut.enterNumber(3), InOut.enterNumber(4), InOut.enterNumber(6));
                            break;
                        case 7:
                            InOut.Comparsions.rubToUsd(InOut.enterNumber(7));
                            break;
                        case 8:
                            InOut.Comparsions.converterSeconds(InOut.enterNumber(8));
                            break;
                        case 9:
                            InOut.Comparsions.numHuman(InOut.enterNumber(9), InOut.enterNumber(10), InOut.enterNumber(11));
                            break;
                        case 10:
                            InOut.Comparsions.finalDeposit(InOut.enterNumber(5), InOut.enterNumber(12));
                            break;
                        case 0:
                            exit = false;
                    }
                    if (q != 0 && q < 1 || q > 10) {
                        System.out.println(">>Используйте только цифры пунктов меню<<");
                    }
                } catch (InputMismatchException i) {
                    System.out.println(">>Используйте только цифры<<");
                }
            }
        }

        static void numbersMenu() {
            boolean exit = true;
            while (exit) {
                Scanner scan = new Scanner(System.in);
                try {
                    System.out.println("Задачи с числами.\nВыберите пункт:\n1.Арифметическая прогрессия\n2.Факториал числа\n3.Треугольник Паскаля" +
                            "\n4.Числа Фибоначчи\n5.Таблица умножения(если вдруг забыл)\n0.Выход");
                    int q = scan.nextInt();
                    switch (q) {
                        case 1:
                            InOut.Numbers.arithmeticProgression(InOut.enterNumber(13), InOut.enterNumber(14));
                            break;
                        case 2:
                            InOut.Numbers.factorial(InOut.enterNumber(15));
                            break;
                        case 3:
                            InOut.Numbers.pascalTriangle(InOut.enterNumber(16));
                            break;
                        case 4:
                            InOut.Numbers.fibonacci(InOut.enterNumber(17));
                            break;
                        case 5:
                            InOut.Numbers.multiplicationTable();
                            break;
                        case 0:
                            exit = false;
                    }
                    if (q != 0 && q < 1 || q > 5) {
                        System.out.println(">>Используйте только цифры пунктов меню<<");
                    }
                } catch (InputMismatchException i) {
                    System.out.println(">>Используйте только цифры<<");
                }
            }
        }

        static void arraysMenu() {
            boolean exit = true;
            while (exit) {
                Scanner scan = new Scanner(System.in);
                try {
                    System.out.println("Задачи с массивами\nВыберите пункт\n1.Найти число 4 в массиве\n2.Сравнение двух массивов" +
                            "\n3.Четные числа в массиве\n4.Объединение двух массивов\n5.Проверка на палиндром\n6.Нахождение минимума максимума" +
                            "\n7.Общие элементы\n8.Числа меньше 5\n0.Выход");
                    int q = scan.nextInt();
                    switch (q) {
                        case 1:
                            InOut.Arrays.findFourInArray();
                            break;
                        case 2:
                            InOut.Arrays.comparsionTwoArrays();
                            break;
                        case 3:
                            InOut.Arrays.evenNumInArray();
                            break;
                        case 4:
                            InOut.Arrays.uniteTwoArrays();
                            break;
                        case 5:
                            InOut.Arrays.palindrome();
                            break;
                        case 6:
                            InOut.Arrays.minAndMaxInArrays();
                            break;
                        case 7:
                            InOut.Arrays.commonElementsOfArrays();
                            break;
                        case 8:
                            InOut.Arrays.arrayNumLessFive();
                            break;
                        case 0:
                            exit = false;
                    }
                    if (q != 0 && q < 1 || q > 8) {
                        System.out.println(">>Используйте только цифры пунктов меню<<");
                    }
                } catch (InputMismatchException i) {
                    System.out.println(">>Используйте только цифры<<");
                }
            }
        }
    }

    static class InOut {
        static int enterNumber(int indicator) {
            Scanner scan = new Scanner(System.in);
            String messageOfNumber = " ";
            switch (indicator) {
                case 1:
                    System.out.println(Message.number.getMessage());
                    break;
                case 2:
                    System.out.println(Message.key.getMessage());
                    break;
                case 3:
                    System.out.println(Message.firstNumber.getMessage());
                    break;
                case 4:
                    System.out.println(Message.secondNumber.getMessage());
                    break;
                case 5:
                    System.out.println(Message.sumAmount.getMessage());
                    break;
                case 6:
                    System.out.println(Message.enterOperations.getMessage());
                    break;
                case 7:
                    System.out.println(Message.sumInRubles.getMessage());
                    break;
                case 8:
                    System.out.println(Message.numberOfSeconds.getMessage());
                    break;
                case 9:
                    System.out.println(Message.numberOfHumans.getMessage());
                    break;
                case 10:
                    System.out.println(Message.mortality.getMessage());
                    break;
                case 11:
                    System.out.println(Message.fertility.getMessage());
                    break;
                case 12:
                    System.out.println(Message.termInMonth.getMessage());
                    break;
                case 13:
                    System.out.println(Message.stepOfProgression.getMessage());
                    break;
                case 14:
                    System.out.println(Message.startNumber.getMessage());
                    break;
                case 15:
                    System.out.println(Message.numberFactorial.getMessage());
                    break;
                case 16:
                    System.out.println(Message.numberOfRows.getMessage());
                    break;
                case 17:
                    System.out.println(Message.numberOfNumbers.getMessage());
                    break;
            }
            System.out.println(messageOfNumber);
            return scan.nextInt();
        }

        static int[] addArray() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите количество элементов массива: ");
            int b = scan.nextInt();
            int[] array = new int[b];
            for (int j = 0; j < b; j++) {
                System.out.println("Введите значение элемента " + j);
                array[j] = scan.nextInt();
            }
            return array;
        }

        static class Comparsions {
            static void xorCrypt(int number, int key) {
                int encrypt = number ^ key;
                int decrypt = encrypt ^ key;
                System.out.println("Зашифрованное число : " + Integer.toBinaryString(encrypt));
                int enter = InOut.enterNumber(2);

                if (enter == key) {
                    System.out.println("Дешифрованное число : " + Integer.toBinaryString(decrypt) + " это " + number + " в десятичной форме");
                } else {
                    System.out.println("Введите корректный ключ !");
                }
            }

            static void comparsionNum(int firstNumber, int secondNumber) {
                if (firstNumber == secondNumber) {
                    System.out.println("Числа равны.");
                } else if (firstNumber > secondNumber) {
                    System.out.println("Первое число больше второго.");
                } else {
                    System.out.println("Первое число меньше второго.");
                }
            }

            static void numForOneToTen(int number) {

                if (number < 10 && number > 5) {
                    System.out.println("Число больше 5 и меньше 10.");
                } else if (number > 0 && number <= 5) {
                    System.out.println("Число больше 0 и меньше 5.");
                } else System.out.println("Неизвестное число.");
            }

            static void num_2_or_9(int number) {

                if (number == 2 || number == 9) {
                    System.out.println("Число либо равно 2, либо равно 9.");
                } else {
                    System.out.println("Неизвестное число.");
                }
            }

            static void interestOnDeposit(double sum) {

                if (sum < 100) {
                    sum = sum + (sum * 0.05);
                    System.out.println("Сумма вклада с процентами : " + sum);
                } else if (sum >= 100 && sum <= 200) {
                    sum = sum + (sum * 0.07);
                    System.out.println("Сумма вклада с процентами : " + sum);
                } else if (sum > 200) {
                    sum = sum + (sum * 0.1);
                    System.out.println("Сумма вклада с процентами : " + sum);
                }
            }

            static void simpleCalculator(int firstNumber, int secondNumber, int operation) {

                switch (operation) {
                    case (1):
                        System.out.println("1.Сложение.");
                        System.out.println(firstNumber + secondNumber);
                        break;
                    case (2):
                        System.out.println("2.Вычитание.");
                        System.out.println(firstNumber - secondNumber);
                        break;
                    case (3):
                        System.out.println("3.Умножение.");
                        System.out.println(firstNumber * secondNumber);
                        break;
                    default:
                        System.out.println("Операция не определена.");
                }
            }

            static void rubToUsd(int sum) {

                double courseUsd = 75;
                double result = sum / courseUsd;
                double r1 = Math.round(result % 10);
                double r2 = Math.round(result % 100);
                String s = "";
                if ((r1 == 1) || (result == 1)) {
                    s = "Сними шляпу, это ж целый доллар!";
                } else if ((r1 >= 2) && (r1 <= 4)) {
                    s = "доллара";
                } else if ((r1 >= 5) && (r1 <= 9) || (r1 == 0) || (r2 >= 11)) {
                    s = "долларов";
                }
                System.out.printf("%.0f %s", result, s);
            }

            static void converterSeconds(int second) {

                int minutes = 0, hour = 0, day = 0, month = 0, year = 0;
                String totalSec = " ", totalMinutes = " ", totalHour = " ", totalDay = " ", totalMonth = " ", totalYear = " ";
                if (second > 60) {
                    minutes = second / 60;

                    if ((second % 60 == 1) || ((second % 60) % 10 == 1)) {
                        System.out.println((second % 60) + " секунда");
                        totalSec = " секунда";
                    } else if (((second % 60) >= 2) && ((second % 60) <= 4) || ((second % 60) % 10 >= 2) && ((second % 60) % 10 <= 4)) {
                        System.out.println((second % 60) + " секунды");
                        totalSec = " секунды";
                    } else if ((second % 60) >= 5) {
                        System.out.println((second % 60) + " секунд");
                        totalSec = " секунд";
                    }

                    if (minutes > 60) {
                        hour = minutes / 60;
                        if (hour == 1) {
                            totalHour = " час";
                        } else if (hour <= 4) {
                            totalHour = " часа";
                        } else {
                            totalHour = " часов";
                        }

                        if (minutes % 60 == 1) {
                            System.out.println((minutes % 60) + " минута");
                            totalMinutes = " минута";
                        } else if (((minutes % 60) >= 2) && ((minutes % 60) <= 4) || ((minutes % 60) % 10 >= 2) && ((minutes % 60) % 10 <= 4)) {
                            System.out.println((minutes % 60) + " минуты");
                            totalMinutes = " минуты";
                        } else if ((minutes % 60) >= 5) {
                            System.out.println((minutes % 60) + " минут");
                            totalMinutes = " минут";
                        }

                        if (hour > 24) {
                            day = hour / 24;
                            if (day == 1) {
                                totalDay = " день";
                            } else if (day <= 4) {
                                totalDay = " дня";
                            } else {
                                totalDay = " дней";
                            }
                            if ((hour % 24 == 1) || ((hour % 24) % 10 == 1)) {
                                System.out.println((hour % 24) + " час");
                                totalHour = " час";
                            } else if (((hour % 24) >= 2) && ((hour % 24) <= 4)) {
                                System.out.println((hour % 24) + " часа");
                                totalHour = " часа";
                            } else if ((hour % 24) >= 5) {
                                System.out.println((hour % 24) + " часов");
                                totalHour = " часов";
                            }
                            if (day > 30) {
                                month = day / 30;
                                if (month == 1) {
                                    totalMonth = " месяц";
                                } else if (month <= 4) {
                                    totalMonth = " месяца";
                                } else {
                                    totalMonth = " месяцев";
                                }

                                if (day % 30 == 1) {
                                    System.out.println((day % 30) + " день");
                                    totalDay = " день";
                                } else if (((day % 30) >= 2) && ((day % 30) <= 4) || ((day % 30) % 20 >= 2) && ((day % 30) % 20 <= 4)) {
                                    System.out.println((day % 30) + " дня");
                                    totalDay = " дня";
                                } else if ((day % 30) >= 5) {
                                    System.out.println((day % 30) + " дней");
                                    totalDay = " дней";
                                }
                                if (month > 12) {
                                    year = month / 12;
                                    if (year == 1) {
                                        totalYear = " год";
                                    } else if (year <= 4) {
                                        totalYear = " года";
                                    } else {
                                        totalYear = " лет";
                                    }
                                    if (month % 12 == 1) {
                                        System.out.println((month % 12) + " месяц");
                                        totalMonth = " месяц";
                                    } else if (((month % 12) >= 2) && ((month % 12) <= 4) || ((month % 12) % 10 >= 2) && ((month % 12) % 10 <= 4)) {
                                        System.out.println((month % 12) + " месяца");
                                        totalMonth = " месяца";
                                    } else if ((month % 12) >= 5) {
                                        System.out.println((month % 12) + " месяцев");
                                        totalMonth = " месяцев";
                                    }
                                    if ((year == 1) || (year % 10 == 1)) {
                                        System.out.println(year + " год");
                                        totalYear = " год";
                                    } else if (year <= 4 || year % 10 >= 2 && year % 10 <= 4) {
                                        System.out.println(year + " года");
                                        totalYear = " года";
                                    } else if (year % 10 >= 5) {
                                        System.out.println(year + " лет");
                                        totalYear = " лет";
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (second % 10 == 1) {
                        System.out.println(second + " секунда");
                        totalSec = " секунда";
                    } else if (((second % 10) >= 2) && ((second % 10) <= 4)) {
                        System.out.println(second + " секунды");
                        totalSec = " секунды";
                    } else if ((second % 10) >= 5) {
                        System.out.println(second + " секунд");
                        totalSec = " секунд";
                    }
                }
                // костыль для удаления вывода года, когда его значения нет, но переменная year принициализирована 0
                if (year == 0) {
                    System.out.println(second % 60 + totalSec + "," + minutes % 60 + totalMinutes + "," + hour % 24 + totalHour + "," + day % 30 + totalDay + "," + month % 12 + totalMonth);
                } else {
                    System.out.println(second % 60 + totalSec + "," + minutes % 60 + totalMinutes + "," + hour % 24 + totalHour + "," + day % 30 + totalDay + "," + month % 12 + totalMonth + "," + year + totalYear);
                }
            }

            static void numHuman(int numOfHuman, int fertility, int mortality) {

                int numHumanInYear, totalHuman = numOfHuman;
                for (int year = 10; year > 0; year--) {
                    numHumanInYear = numOfHuman + (fertility * (numOfHuman / 1000)) - (mortality * (numOfHuman / 1000));
                    totalHuman += numHumanInYear;
                }
                System.out.println("Кожаных мешков за 10 лет стало :" + totalHuman);
            }

            static void finalDeposit(float sum, int month) {

                for (int i = month; i > 0; i--) {
                    sum = sum + (sum * 7) / 100;
                    System.out.printf("%.6f \n", sum);
                }
                System.out.printf("%.6f", sum);
            }
        }

        static class Numbers {
            static void arithmeticProgression(int step, int startNum) {

                for (int i = 0; i < 20; i++) {
                    if (i != 0) {
                        startNum = startNum + step;
                    }
                    System.out.print(startNum + ",");
                }
            }

            static void factorial(int number) {

                long fact = 1;
                for (long i = 1; i <= number; i++) {
                    fact = fact * i;
                }
                System.out.println("Факториал числа " + number + " равен " + fact);
            }

            static void pascalTriangle(int n) {

                String str = "";
                for (int i = 0; i < n; i++) {
                    int number = 1;
                    System.out.printf("%" + (n - i) * 2 + "s", "");
                    for (int j = 0; j <= i; j++) {
                        System.out.printf("%4d" + "%s", number, str);
                        number = number * (i - j) / (j + 1);
                    }
                    System.out.println(" ");
                }
            }

            static void fibonacci(int n) {

                int a0 = 1;
                int a1 = 1;
                int a2;
                System.out.print(a0 + " " + a1 + " ");
                for (int i = 0; i < (n - 2); i++) {
                    a2 = a0 + a1;
                    System.out.print(a2 + " ");
                    a0 = a1;
                    a1 = a2;
                }
            }

            static void multiplicationTable() {
                for (int i = 1; i < 10; i++) {
                    System.out.println(" ");
                    for (int j = 1; j < 10; j++) {
                        int sum = i * j;
                        System.out.print(sum + " ");
                    }
                }
            }
        }

        static class Arrays {
            static void findFourInArray() {
                int[] num = InOut.addArray();
                int a = 0;
                for (int j : num) {
                    if (j == 4) {
                        a++;
                    }
                }
                System.out.println("Четверок найдено: " + a);
            }

            static void comparsionTwoArrays() {
                System.out.println("Первый массив");
                int[] num1 = InOut.addArray();
                System.out.println("Второй массив");
                int[] num2 = InOut.addArray();

                int sum = 0;

                for (int i = 0; i < num1.length; i++) {
                    for (int j = 0; j < num2.length; j++) {
                        if (num1[i] != num2[j]) {
                            sum++;
                        }
                    }
                    if (sum == num2.length) {
                        System.out.println(num1[i]);
                    }
                    sum = 0;
                }
            }

            static void evenNumInArray() {
                int[] num = InOut.addArray();
                for (int i = 0; i < num.length; i++) {
                    if ((num[i]) % 2 == 0) {
                        System.out.println(num[i]);
                    } else if (num[i] == 237) {
                        break;
                    }
                }
            }

            static void uniteTwoArrays() {

                System.out.println("Первый массив");
                int[] num1 = InOut.addArray();
                System.out.println("Второй массив");
                int[] num2 = InOut.addArray();

                int[] num3 = new int[num1.length + num2.length];

                for (int i = 0; i < num1.length; i++) {
                    num3[i] = num1[i];
                    num3[i + num1.length] = num2[i];
                }
                System.out.println(java.util.Arrays.toString(num3));
            }

            static void palindrome() {

                int[] nums = InOut.addArray();
                System.out.println(java.util.Arrays.toString(nums));
                boolean t = true;
                for (int i = 0; i < nums.length; i++)
                    if (nums[i] != nums[nums.length - i - 1]) {
                        t = false;
                    }
                System.out.println(t ? "Это полиндром " : " Это не полиндром");
            }

            static void minAndMaxInArrays() {
                int[] num = InOut.addArray();
                int max = num[0], min = num[0];
                for (int i = 0; i < num.length; i++) {
                    for (int j = 0; j < num.length; j++) {
                        if (max < num[j]) {
                            max = num[i];
                        } else if (min > num[j]) {
                            min = num[i];
                        }
                    }
                }
                System.out.println("Минимальное значение: " + min);
                System.out.println("Максимальное значение: " + max);
            }

            static void commonElementsOfArrays() {

                System.out.println("Первый массив");
                int[] num1 = InOut.addArray();
                System.out.println("Второй массив");
                int[] num2 = InOut.addArray();
                int[] num3 = new int[num1.length];
                int i = 0;
                for (; i < num1.length; i++) {
                    for (int e = 0; e < num2.length; e++) {
                        if (num1[i] == num2[e]) {
                            num3[i] = num2[e];
                        }
                    }
                }
                System.out.println(num3[i]);
            }

            static void arrayNumLessFive() {
                int[] num = InOut.addArray();
                for (int i = 0; i < num.length; i++) {
                    if (num[i] < 5) {
                        System.out.println(num[i]);
                    }
                }
            }
        }
    }
    enum Message{
        number("Введите число: "),
        key("Введите ключ: "),
        firstNumber("Введите первое число: "),
        secondNumber("Введите второе число: "),
        sumAmount("Введите сумму вклада: "),
        enterOperations("Введите операцию - 1.Сложение, 2.Вычитание, 3.Умножение;"),
        sumInRubles("Введите сумму в рублях и поплачьте: "),
        numberOfSeconds("Введите количество секунд: "),
        numberOfHumans("Введите количество кожаных мешков: "),
        mortality("Введите смертность: "),
        fertility("Введите рождаемость: "),
        termInMonth("Введите срок в месяцах: "),
        stepOfProgression("Введите шаг прогрессии: "),
        startNumber("Введите стартовое число: "),
        numberFactorial("Введите число для вычисления его факториала: "),
        numberOfRows("Введите число строк треугольника n : "),
        numberOfNumbers("Введите количество чисел: ");

        private String message;
        Message (String message){
            this.message = message;
        }
        public String getMessage(){
            return this.message;
        }
    }
}

