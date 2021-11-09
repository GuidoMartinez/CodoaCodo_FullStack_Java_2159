/*                      Enunciado del ejercicio
 * Crear un programa en java en el cual se pida al usuario ingresar su nombre,
 * apellido, edad, hobbie, editor de código preferido, sistema operativo que
 * utiliza, luego deberá mostrarse por consola los datos ingresados.
 */

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese su nombre:");
    String nombre = scanner.nextLine();

    System.out.println("Ingrese su apellido:");
    String apellido = scanner.nextLine();

    System.out.println("Ingrese su edad:");
    String edad = scanner.nextLine();

    System.out.println("Ingrese su hobbie:");
    String hobbie = scanner.nextLine();

    System.out.println("Ingrese su editor de codigo preferido:");
    String ide = scanner.nextLine();

    System.out.println("Ingrese el sistema operativo que utiliza normalmente:");
    String so = scanner.nextLine();

    System.out.println("Nombre: " + nombre + "\n Apellido: " + apellido
                        + "\n Edad " + edad + "\n Hobbie: " + hobbie
                        + "\n Editor de codigo preferido: " + ide
                        + "\n Sistema operativo que utiliza: " + so);
  }
}
