import java.util.Scanner;

public class VerificaNota {
    public static void main(String[] args) {
        // Peça ao usuário para inserir a média final do aluno
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a média final do aluno: ");
        double media = scanner.nextDouble();

        // Verifique se o aluno foi aprovado, reprovado ou está em recuperação
        String resultado;
        if (media >= 7) {
            resultado = "Aprovado";
        } else if (media >= 5 && media < 7) {
            resultado = "Recuperação";
        } else {
            resultado = "Reprovado";
        }

        // Imprima uma mensagem informando o resultado
        System.out.println("O aluno foi " + resultado + "!");
    }
}