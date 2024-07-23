public class FindCount {
    public static void main(String args[]) {
        int count = 0;
        char search = 'z';
        String input = "example string with some as"; // Define the input string
        int length = input.length(); // Get the length of the input string

        for (int i = 0; i < length; i++) {
            if (input.charAt(i) == search) { // Compare characters of input string
                count++;
            }
        }
        System.out.println(count);
    }
}
