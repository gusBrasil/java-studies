import java.util.Objects;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        System.out.print("Bem-vindo a sua nova calculadora!");
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
}
