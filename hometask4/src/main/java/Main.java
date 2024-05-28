import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 6, 2, 7, 3, 9, 5, 1, 3, 2, 9, 4, 9, 8};

//        >>------------------------------------------ 1.1
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println(sum/arr.length);

//        >>------------------------------------------ 1.2
//        int[] arrCopy = new int[arr.length];
//        for (int j = arr.length-1; j >= 0 ; j--) {
//            for (int i = 0; i < arr.length; i++){
//                arrCopy[i] = arr[j];
//            }
//            System.out.print(arrCopy[j]+" ");
//        }

//        >>------------------------------------------ 1.3
//        for (int i = 0; i < arr.length; i++){
//            for (int j = i + 1; j < arr.length; j++) {
//                if(arr[i] == arr[j]){
//                    System.out.println(arr[j]);
//                }
//            }
//        }

//        >>------------------------------------------ 2
//        Scanner scanner = new Scanner(System.in);
//        int userIn = scanner.nextInt();
//        int[] arrLength = new int[userIn];
//        arrLength[0] = 0;
//        arrLength[1] = 1;
//        for (int i = 2; i < arrLength.length; i++) {
//            arrLength[i] = (int)(Math.random() * 10);
//            arrLength[i] = arrLength[i - 1] + arrLength[i - 2];
//        }
//        System.out.println(Arrays.toString(arrLength));

//        >>------------------------------------------ 3*
//        int count = 0;
//        for (int i = 0; i < arr.length; i++){
//            for (int j = i + 1; j < arr.length; j++) {
//                if(arr[i] == arr[j]){
//                    count = arr[j];
//                }
//            }
//        }
//        System.out.println("Число "+count);
    }
}