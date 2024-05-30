import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(101);
        int tentativas = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adivinhe o número entre 0 e 100. Você tem 5 tentativas.");

        while (tentativas < 5) {
            System.out.print("Digite seu palpite: ");
            int numeroUsuario = scanner.nextInt();
            tentativas++;

            if (numeroUsuario == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
                break;
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("O número é maior. Tente novamente.");
            } else {
                System.out.println("O número é menor. Tente novamente.");
            }

            if (tentativas == 5) {
                System.out.println("Você excedeu o número de tentativas. O número era " + numeroAleatorio + ".");
            }
        }

        scanner.close();
    }
}