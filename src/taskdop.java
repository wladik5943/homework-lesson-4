import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class taskdop {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        int[] arr = new int [n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("a[" + i + "]= ");
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        if(arr[arr.length - 1] == 9){
            arr[arr.length - 1] = 0;
           for(int i = arr.length - 2; i>=0;i--){
               if(arr[i] != 9){
                   arr[i]++;
                   break;
               }
               else {
                   arr[i] = 0;
               }
           }
           if(arr[0] == 0){
               int[] b = new int [n + 1];
               b[0] = 1;
               for (int i = 1; i < b.length; i++) {
                   b[i] = 0;
               }
               System.out.println(Arrays.toString(b));
           }
           else{
               System.out.println(Arrays.toString(arr));
           }
        }
        else {
            arr[arr.length - 1]++;
            System.out.println(Arrays.toString(arr));
        }

    }
}
