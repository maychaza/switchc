package ada.prueba;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String nombre = scanner.nextLine();
        System.out.println("ingrese su edad");
        Integer edad = scanner.nextInt();

        System.out.println("bienvenidA a Java");

        while (edad <= 40) {
            System.out.println("la edad que pusiste es " + edad);
            break;
        }
        if (edad == 20) {
            System.out.println("pero esa no es tu edad ;) ");
        }

        switch (edad) {
            case 26:
                System.out.println("hello");
                break;
            default:
                System.out.println("minerva");
        }
    }
}