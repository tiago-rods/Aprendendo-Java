/*// Exercício: Análise de Notas
- Crie um array com 5 notas
- Calcule a média
- Encontre a maior e menor nota
- Conte quantas notas são >= 7.0 */
import java.util.Scanner;

public class loopsArrays {
    
    public static void main(String[] args){

        try (Scanner scanner = new Scanner(System.in)){

        //array com 5 espaços
        float[] notas = new float[5];
        float media = 0;
        float maior = Float.MIN_VALUE;
        float menor = Float.MAX_VALUE;

        int count = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextFloat();
            media += notas[i];
            if (notas[i] > maior) maior = notas[i];
            if (notas[i] < menor) menor = notas[i];
            if (notas[i] >= 7.0) count++;
        }
        
        media /= notas.length;

        System.out.println("Média: " + media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);
        System.out.println("Notas >= 7.0: " + count);
        
    }
}
}


