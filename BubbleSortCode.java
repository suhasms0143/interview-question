public class BubbleSortCode {
    public static void main(String[] args) {
        int[] a = { 1, 2, 7, 6, 4, 9, 12 };

        for (int k = 0; k < a.length - 1; k++) { // Correct outer loop boundary
            for (int l = 0; l < a.length - k - 1; l++) { // Correct inner loop boundary
                if (a[l] > a[l + 1]) {
                    // Swap elements
                    int t = a[l];
                    a[l] = a[l + 1];
                    a[l + 1] = t;
                }
            }
        }

        // Print sorted array
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
