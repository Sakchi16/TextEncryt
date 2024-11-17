import java.util.Scanner;

public class TextEncryption {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text to encrypt:");
        String plainText = scanner.nextLine();

        System.out.println("Enter the shift value:");
        int shift = scanner.nextInt();

        String encryptedText = encrypt(plainText, shift);

        System.out.println("Encrypted text: " + encryptedText);
    }

    public static String encrypt(String plainText, int shift) {
        StringBuilder encryptedText = new StringBuilder();

        for (char c : plainText.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                encryptedText.append((char) ((c - base + shift) % 26 + base));
            } else {
                encryptedText.append(c);
            }
        }

        return encryptedText.toString();
    }
}
