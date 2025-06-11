import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int n =5;
        int[] arr = new int[n];
        Random random = new Random();
        for (int i=0; i<n;i++){
            arr[i] = random.nextInt(10);
            arr[i] = (int) Math.pow(arr[i], 2);
        }

        System.out.println(Arrays.toString(arr));
    }
}
