import java.util.Scanner;

public class bauti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();
        System.out.println("La resta es: " + (a - b));
        sc.close();
    }
}