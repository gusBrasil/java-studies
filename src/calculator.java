import java.util.Objects;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        System.out.println("Bem-vindo a sua nova calculadora!");
        Scanner sc = new Scanner(System.in);

        String input;

        int a = sc.nextInt();
        int b = sc.nextInt();

        input = sc.next("Deseja realizar uma soma, subtração, multiplicação ou divisão? ");
        if (Objects.equals(input, "soma")) {
            soma(a, b);
        }


        sc.close();
    }

    public static int soma(int x, int y) {
        System.out.println(x + y);
    }
}
