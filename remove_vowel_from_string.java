public class remove_vowel_from_string {
    public static void main(String[] args) {
        String input = "I am a SQA Engineer";
        char[] inputArray = input.toCharArray();
        String result = "";
        for (int i = 0; i < inputArray.length; i++) {
            char ch = inputArray[i];

            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                    ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                result += ch;
            }
            }
        System.out.println("Without vowel: " + result);

    }

}
