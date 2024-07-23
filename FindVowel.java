public class FindVowel {
    public static void main(String[] args) {
        int vowels = 0;
        int consonants = 0;
        String str = "Example String with some Vowels and Consonants"; // Define the input string

        for (int k = 0; k < str.length(); k++) {
            char c = str.charAt(k);
            // Check if the character is a vowel (considering both lowercase and uppercase)
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                vowels++;
            }
            // Check if the character is a letter and not a vowel
            else if (Character.isLetter(c)) {
                consonants++;
            }
        }
        System.out.println("Vowels count is " + vowels);
        System.out.println("Consonants count is " + consonants);
    }
}
