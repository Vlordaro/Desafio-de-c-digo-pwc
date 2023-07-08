public class Inverter {
    //método para reverter a ordem das palavras
    public static String reverseOrderOfWords(String input) {
        String[] words = input.split(" ");
        StringBuilder reverseString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reverseString.append(words[i]).append(" ");
        }

        return reverseString.toString().trim();
    }

//Método Main
    public static void main(String[] args) {
        String input = "Hello, World! OpenAI is amazing.";
        String reversed = reverseOrderOfWords(input);
        System.out.println(reversed);
    }
}
