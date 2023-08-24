import java.util.Arrays;

public class SortArgs {
    public static void sort(String[] args) {
        int n = args.length;
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }

        Arrays.sort(numbers);

        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println(); // Print a new line at the end
    }
}
