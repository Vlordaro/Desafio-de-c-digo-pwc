import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class anagrama {
    
 public static boolean AnagramOfPalindrome(String word) {
        // Conta a frequência de cada caractere na palavra
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : word.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Verifica se no máximo um caractere tem frequência ímpar
        int oddCount = 0;
        for (int count : charCount.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
            if (oddCount > 1) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um anagrama: ");
        String word = scanner.nextLine();
        if (AnagramOfPalindrome(word)) {
            System.out.println(" true");
        } else {
            System.out.println("false");
            scanner.close();
        }
    }
}
