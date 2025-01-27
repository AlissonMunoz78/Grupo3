//Se importa esta libreria para que capture cuando el usuario ingresa un texto en lugar de un número
import java.util.InputMismatchException;
//Ingreso de datos usando scanner
import java.util.Scanner;

//Definir la clase principal
public class Main {
    public static void main(String[] args) {

        //Crear una instancia de la clase EJ5
        EJ5 golpeo = new EJ5();
        //Crear una instancia
        Scanner scanner = new Scanner(System.in);

        //Ingreso de la distancia con datos por teclado

        //se usa try y catch para excepciones en caso de ingresar datos incorrectos
        try {
            System.out.print("Ingrese la distancia a la portería en metros: ");
            double distancia = scanner.nextDouble();
            if (distancia <= 0) {
                System.out.println("Error! La distancia debe ser mayor o igual a cero.");
                return;  //El programa termina cuando el usuario ingresa una distancia negativa o cero
            }
            golpeo.setDistancia(distancia);
        } catch (InputMismatchException e) {
            System.out.println("Error! La distancia que ha ingresado no es válida.");
            return;
        }

        //Ingreso del ángulo con datos ingresados por teclado
        try {
            System.out.print("Ingrese el ángulo de lanzamiento en grados: ");
            double angulo = scanner.nextDouble();
            if (angulo <= 0 || angulo >= 90) {
                System.out.println("Error! El ángulo debe estar entre 0 y 90 grados (no incluye el cero).");
                return; //termina el programa si el ángulo es inválido
            }
            golpeo.setAngulo(angulo);
        } catch (InputMismatchException e) {         //en caso de que el usuario ingrese un dato erroneo
            System.out.println("Error! Debe ingresar un número válido para el ángulo.");
            return;
        }

        //Ingreso del tiempo en s con datos ingresados por teclado.
        try {
            System.out.print("Ingrese el tiempo en segundos para que el balón llegue: ");
            double tiempo = scanner.nextDouble();
            if (tiempo <= 0) {
                System.out.println("Error! El tiempo debe ser un número mayor o igual a cero.");
                return; //termina el programa si no se cumple la condicion anterior
            }
            golpeo.setTiempo(tiempo);
        } catch (InputMismatchException e) {
            System.out.println("Error! El valor que ha ingresado no es válido.");
            return;
        }

        //Calcular la velocidad necesaria. Llamar al metodo personalizado.
        double velocidadRequerida = golpeo.calcularVelocidad();

        // Mostrar los valores ingresados y el resultado
        System.out.printf("Distancia: %.2f metros%n", golpeo.getDistancia()"metros.");    //obtener la informacion de la distancia usando get
        System.out.printf("Ángulo: %.2f grados%n", golpeo.getAngulo())"grados";       //obtener la informacion de los grados usando get
        System.out.printf("Tiempo: %.2f segundos%n", golpeo.getTiempo()), "segundos";   //obtener la informacion del tiempo usando get
        //Mostrar resultado con 2 decimales usando printf
        System.out.printf("La velocidad necesaria para que el balón entre en la portería es: %.2f", velocidadRequerida, "m/s.");

        //Cerrar el scanner
        scanner.close();
    }
}
