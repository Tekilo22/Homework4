public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Task 1");
        int yearsOld = 6;
        if (yearsOld >= 2 && yearsOld <=6) {
            System.out.println("Если возраст человека равен "+yearsOld+" , то ему нужно ходить в детский сад ");
        }else if (yearsOld > 6 && yearsOld <=18){
            System.out.println("Если возраст человека равен "+yearsOld+" , то ему нужно ходить в школу ");
        }else if (yearsOld > 18 && yearsOld <=24) {
            System.out.println("Если возраст человека равен " + yearsOld + " , то ему нужно ходить в университет ");
        }else if (yearsOld >24) {
            System.out.println("Если возраст человека равен " + yearsOld + " , то ему нужно ходить на работу ");
        }
        // Task 2
        System.out.println("Task 2");
        if (yearsOld < 5) {
            System.out.println("Ребенок не может кататься на атракционе");
        } else if (yearsOld < 14) {
            System.out.println("Ребенок может кататься на атракционе только в сопровождением взрослого");
        } else {
            System.out.println("Ребенок может кататься на атракционе");
        }

        // Task 3
        System.out.println("Task 3");
        int one = 4;
        int two = -5;
        int three = 101;
        if (one>two) {
            if (one>three) {
                System.out.println("Максимальное число - " + one);
            } else if (three>one) {
                System.out.println("Максимальное число - " + three);
            }else {
                System.out.println("Числа" +one+ " и " + three + "равны");
            }
        } else if (two>one) {
            if (two>three) {
                System.out.println("Максимальное число - " + two);
            } else if (three>two) {
                System.out.println("Максимальное число - " + three);
            }else {
                System.out.println("Числа" + two + " и " + three + "равны");
            }
            
        }else {
            if (one>three) {
                System.out.println("Максимальное число -" + one);
            }else if (three>one){
                System.out.println("Максимальное число -" + three);
            }else {
                System.out.println("Все числа равны");
            }
        }

    }
}