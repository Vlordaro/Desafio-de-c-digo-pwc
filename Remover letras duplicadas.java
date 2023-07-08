import java.util.Scanner;
public class remover {
    //Mátodo para remoção dos caracteres duplicados
    public static String duplicate(String input) {
        StringBuilder duplicateString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (duplicateString.indexOf(String.valueOf(c)) == -1) {
                duplicateString.append(c);
            }
        }
        return duplicateString.toString();
    }
    //Método main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    System.out.print("Digite uma frase: ");
        String input = scanner.nextLine();
        String removed = duplicate(input);
        System.out.println(removed);
        scanner.close();
    
}

}
