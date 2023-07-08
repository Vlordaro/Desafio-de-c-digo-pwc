import java.util.Scanner;
public class maiuscula {
    //Método para deixar cada palavra maiuscula 
    public static String capitalize(String input) {
        if (input == null || input.length() == 0) return input;
        
        StringBuilder result = new StringBuilder();
        String[] words = input.split(" ");
        
        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1));
                result.append(" ");
            }
        }
        
        return result.toString().trim();
    }
    
public static void main(String args[])  {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite uma frase: ");
        String input = scanner.nextLine();
        String uppercase = capitalize(input);
        System.out.println(uppercase);
        scanner.close();
    } 

}
