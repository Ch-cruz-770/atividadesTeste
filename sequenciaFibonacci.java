import java.util.Scanner;

public class sequenciaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para verificar se pertence a sequência fibonacci: ");
        int numero = scanner.nextInt();

        if (verificarFibonacci(numero)){
            System.out.println(numero + " pertence a sequência fibonacci.");
        } else {
            System.out.println(numero + " Não pertence a sequência fibonacci.");
        }
    }
    public static boolean verificarFibonacci(int numero) {
        int a = 0;
        int b = 1;

        if (numero == a || numero == b){
            return true;
        }
        int soma = a + b;
        while (soma >= numero) {

            if (soma == numero) {
                return true;
            }
            a = b;
            b = soma;
            soma = a + b;
        }
        return false;
    }
}
