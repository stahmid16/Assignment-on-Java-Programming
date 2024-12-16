public class count_word_char_without_space_vowel_consonant {
    public static void main(String[] args) {

        String input ="I am a SQA Engineer";

        String[] words = input.split("\\s+");
        int wordCount = words.length;

        int charCount = 0;
        for (char c : input.toCharArray()) {
            if (c != ' ') {
                charCount++;
            }
        }
        int vowelCount = 0;
        int consonantCount = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        System.out.println("Words: " + wordCount);
        System.out.println("Chars: " + charCount);
        System.out.println("Vowel: " + vowelCount);
        System.out.println("Consonant: " + consonantCount);

    }
}
