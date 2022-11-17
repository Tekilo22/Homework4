public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        int yearsOld = 24;
        if (yearsOld >= 18) {
            System.out.println("Поздравляем Вас с совершеннолетием!");
        }
        if (yearsOld < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно еще не много подождать!");
        }
        // Task 2
        System.out.println("Task 2");
        if (yearsOld >= 7 && yearsOld < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (yearsOld>=18 && yearsOld <24){
            System.out.println("Человек ходит в университет");
        }
        if (yearsOld>=24){
            System.out.println("Человек ходит на работу");
        }
        // Task 3
        System.out.println("Task 3");
        int capacity = 102;
        int seatCount =60;
        int standingCount = capacity - seatCount;

        int seatUsed = 59;
        int standingUsed = 41;
        if (seatUsed < seatCount){
            System.out.println("Есть еще" + (seatCount - seatUsed) + " сидячих мест");
        }
        if (standingUsed < standingCount){
            System.out.println("Есть еще" + (seatCount - seatUsed) + " стоячих мест");

        }
    }
}