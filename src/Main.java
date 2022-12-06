public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task41();
        task5();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " ,то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int temperature = 4;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int age = 25;
        boolean needToGoToKindergarten = age >= 2 && age <= 6;
        if (needToGoToKindergarten) {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно ходить в детский сад ");
        }
        boolean needToGoToSchool = age >= 7 && age <= 18;
        if (needToGoToSchool) {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно ходить в школу ");
        }
        boolean needToGoToUniversity = age > 18 && age < 24;
        if (needToGoToUniversity) {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно ходить в университет ");
        }
        boolean needToGoToWork = age >= 24;
        if (needToGoToWork) {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно ходить на работу ");
        }
    }
    public static void task41 () {
        System.out.println("Задача 4 второй способ");
        int age = 24;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно ходить в детский сад ");
        }
        else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно ходить в школу ");
        }
        else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно ходить в университет ");
        }
        else if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно быть с мамой ");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно ходить на работу ");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int age = 14;
        boolean canNotRideTheAttraction = age < 5;
        if (canNotRideTheAttraction) {
            System.out.println("Если возраст ребенка равен " + age + ",то ему нельзя кататься на аттракционе");
        }
        boolean canRideTheAttractionWithAnAdult = age > 5 && age < 14;
        if (canRideTheAttractionWithAnAdult) {
            System.out.println("Если возраст ребенка равен " + age + ",то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        boolean canRideTheAttractionWithoutAnAdult = age >= 14;
        if (canRideTheAttractionWithoutAnAdult) {
            System.out.println("Если возраст ребенка равен " + age + ",то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }
}