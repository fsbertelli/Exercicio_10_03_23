import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[5];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Digite o nome %d/5: \n", i + 1);
            array[i] = input.next();
        }
        System.out.printf("Nomes digitados: %s\n", Arrays.toString(array));
        System.out.printf("Digite um nome: \n");
        String verifica;
        verifica = input.next();
        int i = 0;
        while (!verifica.contains(array[i])) {
            i = i + 1;
            if (verifica.contains(array[i])) {
                System.out.printf("O nome %s esta contido na posicao %d", verifica, i);
            }
            if (i == array.length - 1) {
                if (!verifica.contains(array[i])) {
                    System.out.printf("O nome %s não esta contido no array", verifica);
                    break;
                }
            }
        }
    }
}
