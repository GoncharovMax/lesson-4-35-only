public class Task2 {
    public static void main(String[] args) {
        int[] arr = {48, -4, 8, 13, -192, 49, 5, 33, 0, -18 };

        System.out.print("Чётные числа : ");
        for (int num : arr ) {
            if (num %2 == 0){
                System.out.print(num + " ");
            }
        }
        System.out.print("\nНечётные числа : ");
        for (int num : arr) {
            if (num %2 != 0){
                System.out.print(num + " ");
            }
        }
    }
}
