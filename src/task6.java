import java.util.Random;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int [10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i+1]){
                flag = false;
                break;
            }
        }

        if(flag)
            System.out.println("элементы расположены по возрастанию");
        else {
            System.out.println("элементы расположены не по возростанию");
        }
    }
}
