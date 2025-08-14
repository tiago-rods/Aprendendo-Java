import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

        System.out.println("Digite seu peso kg");
        float peso = scanner.nextFloat();

        System.out.println("Digite sua altura em metros ");
        float altura = scanner.nextFloat();

        float calculoIMC = peso / (altura * altura);

        System.out.println("Seu IMC é " + calculoIMC);

        if (calculoIMC < 18.5) {
            System.out.println("Voce esta abaixo do peso");

        }
        else if (calculoIMC < 24.9){
            System.out.print("Voce esta dentro de um peso normal");

        }
        else {
            System.out.println("Voce esta acima do peso");
        }
    }
}
}
