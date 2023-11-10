import java.util.Random;

public class task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int [10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0,10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int j =arr.length -1;
        for (int i = 0; i < j; i++,j--) {
            int cache;
            cache = arr[i];
            arr[i] = arr[j];
            arr[j] = cache;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
