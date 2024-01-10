// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
//Version 1.0
public class Main {
    public static void main(String[] args) {
        Perritos perro = new Perritos();
        Persona p = new Persona();
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la raza del perro ");
        perro.setRaza(sc.nextLine() );
        System.out.println("Escribe tu nombre: ");
        p.setNombre( sc.nextLine() );
        System.out.println("Escribe tus apellidos: ");
        p.setApellidos( sc.nextLine() );
        System.out.println("Escribe tu dni sin letra: ");
        p.setDnisinletra(sc.nextInt() );
        System.out.println("Escribe tu edad: ");
        p.setEdad(sc.nextInt() );
        //Mostramos los cambios
        System.out.print("Buenos días: " + p.getNombre());
        System.out.print(" " + p.getApellidos() + " con dni: " + p.getDnisinletra());
        System.out.println(" y edad: " + p.getEdad() );
        System.out.println(" Y tu perro es de raza: "+ perro.getRaza());
    }
}