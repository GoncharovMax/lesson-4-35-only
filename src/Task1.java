public class Task1 {
    public static void main(String[] args) {
        int[] arr = {48, -4, 8, 13, -192, 49, 5, 33, 0, -18 };
        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}