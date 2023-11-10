import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int [10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1,100);
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min)
                min = arr[i];
            if(arr[i]>max)
                max = arr[i];
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
