package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ------------
        System.out.println("Введите число от 1 до 9999");
        Scanner scanner = new Scanner(System.in);
        int numberIn = scanner.nextInt();
        int forWhile = numberIn;
        int thousands = 0;
        int hundreds = 0;
        int tens = 0;
        int units = 0;
        int count = 0;
        if(numberIn < 10000 && numberIn > 0){
            thousands += numberIn/1000;
            hundreds += (numberIn%1000)/100;
            tens += (numberIn%100)/10;
            units += numberIn%10;
        }else {
            System.out.println("Не правильный ввод");
        }
        do{
           forWhile /= 10;
           count++;
        }while (forWhile != 0);
        System.out.println("Ввод: "+numberIn+"\nвывод: "+thousands+"-тысячи, "+hundreds+"-сотни, "
        +tens+"-десятки, "+units+"-еденицы.\nВсего "+count+" знака.");
//        -----------
    }
}
