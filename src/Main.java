public class Main {
    public static void main (String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();

    }

    public static void task1 () {
        // Задача 1. Узнать наступил ли возраст совершеннолетия.
        String str = "Если возраст человека %d лет, то он %s достиг совершеннолетия\n";
        byte age = 44;
        String negation;
        if (age < 18) {
            negation = "не";
        } else {
            negation = "";
        }
        System.out.printf(str, age, negation);
    }

    public static void task2 () {
        // Задача 2. Как одеться по погоде.
        String str = "На улице %s (%s градуса), %s.\n";
        byte airTemperature = 3;
        String weather;
        String cloth;
        if (airTemperature <= 5) {
            weather = "холодно";
            cloth = "нужно одеть шапку";
        } else {
            weather = "тепло";
            cloth = "можно идти без шапки";
        }
        System.out.printf(str, weather, airTemperature, cloth);
    }

    public static void task3 () {
        // Задача 3. За превышение скорости - штраф.
        String str = "Ваша скорость %d, %s.\n";
        byte speed = 52;
        String overSpeed;
        if (speed > 60) {
            overSpeed = "Вы привышаете скорость, придется заплатить штраф";
        } else {
            overSpeed = "можете ездить спокойно";
        }
        System.out.printf(str, speed, overSpeed);
    }

    public static void task4 () {
        // Задача 4. Нужное учреждение в зависимости от возраста.
        String str = "Если возраст человека %d лет, то ему нужно ходить %s\n";
        byte age = 5;
        String institution;
        if (age <2) {
            institution = "везде с мамой";
        } else if (age >= 2 && age <= 6) {
            institution = "в детский сад";
        } else if (age >= 7 && age <= 17) {
            institution = "в школу";
        } else if (age >= 18 && age <= 24) {
            institution = "в университет";
        } else {
            institution = "на работу";
        }
        System.out.printf(str, age, institution);
    }

    public static void task5 () {
        // Задача 5. Ограничения по возрасту на аттракционах.
        String str = "Если возраст ребенка равен %d, то ему %s\n";
        byte age = 4;
        String permission;
        if (age <= 5) {
            permission = "нельзя кататься на аттракционах.";
        } else if (age >= 5 && age <14){
            permission = "можно кататься на аттракционах только в сопровождении взрослого.";
        } else {
            permission = "можно кататься на аттракционах без сопровождения взрослого.";
        }
        System.out.printf(str, age, permission);
    }

    public static void task6 () {
        //Сколько мест в вагоне?
        byte passengers = 105;
        byte carriageCapacity = 102;
        byte seat = 60;
        if (passengers <= seat) {
            System.out.println("В вагоне осталось " + (seat - passengers) + " сидячих мест.");
        } else if (passengers > 60 && passengers <= carriageCapacity) {
            System.out.println("В вагоне осталось " + (carriageCapacity - passengers) + " стоячих мест.");
        } else {
            System.out.println("В вагоне нет мест.");
        }
    }

    public static void task7 () {
        // Какое число больше?
        int one = 11;
        int two = 22;
        int three = 33;
        if (one == two && one == three) {
            System.out.println("Числа равны");
        } else if (one > two && one > three) {
            System.out.println(one + " самаое большое число.");
        } else if (two > one && two > three) {
            System.out.println(two + " самаое большое число.");
        } else {
            System.out.println(three + " самаое большое число.");
        }
    }

}