public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i=1;
        while (total < 2_459_000) {
            total = total + salary;
            System.out.println("Месяц "+i+", сумма накоплений равна " + total + " рублей");
            i++;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int number=1;
        while (number<=10){
            System.out.print(number + " ");
            number++;
        }
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int people=12_000_000;// изначальное кол-во людей
        int birthRate=17;// рождаемость на 1000чел
        int mortalityRate=8;// смертность на 1000 чел
        int i=1;
        int population= (birthRate-mortalityRate)*people/1000;// прирост населения за 1 год
        while (i<=10) {
         people = people + population;
            System.out.println("Год " + i +", численность населения составляет " + people );
            i++;
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deposit=15000;
        double total=0;
        for (int i= 1; total<12_000_000 ; i=i+1) {
            total= total+total*0.07;
            total=total+deposit;
            System.out.println("Месяц "+i+", сумма накоплений равна " + (int)total+ " рублей");

        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int deposit = 15000;
        double total = 0;
        for (int i = 1; total < 12_000_000; i = i + 1) {
            total = total + total * 0.07;
            total = total + deposit;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + (int) total + " рублей");
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int deposit = 15000;
        double total = 0;
        for (int i = 1; i<=108; i = i + 1) { //108- количество месяцев в 9 годах
            total = total + total * 0.07;
            total = total + deposit;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + (int) total + " рублей");
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int friday=3;// номер первой пятницы месяца
        for (; friday<=31; friday = friday + 7) {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int history=1823;// 200 лет до
        int future = 2123; // 100 лет после
        for (int i = 0; i <=future ; i = i + 79) {
            if (i>=history){
                System.out.println(i);
            }
        }
    }
   }