import java.util.Scanner;
import java.util.Random;

public class JogoAdivinOneToHundred {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random();

        //Número aleatório ente 1 e 100
        int numeroAleatorio = aleatorio.nextInt(100) + 1;
        int tentativas = 0;
        int maxTentativas = 10; //Limite de tentativas
        boolean adivinhou = false; //Uma variável booleana pode assumir apenas um de dois valores, ex: true or false

        System.out.println("""
                Bem vindo ao famoso jogo best seller de adivinhação AdivinOneToHundred!!! :D
                Seu Objetivo é adivinhar o número entre 1 e 100, escolhido aleatóriamente pela máquina!!! XD""");
        System.out.println("Você tem " + maxTentativas + " tentativas. Boa Sorte!!! ;)");

                while (tentativas < maxTentativas && !adivinhou) {
                    System.out.print("Digite seu palpite: ");
                    int palpite = ler.nextInt();
                    tentativas++;

                    if (palpite < numeroAleatorio) {
                        System.out.println("O número aleatório é maior que seu palpite. :/");
                        
                    } else if (palpite > numeroAleatorio) {
                        System.out.println("O número aleatório é menor que o seu palpite. :/");

                    } else {
                        adivinhou = true;
                        System.out.println("Você conseguiu!!! Adivinhou o número em " + tentativas + " tentativas. *O*"); 
                        System.out.println("Você é o rei da adivinhação!!!");

                    }
                }
                if (!adivinhou) {
                    System.out.println("Já era!!! Você não tem mais tentativas. O número aleatório era: " + numeroAleatorio + "! ;-;");
                    System.out.println("Mais sorte da próxima vez!!! ;)");

                }
                ler.close();
    }
}
