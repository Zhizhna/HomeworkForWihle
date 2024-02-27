public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Task 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Task 3");
        for (int i = 0; i <= 17; i += 2){
            System.out.println(i);
        }

        System.out.println("Task4");
        for (int i = 10; i >= (-10); i--){
            System.out.println(i);
        }

        System.out.println("Task 5");
        for (int year = 1904; year <= 2096; year += 4){
            System.out.println(year + " год является високосным");
        }

        System.out.println("Task 6");
        for (int i = 7; i <= 98; i += 7){
            System.out.println(i);
        }

        System.out.println("Task 7");
        for (int i = 1; i <= 512; i *= 2){
            System.out.println(i);
        }

        System.out.println("Task 8");
        int moneyGiven = 0;
        for (int month = 1; month <= 12; month++){
            moneyGiven += 29000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + moneyGiven + " рублей");
        }

        System.out.println("Task 9");
        int givenMoney = 0;
        for (int month = 1; month <= 12; month++) {
            givenMoney += 29000;
            givenMoney *= 1.01;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + givenMoney + " рублей");
        }

        System.out.println("Task 10");
        int c = 0;
        for (int b = 1; b <= 10; b++){
            c = 2 * b;
            System.out.println("2 * " + b +" = " +  c);
        }
    }
}