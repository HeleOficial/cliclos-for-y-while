import java.util.Scanner;

public class CicloFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad, estadoCivil, estatura, sexo;
        int contadorPersonas = 0;
        int acumuladorEdad = 0, acumuladorEstatura = 0;
        int cantidadPersonas = 2;

        for (int numeroPersona = 1; numeroPersona <= cantidadPersonas; numeroPersona++) {
            System.out.println("Ingrese la edad de la persona " + numeroPersona);
            edad = scanner.nextInt();

            System.out.println("Ingrese el estado civil de la persona " + numeroPersona + " (1. Soltero, 2. Casado)");
            estadoCivil = scanner.nextInt();

            System.out.println("Ingrese la altura de la persona " + numeroPersona + " en cm");
            estatura = scanner.nextInt();

            System.out.println("Ingrese el sexo de la persona " + numeroPersona + " (1. Hombre, 2. Mujer)");
            sexo = scanner.nextInt();

            if (edad > 18 && estadoCivil == 1 && estatura > 170 && sexo == 1) {
                contadorPersonas++;
                acumuladorEdad += edad;
                acumuladorEstatura += estatura;
            }
        }

        if (contadorPersonas > 0) {
            double promedioEdad = acumuladorEdad / (double) contadorPersonas;
            double promedioEstatura = acumuladorEstatura / (double) contadorPersonas;
            double porcentajePersonas = (contadorPersonas / (double) cantidadPersonas) * 100;

            System.out.println("El promedio de edad de las personas que cumplen es: " + promedioEdad + " años");
            System.out.println("El promedio de estatura de las personas que cumplen es: " + promedioEstatura + " centímetros");
            System.out.println("El porcentaje de las personas que cumplen con la condición es del: " + porcentajePersonas + " %");
        } else {
            System.out.println("Ninguna persona cumple con las condiciones.");
        }

        scanner.close();
    }
}
