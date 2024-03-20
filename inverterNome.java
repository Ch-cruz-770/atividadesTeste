import java.util.Scanner;

public class inverterNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String entrada = scanner.nextLine();

        String invertida = inverterString(entrada);
        System.out.println("Nome invertido: " + invertida);
    }

    public static String inverterString(String str){
        StringBuilder builder = new StringBuilder();

        for (int i = str.length() - 1; i >= 0 ; i--) {
            builder.append(str.charAt(i));
        }
        return builder.toString();
    }
}