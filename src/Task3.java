public class Task3 {
    public static void main(String[] args) {
        int[] arr = {48, -4, 8, 13, -192, 49, 5, 33, 0, -18 };
        int shortest = arr[0];
        int longest = arr[0];

        for (int num : arr) {
            int length = String.valueOf(Math.abs(num)).length(); // длина числа без минуса
            int short1 = String.valueOf(Math.abs(shortest)).length();
            int long1 = String.valueOf(Math.abs(longest)).length();

            if (length < short1) {
                shortest = num;
            }

            if (length > long1) {
                longest = num;
            }
        }

        System.out.println("Самое короткое число: " + shortest);
        System.out.println("Самое длинное число: " + longest);
    }
}
