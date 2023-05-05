import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = scanner.nextInt();

        Integer num1 = num;

        System.out.println("Você digitou = " + num1);

        scanner.close();
    }
}
