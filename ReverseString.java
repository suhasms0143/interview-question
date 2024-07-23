public class ReverseString {
    public static void main(String[] args) {
        String str = "aaaaa";
        String reverse = " ";
        int length = str.length();
        for (int i = 0; i < length; i++) {
            reverse = str.charAt(i) + reverse;
        }
        System.out.println(reverse);
        if (str.equals(reverse)) {
            System.out.println("palindram");
        } else {
            System.out.println("not a palindram");
        }

    }

}
