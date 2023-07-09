import java.util.Scanner;

public class palindromo {
    public static String maiorPalindroma(String palavra) {
        String maiorPalindroma = "";

        // Percorre todas as possíveis substrings
        for (int i = 0; i < palavra.length(); i++) {
            for (int j = i + 1; j <= palavra.length(); j++) {
                String substr = palavra.substring(i, j);
                if (isPalindroma(substr) && substr.length() > maiorPalindroma.length()) {
                    maiorPalindroma = substr;
                }
            }
        }

        return maiorPalindroma;
    }

    // Método auxiliar para verificar se uma string é palindrômica
    private static boolean isPalindroma(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    //Método main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra palindroma: ");
        String input = scanner.nextLine();
        String maiorPalindroma = maiorPalindroma(input);
        System.out.println("Maior palavra palindrômica: " + maiorPalindroma);

        scanner.close();
    }
}
