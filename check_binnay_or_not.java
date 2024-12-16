import java.util.Scanner;

public class check_binnay_or_not {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for check binary or not");
        String input = scanner.nextLine();

        boolean isBinary = true;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != '0' && c != '1') {
                isBinary = false;
                break;
            }
        }

        System.out.println(isBinary);
    }
}
