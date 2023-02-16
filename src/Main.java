public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача1");
        int age = 50;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " , он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача2");
        int temperature = -10;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача3");
        int speed = 100;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача4");
        int age = 24;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age >= 19 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Еcли возраст человека равен " + age + ", то он должен ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задача5");
        int age = 13;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (age >= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься на аттракционе без сопровождения взрослого");
        }
    }

    static public void task6() {
        System.out.println("Задача6");
        int totalSeats = 102;
        int seating = 60;
        int standingPlaces = totalSeats - seating;

        int totalPerson = 100;
        if (totalPerson < 60) {
            System.out.println("В вагоне есть свободные сидячие места");
        } else if (totalPerson > 60 && totalPerson <= 102) {
            System.out.println("В вагоне есть свободные стоячие места");
        } else if (totalPerson > 102) {
            System.out.println("Вагон уже полностью забит");
        }
    }

    public static void task7() {
        System.out.println("Задача7");
        int one = 100;
        int two = 200;
        int three = 10;
        if (one > two) {
            if (one >= three) {
                System.out.println("Максимальное число " + one);
            } else {
                System.out.println("Максимальное число " + three);
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("Максимальное число " + two);
            } else {
                System.out.println("Максимальное число " + three);
            }
        } else {
            if (one > three) {
                System.out.println("Максимальное число " + one);
            } else if (three > one) {
                System.out.println("Максимальное число " + three);
            } else {
                System.out.println("Все 3 числа равны");
            }
        }
    }
}