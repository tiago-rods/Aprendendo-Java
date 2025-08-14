
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TesteES
{
    public static void main(String[] args) throws Exception
    {
        InputStreamReader stream = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(stream);
        System.out.print("Informe uma string ");
        String teste = in.readLine();
        System.out.println("A String lida foi:" + teste);
        System.out.println("Informe um inteiro: ");
        int numero = Integer.parseInt(in.readLine());
        System.out.println("O inteiro lido foi:" + numero);
        System.out.println("Informe um double: ");
        double decimal = Double.parseDouble(in.readLine());
        System.out.println("O double lido foi:" + decimal);
        System.out.println("Informe um boolean: ");
        boolean bool = Boolean.parseBoolean(in.readLine());
        System.out.println("O boolean lido foi:" + bool);

    }
}