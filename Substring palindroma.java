import java.util.ArrayList;
import java.util.List;
public class palindromo {
 public static List<String> substringsPalindromicas(String palavra) {
        List<String> palindromas = new ArrayList<>();

        // Percorre todas as possíveis substrings
        for (int i = 0; i < palavra.length(); i++) {
            for (int j = i + 1; j <= palavra.length(); j++) {
                String substr = palavra.substring(i, j);
                if (isPalindroma(substr)) {
                    palindromas.add(substr);
                }
            }
        }

        return palindromas;
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
        String palavra = "babad";
        List<String> palindromas = substringsPalindromicas(palavra);
        System.out.println("Substrings palindrômicas:");
        for (String palindroma : palindromas) {
            System.out.println(palindroma);
        }
    }
}
