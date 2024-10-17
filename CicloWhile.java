import java.util.Scanner;

public class CicloWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroEntrada, resultado = 0, control = 0;

        System.out.println("Ingrese el número que desea calcular");
        numeroEntrada = scanner.nextInt();

        while (control <= numeroEntrada) {
            resultado += control;
            control++;
        }

        System.out.println("La suma de los primeros " + numeroEntrada + " números naturales es igual a " + resultado);

        scanner.close();
    }
}
