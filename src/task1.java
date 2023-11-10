import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int [10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1,100);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
