import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int [10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0,10);
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        int nul = -1;
        for(int temp: arr)
            if (temp == 0) nul++;
        if(nul == -1) {
            System.out.println("нет нулей");
            return;
        }
        System.out.println("в массиве "+ ++nul + " нулей");
    }
}
