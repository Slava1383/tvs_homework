package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strNameMonth = scanner.nextLine().toLowerCase();
        System.out.println("if - else");
        if (strNameMonth.equals("январь") || strNameMonth.equals("февраль") || strNameMonth.equals("декабрь")) {
            System.out.println("Сезон - Зима");
        } else if (strNameMonth.equals("март") || strNameMonth.equals("апрель") || strNameMonth.equals("май")) {
            System.out.println("Сезон - Весна");
        } else if (strNameMonth.equals("июнь") || strNameMonth.equals("июль") || strNameMonth.equals("август")) {
            System.out.println("Сезон - Лето");
        } else if (strNameMonth.equals("сентябрь") || strNameMonth.equals("октябрь") || strNameMonth.equals("ноябрь")) {
            System.out.println("Сезон - Осень");
        } else {
            System.out.println("Не корректные данные.");
        }
        System.out.println("swich");
        switch (strNameMonth){
            case "январь":
                System.out.println("Сезон - Зима");
                break;
            case "февраль":
                System.out.println("Сезон - Зима");
                break;
            case "декабрь":
                System.out.println("Сезон - Зима");
                break;
            case "март":
                System.out.println("Сезон - Весна");
                break;
            case "апрель":
                System.out.println("Сезон - Весна");
                break;
            case "май":
                System.out.println("Сезон - Весна");
                break;
            case "июнь":
                System.out.println("Сезон - Лето");
                break;
            case "июль":
                System.out.println("Сезон - Лето");
                break;
            case "август":
                System.out.println("Сезон - Лето");
                break;
            case "сентябрь":
                System.out.println("Сезон - Осень");
                break;
            case "октябрь":
                System.out.println("Сезон - Осень");
                break;
            case "ноябрь":
                System.out.println("Сезон - Осень");
                break;
            default:
                System.out.println("Не корректные данные.");
        }
    }
}
