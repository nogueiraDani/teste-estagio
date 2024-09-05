import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase para verificar: ");
        String phrase = scanner.next();

        int count = 0;
        char[] newphrase = phrase.toLowerCase().toCharArray();

        for (Character c : newphrase) {
            if (c.equals('a') || c.equals('á') || c.equals('â') || c.equals('ã') || c.equals('à'))
                count++;
        }

        System.out.printf("A frase: \"%s\" contém %d letras 'a'.", phrase, count);

    }
}