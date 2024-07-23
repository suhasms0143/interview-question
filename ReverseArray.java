public class ReverseArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 7, 6, 4, 9, 12 };

        // Reverse the array
        for (int t = 0; t < a.length / 2; t++) {
            int tmp = a[t];
            a[t] = a[a.length - t - 1];
            a[a.length - t - 1] = tmp;
        }

        // Print the reversed array
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
