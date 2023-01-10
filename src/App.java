import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Digite o número que você deseja saber a tabela de multiplicação:");
        int userNumber = number.nextInt();

        System.out.println("Tabela de multiplicação de " + userNumber + ":");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(userNumber + " * " + i + " = " + userNumber*i);
        }

        number.close();
    }
}
