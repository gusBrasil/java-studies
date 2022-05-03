import java.util.Objects;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        System.out.print("Bem-vindo a sua nova calculadora! Escolha sua operação (1/2/3/4) ");
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (input == 1) {
            soma(a, b);
        } else if (input == 2) {
            subtrai(a, b);
        } else if (input == 3) {
            multiplica(a, b);
        } else if (input == 4) {
            divide(a, b);
        }


        sc.close();
    }

    public static void soma(int x, int y) {
        int z = x +y;
        System.out.println(z);
    }

    public static void subtrai(int x, int y) {
        int z = x - y;
        System.out.println(z);
    }

    public static void multiplica(int x, int y) {
        int z = x * y;
        System.out.println(z);
    }

    public static void divide(int x, int y) {
        int z = x / y;
        System.out.println(z);
    }
}
