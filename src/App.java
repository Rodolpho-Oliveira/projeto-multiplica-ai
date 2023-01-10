import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
            System.out.println("Digite um número");
            String number = reader.readLine();

            System.out.println("Tabela de multiplicação de " + number);
            for(int i = 1; i <= 10; i++) {
                System.out.println(i + " X " + number + " = " + Integer.parseInt(number) * i);
            }
    }
}
