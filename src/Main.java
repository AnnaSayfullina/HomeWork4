public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task41();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " ,то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperature = 4;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }

    public static void task4() {
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

    public static void task41() {
        System.out.println("Задача 4 второй способ");
        int age = 24;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно ходить в детский сад ");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно ходить в школу ");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно ходить в университет ");
        } else if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно быть с мамой ");
        } else {
            System.out.println("Если возраст человека равен " + age + ",то ему нужно ходить на работу ");
        }
    }

    public static void task5() {
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

    public static void task6() {
        System.out.println("Задача 6");
        int capacityWagon = 102;
        int sittingPlaces = 60;
        int standingPlaces = capacityWagon - sittingPlaces;
        int noFreeSittingPlaces = 60;
        int noFreeStandingPlaces = 42;
        int noFreePlaces = noFreeSittingPlaces + noFreeStandingPlaces;
        int freePlaces = capacityWagon - noFreePlaces;
        int freeSittingPlaces = sittingPlaces - noFreeSittingPlaces;
        int freeStandingPlaces = standingPlaces - noFreeStandingPlaces;

        if (freePlaces >= 1 && freePlaces <= 102) {
            System.out.println("Есть свободные места в вагоне");
        } else {
            System.out.println("Свободных мест нет");
        }
        if (freePlaces >= 1 && freePlaces <= 102 && freeSittingPlaces >= 1 && freeSittingPlaces <= 60) {
            System.out.println("Свободных сидячих мест " + freeSittingPlaces);
        }
        if (freePlaces >= 1 && freePlaces <= 102 && freeStandingPlaces >= 1 && freeStandingPlaces <= standingPlaces) {
            System.out.println("Свободных стоячих мест " + freeStandingPlaces);
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 9;
        int two = 5;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше, чем " + two + " и " + three);
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " больше, чем " + one + " и " + three);
        } else {
            System.out.println("Число " + three + " больше, чем " + one + " и " + two);
        }
    }
}